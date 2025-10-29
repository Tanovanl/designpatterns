package structural.facade;

class HomeTheaterFacade {
    private DVDPlayer dvd;
    private Projector projector;
    private SoundSystem sound;
    private Lights lights;

    public HomeTheaterFacade(DVDPlayer dvd, Projector projector, SoundSystem sound, Lights lights) {
        this.dvd = dvd;
        this.projector = projector;
        this.sound = sound;
        this.lights = lights;
    }

    public void watchMovie(String movie) {
        System.out.println("\nGet ready to watch a movie...");
        lights.dim();
        projector.on();
        projector.setWideScreen();
        sound.on();
        sound.setSurroundSound();
        dvd.on();
        dvd.play(movie);
    }

    public void endMovie() {
        System.out.println("\nShutting down the theater...");
        dvd.off();
        sound.off();
        projector.off();
        lights.on();
    }
}
