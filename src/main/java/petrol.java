public class petrol {

    public static void main(String[] args) {
        PetrolPurchase petrolPurchase = new PetrolPurchase("Lagos, Nigeria",
        "premium petrol",5,2080.5,10.0);

        System.out.println("Petrol purchase Details \n");
        System.out.println("petrol location " + petrolPurchase.getStation_location());
        System.out.println("petrol type " + petrolPurchase.getPetrol());
        System.out.println("petrol quantity " + petrolPurchase.getQuantity());
        System.out.println("petrol price per litre " + petrolPurchase.getLitre());
        System.out.println("petrol discount " + petrolPurchase.getDiscount());


        double net_purchase_amount = petrolPurchase.getPurchase();
        System.out.printf("the net purchase amount is $%.2f%n",net_purchase_amount);
    }
}
