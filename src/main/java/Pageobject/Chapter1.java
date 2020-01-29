package Pageobject;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;

public class Chapter1 {

    public void Assert_that_this_text_is_on_the_page(){
        $(byText("Assert that this text is on the page"))
                .shouldBe(visible)
                .shouldHave(text("Assert that this text is on the page"));
    }

    public HomePage ReturnHomePage(){
        $(byText("Home Page"))
                .shouldBe(visible)
                .shouldHave(text("Home Page"))
                .click();
        return new HomePage();

    }
}
