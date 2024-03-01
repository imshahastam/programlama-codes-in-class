public class Main {
    public static void main(String[] args) {

        System.out.println("--ВНАЧАЛЕ--");
        Employee.printEmployeeAmount();
        System.out.println();

        Employee emp1 = new Employee("Айбек Азаматов", 24, "Мужчина");
        emp1.printEmployeeInfo();

        System.out.println("-----------Директор-------------");

        Director.printCompany();
        Director dir1 = new Director("Айдана Назарова", 32, "Женщина",
                "Дордой", 8);
        dir1.companyShares = 5;
        dir1.printDirectorInfo();
        dir1.increaseCompanyShares(10);

        System.out.println("-----------Менеджер-------------");
        Manager.salary = 45000;
        Manager manager1 = new Manager("Айсулуу Айбекова", 28, "Женщина",
                "Финансы",321);
        manager1.boss = dir1;
        manager1.changeDepartment("Планирование");
        manager1.printManagerInfo();

        Manager manager2 = new Manager();
        manager2.boss = dir1;
        manager2.printManagerInfo();

        System.out.println();
        Employee.printEmployeeAmount();

    }
}