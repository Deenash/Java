public class ChainingDemo3 {


	public static void main(String[] args) {

		Carnivore car = new Carnivore();
	}
}
class Animal {    
	private String name;    
	public Animal()   {     
		System.out.println("I'm executed first.");   
		
	} 
}  
class Mammal extends Animal {    
	public Mammal()   {    
		   
		System.out.println("I'm executed second"); 
	}
}  
class Carnivore extends Mammal{   
	public Carnivore()   {     
		    
		System.out.println("I'm executed third");   
	}
}



// In this the parent class constructor will be executed first by default before executing the child class constructor.
