package structural.composite;

import com.sun.net.httpserver.Headers;

public class GUI {
    public static void main(String[] args) {
        Panel panel = new Panel("Spotify");

        Panel header = new Panel("Title");
        Label title = new Label("TanoMusic");

        panel.add(header);
        header.add(title);


        Panel songPanel = new Panel("Songs");
        Button playBtn = new Button("Play");
        Label songLbl = new Label("Miami");

        panel.add(songPanel);

        songPanel.add(playBtn);
        songPanel.add(songLbl);

        panel.render("");
    }
}
