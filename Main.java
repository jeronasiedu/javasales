public class Main {
    public static void main(String[] args) {
        // Declaring two-dimensional array to store values
        int[][] highStreet = {{42000, 48000, 50000}, {52000, 58000, 60000}, {46000, 49000, 58000},
                {50000, 51000, 61000}};
        int[][] mallBranch = {{57000, 63000, 60000}, {70000, 67000, 73000}, {67000, 65000, 62000},
                {72000, 69000, 75000}};
        // Declaring a String array to store months
        String[] months = {"January", "February", "March", "April", "May", "June", "July", "August",
                "September", "October", "November", "December"};
        int[] quarterlySales = new int[4];
        int[] monthlySales = new int[12];
        int highStreetYearlySales = 0;
        int mallBranchYearlySales = 0;
        int highStreetQuarterlySales = 0;
        int mallBranchQuarterlySales = 0;
        int sum = 0;
        int quarter = 0;
        int currentMonth = 0;

        for (int i = 0; i < highStreet.length; i++) {
            for (int j = 0; j < highStreet[j].length; j++) {
//                Yearly combined sales
                highStreetYearlySales += highStreet[i][j];
                mallBranchYearlySales += mallBranch[i][j];
//                Which branch did better in a particular month
                if (highStreet[i][j] > mallBranch[i][j]) {
                    System.out.println("High street did better than mall branch in " +
                            months[currentMonth]);
                } else {
                    System.out.println("Mall branch did better than high street in " +
                            months[currentMonth]);
                }
//                Quarterly Sales
                highStreetQuarterlySales += highStreet[i][j];
                mallBranchQuarterlySales += mallBranch[i][j];
                sum = highStreet[i][j] + mallBranch[i][j];
                // Monthly sales
                monthlySales[currentMonth] = sum;
                currentMonth++;
                quarter += sum;

            }
//            Quarterly Sales
            quarterlySales[i] = quarter;
            quarter = 0;
//            Which branch did well in a particular quarter
            if (mallBranchQuarterlySales > highStreetQuarterlySales) {
                System.out.println("Mall branch did than high street in quarter " + (i + 1));
            } else {
                System.out.println("High street did better than mall branch in quarter " + (i + 1));
            }
            mallBranchQuarterlySales = 0;
            highStreetQuarterlySales = 0;

        }
        System.out.println("Monthly Sales");
//        Printing Monthly Sales
        for (int i = 0; i < monthlySales.length; i++) {
            System.out.println(months[i] + " : " + monthlySales[i]);
        }
        System.out.println("Quarterly Sales");
//        Printing Quarterly Sales
        for (int i = 0; i < quarterlySales.length; i++) {
            System.out.println("Quarter " + (i + 1) + quarterlySales[i]);

        }
//        Printing Annually sales
        System.out.println("Mall Branch Annual Sales " + mallBranchYearlySales);
        System.out.println("High Street Annual Sales " + highStreetYearlySales);

        if (mallBranchYearlySales > highStreetYearlySales) {
            System.out.println("Mall branch did better in the whole year");
        } else {
            System.out.println("High street did better in the whole year");
        }
//        Printing grand annual sales
        System.out.println("Grand Annual Sales " + (highStreetYearlySales + mallBranchYearlySales));

    }
}