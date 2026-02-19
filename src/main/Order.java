package main;

import java.util.ArrayList;

public class Order {
    private ArrayList<MenuItems> orderItems;

    public Order() {
        this.orderItems = new ArrayList<>();
    }

    public int getNumberOfItems() {
        return orderItems.size();
    }

    public void addItem(MenuItems item) {
        orderItems.add(item);
    }
    public double computeSubtotal() {
        double subtotal = 0;
        for (MenuItems item : orderItems) {
            subtotal += item.getPrice();
        }
        return subtotal;
    }

}
