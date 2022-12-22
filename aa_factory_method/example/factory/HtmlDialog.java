package refactoring_guru.aa_factory_method.example.factory;

import refactoring_guru.aa_factory_method.example.buttons.Button;
import refactoring_guru.aa_factory_method.example.buttons.HtmlButton;

/**
 * HTML-диалог.
 */
public class HtmlDialog extends Dialog {

    @Override
    public Button createButton() {
        return new HtmlButton();
    }
}
