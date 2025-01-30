
package com.HashMap;

import java.util.Comparator;
import java.util.Map;

import com.FrameWorks.Student;

public class ValueComparator implements Comparator<Map.Entry<Long, Student>> {

    @Override
    public int compare(Map.Entry<Long, Student> o1, Map.Entry<Long, Student> o2) {
        // Compare by Student stid or stname
        // For example, sort by stname (alphabetically)
        return o1.getValue().getStname().compareTo(o2.getValue().getStname());
    }
}

