package AccessModifiers;
//within the same class we can access we cannot from other package or from other class also

public class Private {
	private String name="pavan";

	public static void main(String[] args)
	{
		//Private obj=new Private();
		System.out.println(new Private().name);	//both ways are fine

	}

}

//pavan
