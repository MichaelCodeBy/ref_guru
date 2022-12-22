package refactoring_guru.cg_state.example;

import refactoring_guru.cg_state.example.ui.Player;
import refactoring_guru.cg_state.example.ui.UI;

/**
 * Демо-класс. Здесь всё сводится воедино.
 */
public class Demo {
    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
