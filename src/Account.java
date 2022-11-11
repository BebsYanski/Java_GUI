import javax.swing.*;
import java.util.Date;
import java.util.Scanner;

public class Account {
    String fullName;
    String  dateOfBirth;
    String gender;
    String occupation;
    Integer tel;
    String emailAddress;

    Scanner scanner=new Scanner(System.in);
    Account(){
        JOptionPane.showMessageDialog(null,"Welcome to our house management app, how may we help you.\n" +
                " Here, we allow you to create an account with us and \nyou can create several" +
                " compounds for one account and \nmanage the houses, " +
                "apartments or studios in the compound, \nfrom rents, bills and even safety and security of your compound.","House Rent Manager",JOptionPane.INFORMATION_MESSAGE,null);
//        System.out.println("Welcome to our house management app, how may we help you," +
//                " here, we allow you to create an account with us and you can create several" +
//                " compounds for one account and manage the houses, " +
//                "apartments or studios in the compound, from rents, bills and even safety and security of your compound");
//        System.out.println("What do you wish to do?");
//        System.out.println("1. create an Account\n" +
//                "2. Log into your account\n" +
//                "3. Pay Rents/bills\n(pick a number)");
        String[] resp={ "create an Account",
             "Log into your account",
                "Make a payment"};
        Integer response =JOptionPane.showOptionDialog(null,"What do you wish to do?","House Rent Manager",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,resp,0);
        System.out.println(response);
//        System.out.println("Response:");
//        int response = scanner.nextInt();
       if (response==0){
          createAccount();
        } else if (response==1) {
         logIn();
        } else {

        }


    }

    void createAccount(){
        System.out.println("\t\t\t\tFill in the necessary information for your account creation");
        System.out.println("Full Name:");
        this.fullName=scanner.nextLine();

        System.out.println("Date of Birth:");
        this.dateOfBirth=scanner.nextLine();

        System.out.println("Gender:");
        this.gender=scanner.nextLine();

        System.out.println("Occupation:");
        this.occupation=scanner.nextLine();

        System.out.println("Mobile Number:");
        this.tel=scanner.nextInt();
        scanner.nextLine();

        System.out.println("Email Address:");
        this.emailAddress=scanner.nextLine();

        System.out.println("Welcome "+fullName+" We are glad to have you as our customer");
    }

    void logIn(){

    }
}
