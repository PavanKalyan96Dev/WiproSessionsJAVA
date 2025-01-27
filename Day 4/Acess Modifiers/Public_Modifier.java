package AccessModifiers;
//from any class even from other package also
public class Public_Modifier 
{
	public String name="pavan";
	public void display()
	{
		
		System.out.println("hello "+name);
	}

	public static void main(String[] args) {
		
		Public_Modifier obj=new Public_Modifier();
		System.out.println(obj.name);
		obj.display();

	}

}

/* pavan
hello pavan

*/
