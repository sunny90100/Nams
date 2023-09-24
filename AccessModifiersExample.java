package objectoriented;

class Person {
    private String name;
    protected int age;
    public double salary;

    public Person(String name, int age, double salary) { //constructor for the person
        this.name = name;
        this.age = age;
        this.salary = salary;
    }
    private void displayPrivateInfo() { //it is used to display the value of the private name variable
        System.out.println("Name: " + name);
    }

    protected void displayProtectedInfo() {
        System.out.println("Age: " + age);
    }

    public void displayPublicInfo() {
        System.out.println("Salary: $" + salary);
    }
}
public class AccessModifiersExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person = new Person("Sunitha", 22, 3000.0);

		person.displayProtectedInfo(); // Protected method can be accessed within the same package
        person.displayPublicInfo();    // Public method can be accessed from anywhere
	}

}
