package Chapter3.Petrol;

public class PetrolPurchase {

    private String stationLocation;
    private String petrolType;
    private int quantity;
    private double pricePerLiter;
    private double percentageDiscount;

    public PetrolPurchase(String stationLocation, String petrolType, int quantity, double pricePerLiter, double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.quantity = quantity;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = percentageDiscount;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getStationLocation() {
        return this.stationLocation;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public double getPurchaseAmount() {
        double netAmount = quantity * pricePerLiter;
        double discount = (netAmount * percentageDiscount) / 100;
        return netAmount - discount;
    }
}
