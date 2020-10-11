package pages.Todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class EmailRegisterPage {

    public TextBox emailTextBox= new TextBox(By.id("email"), "[Email] TexBox en email register page");
    public Button registerEmailButton= new Button(By.id("step_one_submit"), "[Accept] Button accept email register");
}
