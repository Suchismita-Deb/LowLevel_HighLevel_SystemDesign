package org.example.DesignPattern.BehavoiralDesignPattern.TemplateDesignPattern.ProblematicCode;

public class NoTemplatePattern {
    public static void main(String[] args) {
        CSVParser csvParser = new CSVParser();
        JsonParser jsonParser = new JsonParser();
        csvParser.parse();
    }

}

class CSVParser {
    public void parse() {
        openFile();
        // ParseLogic
        closeFile();
    }

    public void openFile() {
        System.out.println("Opening file...");
    }

    public void closeFile() {
        System.out.println("Closing file...");
    }
}

class JsonParser {
}

