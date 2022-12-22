package refactoring_guru.cd_mediator.example.components;

import refactoring_guru.cd_mediator.example.mediator.Mediator;

/**
 * Общий интерфейс компонентов.
 */
public interface Component {
    void setMediator(Mediator mediator);
    String getName();
}
