package behavioural.command;

class MoveForwardCommand implements Command {
    private GameCharacter character;

    public MoveForwardCommand(GameCharacter character) {
        this.character = character;
    }

    public void execute() {
        character.moveForward();
    }
    public void undo() {
        character.moveBackward();
    }
}

class JumpCommand implements Command {
    private GameCharacter character;

    public JumpCommand(GameCharacter character) {
        this.character = character;
    }
    public void execute() {
        character.jump();
    }
    public void undo() {
        System.out.println(character + " lands back down");
    }
}

class AttackCommand implements Command {
    private GameCharacter character;

    public AttackCommand(GameCharacter character) {
        this.character = character;
    }
    public void execute() {
        character.attack();
    }
    public void undo() {
        System.out.println("Undo attack: " + character + " lowers weapon");
    }
}
