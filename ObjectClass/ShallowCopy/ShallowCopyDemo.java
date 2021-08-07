package ObjectClass.ShallowCopy;

public class ShallowCopyDemo {

	public static void main(String[] args) throws CloneNotSupportedException{
		Add a = new Add("Hyd",1111111);
		
	    Emp e1 = new Emp(1, "sreeni", a);	    
	    Emp e2 = (Emp)e1.clone();
	    
	    System.out.println(e1);
	    System.out.println(e2);
	    
	    e2.getAddress().setCity("Bangalore");
	    
	    System.out.println(e1);
	    System.out.println(e2);
	    
	    
	    
	}

}
