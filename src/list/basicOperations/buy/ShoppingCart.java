package list.basicOperations.buy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> cart;

    public ShoppingCart() {
        this.cart = new ArrayList<>();
    }

    public void addItem(Item item) {
        this.cart.add(item);
    }

    public void removeItem(String name) {
        for (Item item : this.cart) {
            if (item.getName().equalsIgnoreCase(name)) {
                this.cart.remove(item);
            }
        }
    }

    public void calculateTotal() {
        double total = 0;
        for (Item item : this.cart){
            total += item.getPrice() * item.getQuantity();
        }

        System.out.printf("O total do carrinho é R$ %.2f.\n", total);
    }

    public void showCart() {
        this.cart.forEach(System.out::println);
    }

    public static void main(String[] args) {
        var cart = new ShoppingCart();
        cart.addItem(new Item("item 1", 10.00d, 2));
        cart.addItem(new Item("item 2", 5.00d, 1));
        cart.addItem(new Item("item 3", 100.00d, 1));
        cart.showCart();
        cart.calculateTotal();
        cart.removeItem("item 2");
        cart.showCart();
        cart.calculateTotal();
    }
}
