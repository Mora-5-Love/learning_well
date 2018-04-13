package try_array;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final double STARTRATE = 10;
        final int NRATES = 6;
        final int NYEARS = 10;

        // set interest
        double[] intrest_rate = new double[NRATES];
        for (int j = 0; j < intrest_rate.length; j++) {
            intrest_rate[j] = (STARTRATE+j)/100.0;

        }

        double[][] balances = new double[NYEARS][NRATES];

        //set initial balances
        for (int j = 0; j < balances[0].length; j++) {
            balances[0][j] = 10_000;

        }

        //compute interest for future years
        for (int i = 1; i < balances.length; i++) {
            for (int j = 0; j < balances[i].length; j++) {
                double old_balance = balances[i-1][j];

                double interest = old_balance* intrest_rate[j];
                balances[i][j] = old_balance* interest;
            }
        }

        //print its
        for (int j = 0; j < intrest_rate.length; j++) {
            System.out.printf("%9.0f%%",100*intrest_rate[j]);
        }

        System.out.println();
        for (double[] row: balances){
            for (double b: row){
                System.out.printf("10.2f",b);
            }
            System.out.println();
        }

        System.out.println(Arrays.deepToString(balances));
    }
}
