public class Director extends Employee {
    String filial;
    int companyShares; //акции компании в %
    int yearOfWorkExperience; //as big boss

    void printDirectorInfo() {
        printEmployeeInfo();
        System.out.println("Закрепленный филиал: " + filial + " Стаж: " + yearOfWorkExperience);
    }

    void increaseCompanyShares(int amount) {
        System.out.println("Акций было: " + this.companyShares);
        System.out.println("Акций стало: " + (companyShares+amount));
    }
}
