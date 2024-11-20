public class HeartRates {

    private String first_name;
    private String last_name;

    public HeartRates(String first_name, String last_name, int month, int day, int year_of_birth) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.month = month;
        this.day = day;
        this.year_of_birth = year_of_birth;
    }

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

    public int getYear_of_birth() {
        return year_of_birth;
    }

    public void setYear_of_birth(int year_of_birth) {
        this.year_of_birth = year_of_birth;
    }

    private int month;
    private int day;
    private int year_of_birth;
    private int mhr;
    private double thr;
    private double thr1;

    public int getCurrent_year() {
        return current_year;
    }



    private int current_year = 2024;

    public int maximum_heart_rate(){
        mhr = 220 * (current_year - year_of_birth);

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



}
