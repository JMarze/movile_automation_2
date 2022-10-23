package cleanTest;


import activity.alarma.ConfigurationAlarmaForm;
import activity.alarma.CreateAlarmaForm;
import activity.alarma.MainScreen;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AlarmaTest {

    MainScreen mainScreen = new MainScreen();
    CreateAlarmaForm createAlarmaForm = new CreateAlarmaForm();
    ConfigurationAlarmaForm configurationAlarmaForm = new ConfigurationAlarmaForm();

    @Test
    public void verifyCreateAlarma(){

        String vhora = "5";
        String vminuto = "30";
        String valorEsperado = "5:30 PM";
        mainScreen.selectAlarmaButton.click();
        mainScreen.addAlarmaButton.click();
        createAlarmaForm.goAlarmaButton.click();
        createAlarmaForm.getHour.setText(vhora);
        createAlarmaForm.getMinute.setText(vminuto);
        createAlarmaForm.saveAlarmaButton.click();
        configurationAlarmaForm.selectRepeatButoon.click();
        configurationAlarmaForm.selectCollapseAlarma.click();

        Assertions.assertTrue(!mainScreen.isAlarmDisplayed(valorEsperado),
                "ERROR, the Alarm was not created");

    }
}
