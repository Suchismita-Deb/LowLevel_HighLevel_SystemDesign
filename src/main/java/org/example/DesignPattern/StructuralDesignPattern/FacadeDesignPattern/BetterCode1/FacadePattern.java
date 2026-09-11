package org.example.DesignPattern.StructuralDesignPattern.FacadeDesignPattern.BetterCode1;

import java.util.Scanner;

// Main Exercise class demonstrating usage of the Home Theater Facade
public class FacadePattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();

        int dimmingPercentage = sc.nextInt();
        int volumeLevel = sc.nextInt();

        // Initiate the movie-watching experience
        homeTheater.watchMovie(dimmingPercentage, volumeLevel);

        sc.close();
    }
}

// Facade class that simplifies interaction with multiple components
class HomeTheaterFacade {
    private DVDPlayer dvdPlayer;
    private Projector projector;
    private SoundSystem soundSystem;
    private LightingControl lightingControl;

    public HomeTheaterFacade() {
        this.dvdPlayer = new DVDPlayer();
        this.projector = new Projector();
        this.soundSystem = new SoundSystem();
        this.lightingControl = new LightingControl();
    }

    public void watchMovie(int dimmingPercentage, int volumeLevel) {
        System.out.println("Get ready to watch a movie");

        lightingControl.dim(dimmingPercentage);
        projector.on();
        projector.setInput();
        soundSystem.on();
        soundSystem.setVolume(volumeLevel);
        dvdPlayer.play();

        System.out.println("Movie is ready to watch!");
    }
}

// DVD Player component
class DVDPlayer {
    public void play() {
        System.out.println("DVD Player: Playing the movie");
    }
    public void pause() {
        System.out.println("DVD Player: Paused the movie");
    }
    public void stop() {
        System.out.println("DVD Player: Stopped the movie");
    }
}

// Projector component
class Projector {
    public void on() {
        System.out.println("Projector: Turned on");
    }
    public void off() {
        System.out.println("Projector: Turned off");
    }
    public void setInput() {
        System.out.println("Projector: Input set to DVD");
    }
}

// Sound System component
class SoundSystem {
    public void on() {
        System.out.println("Sound System: Turned on");
    }
    public void off() {
        System.out.println("Sound System: Turned off");
    }
    public void setVolume(int level) {
        System.out.println("Sound System: Volume set to " + level);
    }
}

// Lighting Control component
class LightingControl {
    public void dim(int level) {
        System.out.println("Lighting Control: Dimming lights to " + level + "%");
    }
    public void on() {
        System.out.println("Lighting Control: Lights are on");
    }
    public void off() {
        System.out.println("Lighting Control: Lights are off");
    }
}
