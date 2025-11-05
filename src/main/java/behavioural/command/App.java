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

        Command move = new MoveForwardCommand(gameCharacter);
        Command jump = new JumpCommand(gameCharacter);
        Command attack = new AttackCommand(gameCharacter);

        MacroCommand combo = new MacroCommand();
        combo.addCommand(move);
        combo.addCommand(jump);
        combo.addCommand(attack);

        // Voer macro uit via controller
        gameController.execute(combo);
        gameController.undoLastCommand();
    }
}
