package behavioural.mediator;

abstract class User {
    protected ChatMediator mediator;
    protected String name;

    public User(ChatMediator chatMediator, String name){
        this.mediator = chatMediator;
        this.name = name;
    }

    public abstract void send(String message);
    public abstract void receive(String message);
}

class ChatUser extends User {
    public ChatUser(ChatMediator chatMediator, String name){
        super(chatMediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(this.name + " sends: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(this.name + " receives: " + message);
    }
}