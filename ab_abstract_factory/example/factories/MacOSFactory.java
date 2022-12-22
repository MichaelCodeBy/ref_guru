package refactoring_guru.ab_abstract_factory.example.factories;

import refactoring_guru.ab_abstract_factory.example.buttons.Button;
import refactoring_guru.ab_abstract_factory.example.buttons.MacOSButton;
import refactoring_guru.ab_abstract_factory.example.checkboxes.Checkbox;
import refactoring_guru.ab_abstract_factory.example.checkboxes.MacOSCheckbox;

/**
 * Каждая конкретная фабрика знает и создаёт только продукты своей вариации.
 */
public class MacOSFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}