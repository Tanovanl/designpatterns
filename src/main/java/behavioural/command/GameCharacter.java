package behavioural.command;

class GameCharacter {
    private String name;

    public GameCharacter(String name) {
        this.name = name;
    }

    public void moveForward() {
        System.out.println(name + " moves forward");
    }

    public void moveBackward() {
        System.out.println(name + " moves backward");
    }

    public void jump() {
        System.out.println(name + " jumps");
    }

    public void attack() {
        System.out.println(name + " attacks!");
    }

    @Override
    public String toString(){
        return "[PLAYER] " + name + ":";
    }
}

