package refactoring_guru.aa_factory_method.example.factory;

import refactoring_guru.aa_factory_method.example.buttons.Button;
import refactoring_guru.aa_factory_method.example.buttons.WindowsButton;

/**
 * Диалог на элементах операционной системы.
 */
public class WindowsDialog extends Dialog {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
