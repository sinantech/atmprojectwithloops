import java.util.Scanner;

public class InterestApplication {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Welcome... Interest Rate is %7");
        int fund, term;
        System.out.print("Please Enter The fund : ");
        fund = inp.nextInt();
        System.out.print("Please Enter The Term : ");
        term = inp.nextInt();

        double total = fund;
        double rate = 0.06;

        for (int i = 1; i <= term; i++) {
            total = (total * rate) + total;
            System.out.println(i + "." + "Term : " + (int) (total));
        }

    }
}
