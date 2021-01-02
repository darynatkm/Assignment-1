package assignment14;

public class OnSaleItem extends Item{
    private double discount;

    public OnSaleItem() {
    }

    public OnSaleItem(String name, int catalogNumber, int quantity, double price, double discount) {
        super(name, catalogNumber, quantity, price);
        this.setPrice(getPrice() - discount);
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "OnSaleItem{discount="+discount+"%, name="+getName()+", price="+getPrice()+"}";
    }
}
