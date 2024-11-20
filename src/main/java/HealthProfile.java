public class HealthProfile {
    private String first_name;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public double getPounds() {
        return pounds;
    }

    public void setPounds(double pounds) {
        this.pounds = pounds;
    }

    public HealthProfile(String first_name, String last_name, String gender, int month,
                         int day, int year, int inches, double pounds) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.gender = gender;
        this.month = month;
        this.day = day;
        this.year = year;
        this.inches = inches;
        this.pounds = pounds;
    }

    private String last_name;
    private String gender;
    private int month;
    private int day;
    private int year;
    private int inches;
    private double pounds;
    private int mhr;
    private double thr;
    private double thr1;

    public int getCurrent_year() {
        return current_year;
    }

    private int current_year = 2024;

    public int maximum_heart_rate(){
        mhr = 220 * (current_year - year);

        return mhr;
    }

    public double target_rate(){
        thr = (double)mhr *(50.0/100);

        System.out.println("the lowest bound");
        return thr;

    }
    public double target_rate1(){
        thr1 = (double) mhr*(85.0/100);
        System.out.println("the highest bound");
        return thr1;
    }
    public double body_mass_calculator(){
        return pounds/((double) inches*inches);
    }

}
