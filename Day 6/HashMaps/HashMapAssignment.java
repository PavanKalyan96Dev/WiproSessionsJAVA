package com.HashMap;
import java.util.*;

// Employee class
class Employee {
    int id;
    String name;
    String department;

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}

// Task class
class Task implements Comparable<Task> {
    int taskId;
    String description;
    String priority;
    String status;

    public Task(int taskId, String description, String priority, String status) {
        this.taskId = taskId;
        this.description = description;
        this.priority = priority;
        this.status = status;
    }

    @Override
    public int compareTo(Task other) {
        // Higher priority comes first (High > Medium > Low)
        return getPriorityValue(this.priority) - getPriorityValue(other.priority);
    }

    private int getPriorityValue(String priority) {
        switch (priority.toLowerCase()) {
            case "high":
                return 1;
            case "medium":
                return 2;
            case "low":
                return 3;
            default:
                return Integer.MAX_VALUE; // Default for unknown priority
        }
    }

    @Override
    public String toString() {
        return "Task{" +
                "taskId=" + taskId +
                ", description='" + description + '\'' +
                ", priority='" + priority + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}

public class HashMapAssignment {

    private static Map<Integer, Employee> employees = new HashMap<>();
    private static Map<Integer, List<Task>> tasks = new HashMap<>();
    private static PriorityQueue<Task> priorityQueue = new PriorityQueue<>();
    private static LinkedList<Task> pendingTasks = new LinkedList<>();

    // Add an employee
    public static void addEmployee(int id, String name, String department) {
        employees.put(id, new Employee(id, name, department));
    }

    // Assign a task to an employee
    public static void assignTask(int employeeId, int taskId, String description, String priority) {
        Task task = new Task(taskId, description, priority, "Pending");

        // Add task to employee's list
        tasks.putIfAbsent(employeeId, new ArrayList<>());
        tasks.get(employeeId).add(task);

        // Add task to the priority queue and pending tasks
        priorityQueue.add(task);
        pendingTasks.add(task);
    }

    // Retrieve tasks by priority
    public static Task getNextTaskByPriority() {
        return priorityQueue.poll(); // Retrieves and removes the highest-priority task
    }

    // Retrieve tasks by employee name or department
    public static List<Task> getTasksByEmployeeOrDepartment(String nameOrDepartment) {
        List<Task> result = new ArrayList<>();
        for (Map.Entry<Integer, List<Task>> entry : tasks.entrySet()) {
            Employee emp = employees.get(entry.getKey());
            if (emp.name.equalsIgnoreCase(nameOrDepartment) || emp.department.equalsIgnoreCase(nameOrDepartment)) {
                result.addAll(entry.getValue());
            }
        }
        return result;
    }

    // Remove completed tasks
    public static void removeCompletedTasks() {
        pendingTasks.removeIf(task -> task.status.equalsIgnoreCase("Completed"));
        for (List<Task> taskList : tasks.values()) {
            taskList.removeIf(task -> task.status.equalsIgnoreCase("Completed"));
        }
    }

    // Get all pending tasks
    public static List<Task> getPendingTasks() {
        return new ArrayList<>(pendingTasks);
    }

    public static void main(String[] args) {
        // Adding employees
        addEmployee(101, "Pavan", "HR");
        addEmployee(102, "Prem", "IT");

        // Assigning tasks
        assignTask(101, 201, "Prepare HR report", "High");
        assignTask(102, 202, "Fix server issues", "Medium");
        assignTask(101, 203, "Schedule interviews", "Low");

        // Retrieve tasks by priority
        System.out.println("Next high-priority task: " + getNextTaskByPriority());

        // Retrieve tasks by employee name
        System.out.println("Tasks for Pavan: " + getTasksByEmployeeOrDepartment("Pavan"));

        // Retrieve tasks by department
        System.out.println("Tasks in HR department: " + getTasksByEmployeeOrDepartment("HR"));

        // Mark a task as completed
        tasks.get(101).get(0).status = "Completed";
        removeCompletedTasks();

        // Get all pending tasks
        System.out.println("Pending tasks: " + getPendingTasks());
    }
}

