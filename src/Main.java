public class Main {
    public static void main(String[] args) {

        Employee emp1 = new Employee();
        emp1.name = "Айбек Азаматов";
        emp1.age = 24;
        emp1.gender = "Мужчина";
        emp1.printEmployeeInfo();

        System.out.println("-----------Директор-------------");

        Director dir1 = new Director();
        dir1.name = "Айдана Назарова";
        dir1.age = 32;
        dir1.gender = "Женщина";
        dir1.filial = "Дордой";
        dir1.companyShares = 5;
        dir1.yearOfWorkExperience = 8;
        dir1.printDirectorInfo();
        dir1.increaseCompanyShares(10);

        System.out.println("-----------Менеджер-------------");

        Manager manager1 = new Manager();
        manager1.name = "Айсулуу Айбекова";
        manager1.age = 28;
        manager1.gender = "Женщина";
        manager1.department = "Финансы";
        manager1.officeNumber = 321;
        manager1.boss = dir1;
        manager1.changeDepartment("Планирование");
        manager1.printManagerInfo();



    }
}