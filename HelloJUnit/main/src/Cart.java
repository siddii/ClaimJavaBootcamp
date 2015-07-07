import java.util.ArrayList;

/**
 * Created by siddique on 7/6/15.
 */
public class Cart {

    private ArrayList<Product> items = new ArrayList<Product>();


    public void addProduct(Product product) {
        items.add(product);
        product.setId(items.size());
    }

    public void removeProduct(Product product) {

        for (Product existingProduct : items) {
            if (existingProduct == product) {
                items.remove(product);
            }
        }
    }

    public ArrayList<Product> getItems() {
        return items;
    }
}
