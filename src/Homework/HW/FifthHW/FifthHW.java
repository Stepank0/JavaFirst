package Homework.HW.FifthHW;

public class FifthHW {

    public static void main(String[] arge) {


// это первое что я сделал, понимаю что это ужастно грамостко .
        Employee[] employeesArray = new Employee[5];
        Employee employee1 = new Employee("Alex Smith", "DBA", "dba@mail.ru", "+7 916 (999)-99-99", 4000, 32);
        employeesArray[0] = employee1;
        Employee employee2 = new Employee("Agata Brown", "Lead Developer", "lead@mail.ru", "+7 916 (888)-88-88", 6000, 45);
        employeesArray[1] = employee2;
        Employee employee3 = new Employee("Jon Johnson", "Quality Assurance", "QA@mail.ru", "+7 916 (777)-77-77", 3000, 25);
        employeesArray[2] = employee3;
        Employee employee4 = new Employee("Jack Ivanov", "sysadmin", "admin@mail.ru", "+7 916 (666)-66-66", 5000, 55);
        employeesArray[3] = employee4;
        Employee employee5 = new Employee("Hanna Abbot", "Chief Information Officer", "CIO@mail.ru", "+7 916 (555)-55-55", 7000, 65);
        employeesArray[4] = employee5;


        getInfoAllEmployee(employeesArray);
        System.out.println("----------------------------");
        getInfoAboutOldEmployee(employeesArray);

    }

    public static void getInfoAllEmployee(Employee[] employeesArray) {
        System.out.println(" All employee: ");
        for (int i = 0; i < employeesArray.length; i++) {
            System.out.println((i + 1) + " " + employeesArray[i].getInfo());

        }

    }
     public  static void getInfoAboutOldEmployee (Employee[] employeesArray) {
        for (int i = 0; i < employeesArray.length; i++) {
            if(employeesArray[i].getAge() > 40) {
                System.out.println(employeesArray[i].getInfo());
            }
        }
     }
}



