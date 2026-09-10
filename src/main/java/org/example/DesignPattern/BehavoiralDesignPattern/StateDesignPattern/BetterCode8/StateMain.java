package org.example.DesignPattern.BehavoiralDesignPattern.StateDesignPattern.BetterCode8;

import java.util.Scanner;

// State interface
interface State {
    void pressPlay();
    void pressStop();
    void pressPause();
    void display();
}

// PlayingState class
class PlayingState implements State {
    @Override
    public void pressPlay() {
        System.out.println("Starting playback");
    }

    @Override
    public void pressStop() {
        System.out.println("Stopping playback");
    }

    @Override
    public void pressPause() {
        System.out.println("Pausing playback");
    }

    @Override
    public void display() {
        System.out.println("Current State: Playing");
    }
}

// PausedState class
class PausedState implements State {
    @Override
    public void pressPlay() {
        System.out.println("Resuming playback");
    }

    @Override
    public void pressStop() {
        System.out.println("Stopping playback from pause");
    }

    @Override
    public void pressPause() {
        System.out.println("Pausing playback");
    }

    @Override
    public void display() {
        System.out.println("Current State: Paused");
    }
}

// StoppedState class
class StoppedState implements State {
    @Override
    public void pressPlay() {
        System.out.println("Starting playback");
    }

    @Override
    public void pressStop() {
        System.out.println("Stopping playback");
    }

    @Override
    public void pressPause() {
        System.out.println("Can't pause. Media is already stopped");
    }

    @Override
    public void display() {
        System.out.println("Current State: Stopped");
    }
}

// MediaPlayer class
class MediaPlayer {
    private State state;

    public MediaPlayer() {
        // Initial state is PlayingState it is set by default. It will be there without any input.
        this.state = new PlayingState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public void play() {
        state.pressPlay();
    }

    public void stop() {
        state.pressStop();
    }

    public void pause() {
        state.pressPause();
    }

    public void displayState() {
        state.display();
    }
}
// Main runner
public class StateMain {

    public static void main(String[] args) {
        MediaPlayer mediaPlayer = new MediaPlayer();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter command (Play, Pause, Stop):");
        String choice = sc.next();

        switch (choice) {
            case "Play":
                mediaPlayer.play();
                break;
            case "Pause":
                mediaPlayer.setState(new PausedState());
                mediaPlayer.pause();
                break;
            case "Stop":
                mediaPlayer.setState(new StoppedState());
                mediaPlayer.stop();
                break;
            default:
                System.out.println("Invalid choice");
        }

        mediaPlayer.displayState();
        sc.close();
    }
}
