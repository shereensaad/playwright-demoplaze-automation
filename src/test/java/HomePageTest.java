
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class HomePageTest extends BaseTest {

    @Test(priority = 1)
    public void testHomePageLoads() {
        String title = page.title();
        assertTrue(title.contains("STORE"));
    }

    @Test(priority = 2)
    public void testNavigationToProductPage() {
        page.click("text=Laptops");
        page.click("text=Sony vaio i5");
        String productTitle = page.locator(".name").innerText();
        assertTrue(productTitle.contains("Sony vaio i5"));
    }
}
