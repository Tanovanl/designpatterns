package behavioural.command;
import java.util.*;

class MacroCommand implements Command {
    private List<Command> commands = new ArrayList<>();

    public void addCommand(Command cmd) {
        commands.add(cmd);
    }

    @Override
    public void execute() {
        System.out.println("▶️ Executing macro...");
        for (Command cmd : commands) {
            cmd.execute();
        }
    }

    @Override
    public void undo() {
        System.out.println("⏪ Undoing macro...");
        // Undo in omgekeerde volgorde (belangrijk!)
        ListIterator<Command> it = commands.listIterator(commands.size());
        while (it.hasPrevious()) {
            it.previous().undo();
        }
    }
}
