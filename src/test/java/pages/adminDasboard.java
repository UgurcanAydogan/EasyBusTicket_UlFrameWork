package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class adminDasboard {

    public adminDasboard(){
        PageFactory.initElements(Driver.getDriver(),this);}
}