package day_35_Encapsulation.encapsulation;

public class EmployeeObject {

    public static void main(String[] args) {

        Employee employee1 = new Employee("Tatiana", 'F', 28, 110000 );


        Employee employee2 = new Employee("Aygun", 'F', 31, 115000 );
        employee2.setSalary(employee2.getSalary()+15000);

        System.out.println(employee1);
        System.out.println(employee2);



    }


}
