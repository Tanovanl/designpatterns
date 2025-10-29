package structural.facade;

class DVDPlayer {
    void on() { System.out.println("DVD Player ON"); }
    void play(String movie) { System.out.println("Playing movie: " + movie); }
    void off() { System.out.println("DVD Player OFF"); }
}

class Projector {
    void on() { System.out.println("Projector ON"); }
    void setWideScreen() { System.out.println("Projector in widescreen mode"); }
    void off() { System.out.println("Projector OFF"); }
}

class SoundSystem {
    void on() { System.out.println("Sound System ON"); }
    void setSurroundSound() { System.out.println("Surround sound mode"); }
    void off() { System.out.println("Sound System OFF"); }
}

class Lights {
    void dim() { System.out.println("Lights dimmed"); }
    void on() { System.out.println("Lights ON"); }
}