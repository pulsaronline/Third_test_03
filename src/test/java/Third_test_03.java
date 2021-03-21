import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class Third_test_03 {

    @BeforeAll
    public static void setup() {
        //use 800x600 browser dimension
        Configuration.browserSize="800x400";
        //Configuration.startMaximized = true;
    }

    @Test
    void dragAndDropSelenideTest() {
        //- Откройте https://the-internet.herokuapp.com/drag_and_drop
        open("https://github.com/selenide/selenide");
        sleep(5000);
        SelenideElement blockContributors = $(".BorderGrid")
        .$(byText("Contributors"));
        blockContributors.closest("div").$("ul li").hover();
        sleep(5000);

    }
}
