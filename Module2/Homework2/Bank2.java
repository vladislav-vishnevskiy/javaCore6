package Module2.Homework2;

/**
 * Created by Vladislav on 07.02.2017.
 */
public class Bank2 {
    public static void main(String[] args) {
        withdraw(100.0, 0.0);
        withdraw(100.0, 10.0);
        withdraw(100.0, 99.0);

    }

    public static void withdraw (double account, double withdrawal){
        String answer = "OK";
        double commission = withdrawal * 0.05;
        double totalWithdrawal = withdrawal + commission;
        if ((withdrawal <= 0) || (account < totalWithdrawal)) {
            answer = "NO";
        } else {
            answer += " " + commission + " " + (account-totalWithdrawal);
        }

        System.out.println(answer);
    }
    }
