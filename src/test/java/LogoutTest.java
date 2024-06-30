
import org.testng.annotations.Test;

import static org.testng.Assert.assertTrue;

public class LogoutTest extends BaseTest {

    @Test
    public void testUserLogout() {
        page.click("#login2");
        page.fill("#loginusername", "shereentests");
        page.fill("#loginpassword", "12345");
        page.click("button:has-text('Log in')");

        page.locator("#nameofuser").waitFor();
        page.click("#logout2");

        page.locator("#login2").waitFor();
        boolean isLoginVisible = page.locator("#login2").isVisible();
        assertTrue(isLoginVisible);
    }
}
