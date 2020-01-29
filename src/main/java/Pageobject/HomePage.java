package Pageobject;

import com.codeborne.selenide.Selenide;

import static com.codeborne.selenide.Condition.*;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;


public class HomePage  {

    public void OpenHomePage(){
        Selenide.open("/");
        $("title").shouldHave(attribute("text", "Selenium: Beginners Guide"));
    }

    public Chapter1 SearchChapter1Link(){
        $(byText("Chapter1"))
                .shouldBe(visible)
                .shouldHave(text("Chapter1"))
                .click();
        return new Chapter1();


    }

}
