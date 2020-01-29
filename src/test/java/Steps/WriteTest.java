package Steps;

import Pageobject.Chapter1;
import Pageobject.Config;
import Pageobject.HomePage;
import org.testng.Assert;
import org.testng.annotations.Test;


public class WriteTest extends Config {
    HomePage homepage = new HomePage();
    Chapter1 chapter1 = new Chapter1();

    @Test
    public void OpenHomePage(){
        homepage.OpenHomePage();
        // as variant Assert.assertEquals(title(), "Selenium: Beginners Guide");
    }
    @Test
    public void SearchChapter1(){
        homepage.SearchChapter1Link();
    }
    @Test
    public void Assert_that_this_text_is_on_the_page(){
        chapter1.Assert_that_this_text_is_on_the_page();
    }
    @Test
    public void ReturnHomePage(){
       chapter1.ReturnHomePage();
    }

}
