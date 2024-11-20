public class HealthProfileTest {

    public static void main(String[] args) {

        HealthProfile healthProfile = new HealthProfile("rokibat","rofiat","male",20,31,2003,20,20.9);

        int age_in_year = healthProfile.getCurrent_year() - healthProfile.getYear();
        double bmi = healthProfile.body_mass_calculator();
        System.out.println("The person details::");
        System.out.printf("the first name is %s%n",healthProfile.getFirst_name());
        System.out.printf("the last name is %s%n",healthProfile.getLast_name());
        System.out.printf("date of birth in format mm-dd-yyyy is %2d-%2d-%4d%n",healthProfile.getMonth(),
                healthProfile.getDay(),healthProfile.getYear());
        System.out.printf("Age %dyears old%n",age_in_year);
        System.out.printf("the maximum heart rate is %d%n",healthProfile.maximum_heart_rate());
        System.out.println(healthProfile.target_rate());
        System.out.println(healthProfile.target_rate1());
        System.out.printf("the body mass index is %f%n",bmi);

    }
}
