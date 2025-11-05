package behavioural.command;

public class App {
    public static void main(String[] args) {
        GameCharacter gameCharacter = new GameCharacter("Poaz");
        GameController gameController = new GameController();

        gameController.queueCommand(new MoveForwardCommand(gameCharacter));
        gameController.queueCommand(new JumpCommand(gameCharacter));
        gameController.queueCommand(new AttackCommand(gameCharacter));

        gameController.undoLastCommand(); // No in list

        gameController.executeCommands();

        gameController.undoLastCommand(); // undo attack
        gameController.undoLastCommand(); // undo jump
        gameController.undoLastCommand(); // .undo forwards
        gameController.undoLastCommand(); // no command anymore

    }
}
