public class PetrolPurchase {

    private String station_location;
    private String petrol;

    public PetrolPurchase(String station_location, String petrol, int quantity, double litre, double discount) {
        this.station_location = station_location;
        this.petrol = petrol;
        this.quantity = quantity;
        this.litre = litre;
        this.discount = discount;
    }

    private int quantity;

    public String getStation_location() {
        return station_location;
    }

    public void setStation_location(String station_location) {
        this.station_location = station_location;
    }

    public String getPetrol() {
        return petrol;
    }

    public void setPetrol(String petrol) {
        this.petrol = petrol;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getLitre() {
        return litre;
    }

    public void setLitre(double litre) {
        this.litre = litre;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    private double litre;
    private double discount;

    public double getPurchase() {


        double cost = quantity  * litre;
        double costofall = cost *(discount/100);
        return cost - costofall;




    }


}
