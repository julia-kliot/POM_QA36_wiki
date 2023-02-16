package tests;

import manage.ConfigurationWiki;
import model.User;
import org.testng.Assert;
import org.testng.annotations.Test;
import screens.MainScreen;

public class Login extends ConfigurationWiki {

    @Test
    public void login1(){
        User user = User.builder().userName("juliakliot.jk").password("Misha240613").build();
        boolean isLogged = new MainScreen(driver)
                .clickOTheFlowBytton()
                .clickTheLoginButton()
                .fillInLoginForm(user)
                .clickOTheFlowBytton()
                .isLogged();
        Assert.assertTrue(isLogged);

    }
    @Test
    public void login2(){
        User user = User.builder().userName("juliakliot.jk").password("Misha240613").build();
        String info= new MainScreen(driver)
                .clickOTheFlowBytton()
                .clickTheLoginButton()
                .fillInLoginForm(user)
                .clickOTheFlowBytton()
                .getInfo();
        Assert.assertEquals(info,"Juliakliot.jk");

    }
    @Test
    public void login3() {
        User user = User.builder().userName("juliakliot.jk").password("Misha240613").build();
        String infoOut = new MainScreen(driver)
                .clickOTheFlowBytton()
                .clickTheLoginButton()
                .fillInLoginForm(user)
                .clickOTheFlowBytton()
                .getInfoOut();
        Assert.assertEquals(infoOut, "Log out");
    }

    @Test
    public void  login4(){
        User user = User.builder().userName("juliakliot.jk").password("Misha240613").build();
        String inf = new MainScreen(driver)
                .clickOTheFlowBytton()
                .clickTheLoginButton()
                .fillInLoginForm(user)
                .clickOTheFlowBytton()
                .logOut()
                .clickOTheFlowBytton()
                .getInf();
        Assert.assertEquals(inf, "Log in to Wikipedia");

    }
}
