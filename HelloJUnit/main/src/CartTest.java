import junit.framework.Assert;
import org.junit.Test;

/**
 * Created by siddique on 7/6/15.
 */
public class CartTest {


    @Test
    public void addOneProduct() {
        Cart cart = new Cart();
        cart.addProduct(new Product("Macbook Air", 1250.00));

        Assert.assertEquals(1, cart.getItems().size());

        Product actualProduct = cart.getItems().get(0);

        Assert.assertEquals("Macbook Air", actualProduct.getName());
        Assert.assertEquals(1250.00, actualProduct.getPrice());

        Assert.assertEquals(1, actualProduct.getId());
    }


    @Test
    public void addMultipleProducts() {
        Cart cart = new Cart();
        cart.addProduct(new Product("Macbook Air", 1250.00));
        cart.addProduct(new Product("Macbook Pro 2015", 2550.00));
        cart.addProduct(new Product("iPhone 6+", 850.00));

        Assert.assertEquals(3, cart.getItems().size());

        Product product1 = cart.getItems().get(0);

        Assert.assertEquals("Macbook Air", product1.getName());
        Assert.assertEquals(1250.00, product1.getPrice());

        Assert.assertEquals("Product Id doesn't match!", 1, product1.getId());

        Product product2 = cart.getItems().get(1);

        Assert.assertEquals("Macbook Pro 2015", product2.getName());
        Assert.assertEquals(2550.00, product2.getPrice());

        Assert.assertEquals(2, product2.getId());

        Product product3 = cart.getItems().get(2);

        Assert.assertEquals("iPhone 6+", product3.getName());
        Assert.assertEquals(850.00, product3.getPrice());

        Assert.assertEquals(3, product3.getId());
    }

    @Test
    public void removeProduct() {
        Product product1 = new Product("Macbook Air", 1250.00);
        Product product2 = new Product("Macbook Pro 2015", 2550.00);
        Product product3 = new Product("iPhone 6+", 850.00);
        Product product4 = new Product("iPhone 6", 650.00);

        Cart cart = new Cart();
        cart.addProduct(product1);
        cart.addProduct(product2);
        cart.addProduct(product3);
        cart.addProduct(product4);

        Assert.assertEquals(4, cart.getItems().size());

        cart.removeProduct(product3);
        Assert.assertEquals(3, cart.getItems().size());

        Assert.assertTrue(cart.getItems().contains(product1));
        Assert.assertTrue(cart.getItems().contains(product2));
        Assert.assertFalse(cart.getItems().contains(product3));
        Assert.assertTrue(cart.getItems().contains(product4));

    }
}
