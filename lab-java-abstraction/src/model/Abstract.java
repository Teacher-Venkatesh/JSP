package model;

public abstract class Abstract {

	   private int age;
	   private String maritial;
	   private String country;
	   
	 public Abstract(int age,String maritial,String country)
	 {
		 this.age=age;
		 this.maritial=maritial;
		 this.country=country;
	 }
	 
	   public boolean baseEligibility()
	 {
		if(age>=18 && age<=32 &&  maritial.equals("Unmarried") && (country.equals("India")||country.equals("india")))
		{
			return true;
		}
		else
			return false;
		 
	 }

}
