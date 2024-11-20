public class HeartRatesText {

    public static void main(String[] args) {


        HeartRates heartRates = new HeartRates("lukman","bola",20,20,1998);

        int age_in_year = heartRates.getCurrent_year() - heartRates.getYear_of_birth();

        System.out.println("The person details::");
        System.out.printf("the first name is %s%n",heartRates.getFirst_name());
        System.out.printf("the last name is %s%n",heartRates.getLast_name());
        System.out.printf("date of birth in format mm-dd-yyyy is %2d-%2d-%4d%n",heartRates.getMonth(),
                heartRates.getDay(),heartRates.getYear_of_birth());
        System.out.printf("Age %dyears old%n",age_in_year);
        System.out.printf("the maximum heart rate is %d%n",heartRates.maximum_heart_rate());
        System.out.println(heartRates.target_rate());
        System.out.println(heartRates.target_rate1());

    }
}
