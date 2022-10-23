package activity.alarma;

import appiumControl.Button;
import org.openqa.selenium.By;

public class ConfigurationAlarmaForm {
    public Button selectRepeatButoon = new Button(By.id("com.google.android.deskclock:id/repeat_onoff"));
    public Button selectDaySundayButoon = new Button(By.id("Sunday"));
    public Button selectDaySaturdayButoon = new Button(By.id("Saturday"));
    public Button selectCollapseAlarma = new Button(By.xpath("//android.widget.ImageButton[@content-desc=\"Collapse alarm\"]"));
}
