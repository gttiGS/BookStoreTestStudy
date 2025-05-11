package com.test;

import static com.core.DriverFactory.getDriver;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.core.BaseTest;
import com.page.LoginBSPage;
import com.page.RegisterBSPage;

public class RegisterBSTest extends BaseTest {

	private LoginBSPage loginPage;
    private RegisterBSPage registerpage;

    @BeforeEach
	    public void setUp() throws Exception  {
		loginPage = new LoginBSPage();	
        registerpage = new RegisterBSPage();	
		loginPage.openSite("https://sahitest.com/demo/training/login.htm");
	}

    @Test
        public void RegisterValid() {
            registerpage.clickRegister();
            registerpage.regUser("Gustavo");
            registerpage.regPass("12345678");
            registerpage.repeatPass("12345678");
            registerpage.radioGender();
            registerpage.sendAddress("Rua XXX 01, Bairro YYY, Minas Gerais - Brasil");
            registerpage.sendBilling("Rua XXX 01, Bairro YYY, Minas Gerais - Brasil");
            registerpage.dDownList();
            registerpage.checkPolitcs();
            registerpage.btnRegister();
            assertEquals("Registered Successfully", registerpage.alerttxt());
            registerpage.alert();
            assertTrue(getDriver().getCurrentUrl().contains("register.htm"));

        }

}
