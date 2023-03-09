package techproed.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import techproed.utilities.Driver;

public class TechproLoginPage {
   /* https://testcenter.techproeducation.com/index.php?page=form-authentication
    Page object Model kullanarak sayfaya giriş yapildigini test edin
    Sayfadan cikis yap ve cikis yapildigini test et
    techproed
            SuperSecretPassword
    TechproLoginPage
    userName
    password
    submitButton
    TechproHomePage
    homeHeader
    homeLogoutButton
    TEST:
    Class: TechproLoginTest
    Metot : loginTest()*/
   //    Page Objelerini bu sinifda buluruz
//    1. constructor
   public TechproLoginPage(){
//        PageFactory seleniumdan gelen ve bu sayfa elementlerini baslangic degeri vermek etmek icin kullanilir
//        Bu sekilde Sayfa objeleri cagrildiginda null pointer exception alinmaz
       PageFactory.initElements(Driver.getDriver(),this);

       }
    @FindBy(id="exampleInputEmail1")
    public WebElement username;
   @FindBy(id = "exampleInputPassword1")
    public WebElement password;
   @FindBy(xpath = "//*[text()='Submit']")
    public WebElement submit;

   }

