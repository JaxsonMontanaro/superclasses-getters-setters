/* Part 2: Implement a Manager class that inherits from the Employee class. 

Field:
string department

Methods:
employeeSummary method - prints all superclass and subclass attributes
Ensure that your program has the two required classes and a test class.

Place each Java class into a separate Java source file.
 */

public class Manager extends Employee {
    private String department;
    // Manager class that inherits from the Employee class

    public void setDepartment(String department) {
        this.department = department;
    }
    // setter

    public String getdepartment() {
        return this.department;
    }
    // getter

    @Override
    public void employeeSummary() {
        super.employeeSummary();
        System.out.println("Department = " + department);
    }
    // overrides superclass employee sumary method. 

    /*
     * public void managerSummary(){
     * super.employeeSummary();
     * System.out.println("Department = " + department);
     * }
     */
    // public method thats void becouse it returns nothing () because no params
    // super to user superclass's employee summary and () to call it
    // add manager
}