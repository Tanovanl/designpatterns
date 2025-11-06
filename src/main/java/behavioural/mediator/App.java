package behavioural.mediator;

public class App {
    public static void main(String[] args) {
        ChatMediator chatRoom = new ChatRoomMediator();

        User user1 = new ChatUser(chatRoom, "Alice");
        User user2 = new ChatUser(chatRoom, "Bob");
        User user3 = new ChatUser(chatRoom, "Charlie");

        chatRoom.addUser(user1);
        chatRoom.addUser(user2);
        chatRoom.addUser(user3);

        user1.send("Hello everyone!");
    }
}
