public class Employee {
    String name;
    int age;
    String gender;
    static int amountOfEmployees = 0;

    Employee() {
        super();
        amountOfEmployees++;
    }
    Employee(String newName, int newAge, String newGender) {
        this.name = newName;
        this.age = newAge;
        this.gender = newGender;
        amountOfEmployees++;
    }

    void printEmployeeInfo() {
        System.out.println("ФИ: "+ name);
        System.out.println("Возраст: "+ age);
        System.out.println("Пол: "+ gender);
    }

    static void printEmployeeAmount() {
        System.out.println("Количество всех работников: " + amountOfEmployees);
    }
}
