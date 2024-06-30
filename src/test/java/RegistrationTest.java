
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class RegistrationTest extends BaseTest {

    @Test
    public void testUserRegistration() {
        page.click("#signin2");
        page.fill("#sign-username", "testuser");
        page.fill("#sign-password", "testpassword");
        page.click("button:has-text('Sign up')");

        page.onDialog(dialog -> {
            assertEquals("Sign up successful.", dialog.message());
            dialog.accept();
        });

    }
}
