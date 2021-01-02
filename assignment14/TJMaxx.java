package assignment14;

import java.util.ArrayList;
import java.util.List;


public class TJMaxx {

    private List<Item> regularItems;
    private List<OnSaleItem> onSaleItems;

    public TJMaxx() {
        List<Item> regularItems = new ArrayList<>();
        List<OnSaleItem> onSaleItems = new ArrayList<>();
        ;

    }

    public void addRegularItem(Item item) {
        regularItems.add(item);
    }

    public void addOnSaleItem(OnSaleItem item) {
        onSaleItems.add(item);
    }

    public List<Item> getRegularItems() {
        return regularItems;
    }

    public List<OnSaleItem> getOnSaleItems() {
        return onSaleItems;
    }

    public int regularItemsCount() {
        return regularItems.size();
    }

    public int onSaleItemsCount() {

        return onSaleItems.size();
    }

    public List<String> getAllItemNames() {
        List<String> allNames = new ArrayList<String>();
        for (Item each : regularItems) {
            allNames.add(each.getName());
        }
        for (Item each : onSaleItems) {
            allNames.add(each.getName());
        }
        return allNames;
    }


    public double getItemPrice(int catalogNumber) {
        double price = 0.0;
        for (Item each : regularItems) {
            if (each.getCatalogNumber() == catalogNumber)
                price = each.getPrice();
        }
        for (OnSaleItem each : onSaleItems) {
            if (each.getCatalogNumber() == catalogNumber)
                price = each.getPrice();
        }
        return price;
    }

    public OnSaleItem getOnSaleItem(String name) {
        OnSaleItem result=null;

        for (OnSaleItem each : onSaleItems) {
            if (each.getName().equals(name))
                result=each;
        }
      return result;
    }

    public void removeItem(int catalogNumber) {
        for (Item each : regularItems) {
            if (each.getCatalogNumber() == catalogNumber)
                regularItems.remove(each);
        }
        for (OnSaleItem each : onSaleItems) {
            if (each.getCatalogNumber() == catalogNumber)
                onSaleItems.remove(each);
        }
    }

    public void buyItem(int catalogNumber) {
        for (Item each : regularItems) {
            if (each.getCatalogNumber() == catalogNumber) {
                each.setQuantity(each.getQuantity() - 1);
                if (each.getQuantity() == 0)
                    removeItem(catalogNumber);
            }
        }
        for (OnSaleItem each : onSaleItems) {
            if (each.getCatalogNumber() == catalogNumber) {
                each.setQuantity(each.getQuantity() - 1);
                if (each.getQuantity() == 0)
                    removeItem(catalogNumber);
            }
        }
    }
}