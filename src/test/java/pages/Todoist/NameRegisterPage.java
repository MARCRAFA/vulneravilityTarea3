package pages.Todoist;

import control.Button;
import control.TextBox;
import org.openqa.selenium.By;

public class NameRegisterPage {

    public TextBox nameTextBox= new TextBox(By.id("full_name"), "[FullName] TexBox for register name");
    public TextBox passwordTextBox= new TextBox(By.id("pwd"), "[Password] TexBox for register password");
    public Button registerNowButton= new Button(By.id("step_two_submit"), "[Register Name] Button accept register name");
}
