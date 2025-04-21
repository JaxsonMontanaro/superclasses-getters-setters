/*
Part 1: Implement a superclass Employee that has the following fields and methods.

Fields:
string firstName
string lastName
int employeeID
double salary

Methods:  
constructor method - initialize salary field to zero.
setters and getters for firstName, lastName, and employeeID
employeeSummary method - prints all account attributes

Methods:
employeeSummary method - prints all superclass and subclass attributes
Ensure that your program has the two required classes and a test class.

Place each Java class into a separate Java source file.
*/

public class Employee {
    private String firstName;
    private char middleInitial;
    private String lastName;
    private int employeeID;
    private double salary;
    // Feilds (private due to setters)

    public Employee() {
        this.salary = 0.0;
    }
    // constructor method (sets salary to 0)

    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    // setters
    // void because nothing is returned

    public String getFirstName() {
        return this.firstName;
    }

    public char getMiddleInitial() {
        return this.middleInitial;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getEmployeeID() {
        return this.employeeID;
    }

    public double getSalary() {
        return this.salary;
    }
    // getters
    // setters aka mutators and getters aka accessors which give access to update a classes [private] variables

    public void employeeSummary() {
        System.out.println("Employee ID = " + employeeID);
        System.out.println("Name = " + firstName + " " + middleInitial + " " + lastName);
        System.out.println("Salary = " + salary);
    }
    // employeeSummary method
}

/* 
 * Recourses:
 * https://www.w3schools.com/java/ref_keyword_this.asp
 * https://www.freecodecamp.org/news/java-getters-and-setters/
 * https://stackoverflow.com/questions/10705848/main-method-not-found-error-when-starting-program
 * https://www.w3schools.com/java/ref_keyword_super.asp
 */