package kg.itschool.megacom;

import kg.itschool.megacom.dao.daoutil.DaoFactory;
import kg.itschool.megacom.dao.ManagerDao;
import kg.itschool.megacom.model.Manager;

import java.time.LocalDate;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Manager manager = new Manager();

        System.out.print("First name: ");
        manager.setFirstName(scan.nextLine());

        System.out.print("Last name: ");
        manager.setLastName(scan.nextLine());

        System.out.print("Email: ");
        manager.setEmail(scan.nextLine());

        System.out.print("Phone number: ");
        manager.setPhoneNumber(scan.nextLine());

        System.out.print("Date of birth: ");
        manager.setDob(LocalDate.parse(scan.nextLine())); // yyyy-MM-dd

        System.out.print("Salary: ");
        manager.setSalary(scan.nextDouble());

        System.out.println("Input: " + manager);

        ManagerDao managerDao = DaoFactory.getManagerDaoSql();
        System.out.println("From database: " + managerDao.save(manager));
   //     System.out.println(managerDao.findById(2L));
     //   System.out.println(managerDao.findById(6L));
    }
}
