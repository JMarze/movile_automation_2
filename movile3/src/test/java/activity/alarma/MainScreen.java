package activity.alarma;

import appiumControl.Button;
import appiumControl.Label;
import org.openqa.selenium.By;


public class MainScreen {
    public MainScreen(){}
    public Button selectAlarmaButton = new Button(By.xpath("//android.widget.TextView[@text='ALARM']"));
    public Button addAlarmaButton = new Button(By.id("com.google.android.deskclock:id/fab"));

    public boolean isAlarmDisplayed(String title){
        Label note= new Label(By.xpath("//android.widget.TextView[@text='"+title+"']"));
        return note.isControlDisplayed();
    }

}
