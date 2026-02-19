import org.junit.Test;
import org.junit.Before;
import static org.junit.Assert.*;
import main.Order;
import main.MenuItems;

public class OrderTest {

    private Order o;
    private MenuItems cheeseburger;
    private MenuItems fries;
    private MenuItems soda;

    @Before
    public void setUp(){
        o = new Order();
        cheeseburger = new MenuItems("cheeseburger", 7.25);
        fries = new MenuItems("fries", 1.50);
        soda = new MenuItems("soda", 1.00);
    }

    @Test
    public void testGetNumberOfItems(){
        //1. Create object being tested

        //2. Call the method being tested(on the object)
        int numberOfItems = o.getNumberOfItems();

        //3. verify results using assertions
        assertEquals(0, numberOfItems);
    }

    @Test
    public void testGetNumberOfItemsNotEmpty(){
        //1. Create object being tested

        //2. Call the method being tested(on the object)
        o.addItem(cheeseburger);
        int numberOfItems = o.getNumberOfItems();

        //3. verify results using assertions
        assertEquals(1, numberOfItems);
    }

    @Test
    public void testComputerSubtotal(){
        //1. Create object being tested
        o.addItem(cheeseburger);
        o.addItem(fries);
        o.addItem(soda);

        //2. Call the method being tested(on the object)
        double subtotal = o.computeSubtotal();

        //3. verify results using assertions
        assertEquals(9.75, subtotal, 0.01);
    }

}