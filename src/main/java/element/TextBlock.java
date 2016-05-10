package element;

import org.openqa.selenium.WebElement;
import ru.yandex.qatools.htmlelements.element.TypifiedElement;

/**
 * Represents text block on a web page.
 *
 * @author Behruz Afzali xy6er@yandex-team.ru
 */
public class TextBlock extends TypifiedElement {
    public TextBlock(WebElement wrappedElement) {
        super(wrappedElement);
    }

    /**
     * Returns text contained in text block.
     */
    public String getText() {
        return getWrappedElement().getText();
    }
}
