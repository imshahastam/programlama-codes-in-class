public class Manager extends Employee {
    String department;
    int officeNumber;
    Director boss;

    void printManagerInfo() {
        printEmployeeInfo();
        System.out.println("Департамент: " + department + " Офис: " + officeNumber);
        System.out.println("Начальник: " + boss.name);
    }

    void changeDirector(Director newDirector) {
        this.boss = newDirector;
    }

    void changeDepartment(String department) {
        this.department = department;
    }

}
