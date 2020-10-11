package pages.Todoist;

import control.Button;
import org.openqa.selenium.By;

public class ThemePage {
    public Button themeButton= new Button(By.xpath("/html/body/div[2]/div[2]/div/ul/li[4]/a"), "[Theme] Button change theme");
    public Button createButton= new Button(By.xpath("/html/body/div[2]/div[2]/button"), "[Accept] Button accept theme");
}
