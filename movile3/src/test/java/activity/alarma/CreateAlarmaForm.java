package activity.alarma;

import appiumControl.Button;
import appiumControl.TextBox;
import org.openqa.selenium.By;

public class CreateAlarmaForm {

    public Button goAlarmaButton = new Button(By.id("android:id/toggle_mode"));
    public TextBox getHour = new TextBox(By.id("android:id/input_hour"));
    public TextBox getMinute = new TextBox(By.id("android:id/input_minute"));
    public Button saveAlarmaButton = new Button(By.id("android:id/button1"));

}
