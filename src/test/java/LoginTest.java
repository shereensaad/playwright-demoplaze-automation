
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() {
        page.click("#login2");
        page.fill("#loginusername", "shereentests");
        page.fill("#loginpassword", "12345");
        page.click("button:has-text('Log in')");
        page.locator("#nameofuser").waitFor();

        String welcomeText = page.locator("#nameofuser").innerText();
        assertEquals("Welcome shereentests", welcomeText);

    }


}
