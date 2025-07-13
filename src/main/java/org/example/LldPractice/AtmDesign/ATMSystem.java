package org.example.LldPractice.AtmDesign;

// Singleton ATM Machine

// Factory Pattern
interface ATMComponent {
  void operate();
}

class ATMMachine {
  private static ATMMachine instance;

  private ATMMachine() {}

  public static ATMMachine getInstance() {
    if (instance == null) {
      instance = new ATMMachine();
    }
    return instance;
  }

  public void startSession() {
    System.out.println("Session Started");
    ATMComponentFactory factory = new ATMComponentFactory();
    CardReader cardReader = (CardReader) factory.createComponent("CardReader");
    cardReader.readCard();
  }
}

class CardReader implements ATMComponent {
  public void readCard() {
    System.out.println("Reading ATM Card...");
  }

  @Override
  public void operate() {
    readCard();
  }
}

class Keypad implements ATMComponent {
  public void inputPin() {
    System.out.println("Entering PIN...");
  }

  @Override
  public void operate() {
    inputPin();
  }
}

class Screen implements ATMComponent {
  public void displayMessage(String message) {
    System.out.println("Screen: " + message);
  }

  @Override
  public void operate() {
    displayMessage("Welcome to ATM");
  }
}

class CashDispenser implements ATMComponent {
  public void dispenseCash(double amount) {
    System.out.println("Dispensing: $" + amount);
  }

  @Override
  public void operate() {
    dispenseCash(100.0);
  }
}

class Printer implements ATMComponent {
  public void printReceipt() {
    System.out.println("Printing Receipt...");
  }

  @Override
  public void operate() {
    printReceipt();
  }
}

class NetworkInfrastructure implements ATMComponent {
  public void connect() {
    System.out.println("Connecting to Bank System...");
  }

  @Override
  public void operate() {
    connect();
  }
}

class ATMComponentFactory {
  public ATMComponent createComponent(String type) {
    switch (type) {
      case "CardReader":
        return new CardReader();
      case "Keypad":
        return new Keypad();
      case "Screen":
        return new Screen();
      case "CashDispenser":
        return new CashDispenser();
      case "Printer":
        return new Printer();
      case "NetworkInfrastructure":
        return new NetworkInfrastructure();
      default:
        throw new IllegalArgumentException("Invalid Component Type");
    }
  }
}

// Main class to run the ATM
public class ATMSystem {
  public static void main(String[] args) {
    ATMMachine atmMachine = ATMMachine.getInstance();
    atmMachine.startSession();
  }
}
