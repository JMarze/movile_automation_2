package activity.whenDo;

import appiumControl.Button;
import org.openqa.selenium.By;

public class DeleteNote {
    public Button deleteNoteButton = new Button(By.xpath("//android.widget.TextView[@content-desc=\"Delete\"]"));
    public Button confirmDeleteNoteButton = new Button(By.id("android:id/button1"));
}
