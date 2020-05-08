public class MinutesToYearsDaysCalculator {
    public static void main (String args []) {

        PrintYearsAndDays(525600);
        PrintYearsAndDays(1051200);
        PrintYearsAndDays(561600);
        PrintYearsAndDays(0);
    }
        public static void PrintYearsAndDays (long minutes) {
            if (minutes < 0) System.out.println ( "Invalid Value" );
            if (minutes == 0 ) System.out.println ( minutes + " minutes = "+ 0 +" y " + 0 + " d " );
            if (minutes > 60) {
                //long hours = minutes / 60;
                //long days = hours / 24;
                long days = minutes/ 60 / 24;
                long years = days /365;
                    if (days >= 365) {
                        days = days - 365;{
                            if (days >= 365) days = days - 365;
                        }

                    }
                System.out.println ( minutes + " minutes = "+ years +" y " + days + " d ");
            }
        }


}
