package ImmutableClass;

/**
 * The class needs to be made final.
 * All the member variables are made private.
 * No Setter methods for variables.
 * All the mutable fields are made final, so that its value cannot be changed anytime.
 * All the fields needs to be initialized only using constructor, so that a deep copy is made.
 * In the getter methods for objects, return a deep copy of the object, so that only the copy will be accessed and not the original one.
 */


public final class Immutable {    //class as final

	private final Integer age ;
	
	private final String name;
	private final Employee emp;// instance variable as final (means this object when 
	//initialized with an object of type Employee cannot be assigned with any other
	//object of type Employee.Note:Class employee is not a final class and u can extend it
	//make sure if instance variable are immutable - If mutable, handle in the constructor accordingly

	public Immutable(String name, Integer age, Employee emp)
	{
		System.out.println("const");
		this.name = name;
		this.age = age;
		this.emp = new Employee(emp.getCompany());//this is deep copy and desired behavior
		//this.emp = emp;//this is shallow copy.

	}

	//No setter method

	public Integer getAge() {
		return age;
	}
	public Employee getEmp() {
		return emp;
	}
	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return name +" - "+ age +" - "+ emp.getCompany();
	}


	public static void main(String[] args) {

		Employee e = new Employee("tcs");
		Immutable a = new Immutable("abc", 12, e);

		System.out.println("first:"+a);
		e.setCompany("cts");//if shallow copy was used in constructor,then this statement 
		//will change the value in Immutable 'a' also because it is shallow copy
		//both are pointing to the same object.
		//But u want it to be deep copy,so create a new object in constructor.
		System.out.println("second:"+a);


	
	}

}



class Employee //Class Employee is a normal class with no restrictions
{
	public Employee(String company)
	{
		this.company = company;
	}
	private String company;

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}





}



