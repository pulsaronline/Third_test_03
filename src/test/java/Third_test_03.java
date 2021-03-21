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
        // Окно браузера на весь экран
        Configuration.startMaximized = true;
    }

    @Test
    void selenideContributorsTest() {
        //- Откройте https://the-internet.herokuapp.com/drag_and_drop
        open("https://github.com/selenide/selenide");
        // Создаем список контрибуторов blockContributors. В нем найдем самый первый элемент.
        SelenideElement blockContributors = $(".BorderGrid")
        .$(byText("Contributors"));
        // вызовем попап окно первого элемента
        blockContributors.closest("div").$("ul li").hover();
        // в попап окне проверим что это контрибутор-окно с текстом asolntsev
        $$(".Popover-message").findBy(visible).shouldHave(text("asolntsev"));
    }
}
