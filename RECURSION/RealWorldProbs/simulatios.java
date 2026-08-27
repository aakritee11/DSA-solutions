import java.util.*;
public class simulatios {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 5000;
        double limit = 10000;

        int q = sc.nextInt();
        for (int i = 0; i < q; i++) {
            String cmd = sc.next();

            if (cmd.equals("DEPOSIT")) {
                double amt = sc.nextDouble();
                if (amt <= 0) System.out.println("Invalid Amount");
                else { balance += amt; System.out.println("Deposited"); }

            } else if (cmd.equals("WITHDRAW")) {
                double amt = sc.nextDouble();
                if (amt <= 0) System.out.println("Invalid Amount");
                else if (amt > limit) System.out.println("Limit Exceeded");
                else if (amt > balance) System.out.println("Insufficient Funds");
                else { balance -= amt; System.out.println("Withdrawn"); }

            } else if (cmd.equals("BALANCE")) {
                System.out.println(balance);
            }
        }
    }
}

