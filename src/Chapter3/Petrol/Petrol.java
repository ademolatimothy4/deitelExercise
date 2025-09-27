package Chapter3.Petrol;

public class Petrol {

    public static void main(String[] args) {
        PetrolPurchase purchase = new PetrolPurchase("Ajegunle", "Diesel", 25, 100.00, 20.00);

        System.out.println("Station Location is:"+ purchase.getStationLocation());
        System.out.println("Chapter3.Petrol.Petrol type is:" + purchase.getPetrolType());
        System.out.println("Quantity is:" + purchase.getQuantity()+ "litres");
        System.out.println("Price per litre is:" +"$" + purchase.getPricePerLiter());
        System.out.println("Percentage Discount is:" + purchase.getPercentageDiscount()+ "%");

        double netAmount = purchase.getPurchaseAmount();
        System.out.println("Net Amount is:$" + netAmount);
    }
}
