public class Director extends Employee {
    String filial;
    int companyShares; //акции компании в %
    int yearOfWorkExperience; //as big boss
    static String companyName = "Macaroon";

    Director () {
        super();
        amountOfEmployees++;
    }

    Director(String newName, int newAge, String newGender, String newFilial, int yearOfExp) {
        this.name = newName;
        this.age = newAge;
        this.gender = newGender;
        this.filial = newFilial;
        this.yearOfWorkExperience = yearOfExp;
    }

    void printDirectorInfo() {
        printEmployeeInfo();
        System.out.println("Закрепленный филиал: " + filial + ". Стаж: " + yearOfWorkExperience);
    }

    void increaseCompanyShares(int amount) {
        System.out.println("Акций было: " + this.companyShares);
        System.out.println("Акций стало: " + (companyShares+amount));
    }

    static void printCompany() {
        System.out.println("Компания: " + companyName);
    }
}
