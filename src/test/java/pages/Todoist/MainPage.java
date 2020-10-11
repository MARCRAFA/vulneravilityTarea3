package pages.Todoist;
import control.Button;
import org.openqa.selenium.By;

public class MainPage {

    public Button registerButton= new Button(By.xpath("//*[@id=\"__next\"]/div/main/div[1]/header/nav/div/ul[2]/li[2]/a\n"), "[Register] Button register in main page");

    public MainPage(){}
}
