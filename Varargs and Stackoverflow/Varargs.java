class Varargs {
    static void main(int ...a)
	    {
		 System.out.println("Arguments are:");
		 System.out.println(a.length);
		 
		 for(int i:a)
		     System.out.println(i);
			System.out.println();
		}
    public static void main(String arg[])
	{
	    main();
		main(99 ,88 ,77 ,66 ,55 ,44 ,33 ,22 ,11);
		main(800000000,555);
		
	}
}