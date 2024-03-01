import java.util.List;

public class Manager extends Employee {
    String department;
    int officeNumber;
    Director boss;
    static double salary;

    Manager() {
        super();
        amountOfEmployees++;
    }
    Manager(String newName, int newAge, String newGender, String newDepartment, int newOfNum) {
        this.name = newName;
        this.age = newAge;
        this.gender = newGender;
        this.department = newDepartment;
        this.officeNumber = newOfNum;
        amountOfEmployees++;
    }

    void printManagerInfo() {
        printEmployeeInfo();
        System.out.println("Департамент: " + department + ". Офис: " + officeNumber);
        System.out.println("Начальник: " + boss.name);
        System.out.println();
    }

    static void calculateBonus(double bonusPercent) {
        double bonus = salary*(100+bonusPercent)/100;
        System.out.println(bonus);
    }

    void changeDirector(Director newDirector) {
        this.boss = newDirector;
    }

    void changeDepartment(String department) {
        this.department = department;
    }

}
