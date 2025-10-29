package structural.facade;

public class HomeTheaterClient {
    public static void main(String[] args) {
        // Create subsystem components
        DVDPlayer dvd = new DVDPlayer();
        Projector projector = new Projector();
        SoundSystem sound = new SoundSystem();
        Lights lights = new Lights();

        // Create the facade
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(dvd, projector, sound, lights);

        // Use the facade to watch a movie
        homeTheater.watchMovie("Inception");
        homeTheater.endMovie();
    }
}