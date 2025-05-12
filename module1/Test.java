/*Ensure that your program has the two required classes and a test class.

Place each Java class into a separate Java source file. 
*/

public class Test {
    public static void main(String[] args) {
        Employee e = new Employee();
        e.setFirstName("Jack");
        e.setMiddleInitial('A');
        e.setLastName("Bell");
        e.setEmployeeID(42);
        e.setSalary(1000.00);
        e.employeeSummary();
        //char needs single quotes

        Manager m = new Manager();
        m.setFirstName("Zavon");
        m.setMiddleInitial('D');
        m.setLastName("Nelson");
        m.setEmployeeID(96);
        m.setDepartment("Biomedical-Engineering");
        m.setSalary(25000.00);
        m.employeeSummary();
}
}