import java.util.Scanner;

public class AtmProjectSwitchCase {
    public static void main(String[] args) {
        String userName, password;
        Scanner inp = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;

        while (right > 0) {
            System.out.print("Username : ");
            userName = inp.nextLine();
            System.out.print("Password : ");
            password = inp.nextLine();
            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Welcome Aboard...!");
                do {
                    System.out.println("1-Deposit\n" + "2-Withdraw\n" + "3-Balance Query\n" + "4-Quit\n");
                    System.out.print("Please Choose Your Action : ");
                    select = inp.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Money :");
                            int price = inp.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Money : ");
                            price = inp.nextInt();
                            if (price > balance) {
                                System.out.println("Insufficient Funds...!");
                            } else {
                                balance -= price;
                            }
                            break;
                        case 3:
                            System.out.println("Balance : " + balance);
                            break;
                    }
                    if (select > 4) {
                        System.out.println("Incorrect Entry ...!");
                    }
                } while (select != 4);
                System.out.println("See You soon");
                break;
            } else {
                right--;
                System.out.println("Wrong Username of Password.Please Try Again");
                if (right == 0) {
                    System.out.println("Your Account Has Been Disabled.Please Contact Your Bank...");
                } else {
                    System.out.println("Remaining Right : " + right);
                }

            }

        }
    }
}