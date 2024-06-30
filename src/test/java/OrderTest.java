
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class OrderTest extends BaseTest {

    @Test
    public void testCreateOrderForAppleMonitor() {
        page.click("#login2");
        page.fill("#loginusername", "shereentests");
        page.fill("#loginpassword", "12345");
        page.click("button:has-text('Log in')");
        page.locator("#nameofuser").waitFor();

        page.click("text=Monitors");
        page.click("text=Apple monitor 24");
        page.click("text=Add to cart");

        page.onDialog(dialog -> {
            assertTrue(dialog.message().contains("Product added"));
            dialog.accept();
        });


        page.click("#cartur");
        page.click("button:has-text('Place Order')");
        page.fill("#name", "Test User");
        page.fill("#country", "USA");
        page.fill("#city", "New York");
        page.fill("#card", "1234567890123456");
        page.fill("#month", "12");
        page.fill("#year", "2024");
        page.click("button:has-text('Purchase')");

        String confirmationText = page.locator(".sweet-alert > h2").innerText();
        assertTrue(confirmationText.contains("Thank you for your purchase!"));
    }
}
