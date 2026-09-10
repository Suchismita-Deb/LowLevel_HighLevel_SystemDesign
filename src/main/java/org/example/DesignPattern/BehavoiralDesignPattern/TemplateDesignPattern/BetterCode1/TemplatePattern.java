package org.example.DesignPattern.BehavoiralDesignPattern.TemplateDesignPattern.BetterCode1;

public class TemplatePattern {
    public static void main(String[] args) {
        CSVParser csvParser = new CSVParser();
        JsonParser jsonParser = new JsonParser();
        csvParser.parse();
        jsonParser.parse();
    }
}

abstract class DataParser{
    // Template method define the steps of the algorithm.
    public final void parse() {
        openFile();
        parseData();
        closeFile();
    }

    protected  void openFile(){
        System.out.println("Opening File");
    }
    protected abstract void parseData();    protected  void closeFile(){
        System.out.println("Closing File");
    }
    // The protected so that the child class can inherit.
}

// The class will never forget to implement any method and the childclass must implement the parseData().

class CSVParser extends DataParser{
    @Override
    protected void parseData() {
        System.out.println("Parsing CSV File");
    }
}

class JsonParser extends DataParser{
    @Override
    protected void parseData() {
        System.out.println("Parsing JSON File");
    }
}