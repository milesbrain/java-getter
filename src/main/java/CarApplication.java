public class CarApplication {
    public static void main(String[] args) {





        Car cars = new Car("toyota","2024",700.00);
        System.out.println(cars.getPrice());


        double new_discount1 = cars.discount1();

        System.out.printf("The applied 5%% discount on the " +
                "price of the first car is $%.2f%n",cars.getPrice()-new_discount1);

        Car car = new Car("lexus","2025",8000);
        System.out.println(car.getPrice());

        double new_discount2 = car.discount2();

        System.out.printf("The applied 5%% discount on the " +
                "price of the second car is $%.2f%n " , car.getPrice()-new_discount2);





    }

}
