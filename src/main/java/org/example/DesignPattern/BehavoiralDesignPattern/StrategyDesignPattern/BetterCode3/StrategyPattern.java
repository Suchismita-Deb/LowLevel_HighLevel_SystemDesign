package org.example.DesignPattern.BehavoiralDesignPattern.StrategyDesignPattern.BetterCode3;

import java.util.Scanner;

public class StrategyPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Document document = new Document();

        System.out.print("Enter text to format - ");
        String userInput = sc.nextLine();
        document.setContent(userInput);

        // PlainTextFormatter
        document.setFormatter(new PlainTextFormatter());
        System.out.print("Plain Text - ");
        document.display();

        // HTMLFormatter
        document.setFormatter(new HTMLFormatter());
        System.out.print("HTML Format - ");
        document.display();

        // MarkdownFormatter
        document.setFormatter(new MarkdownFormatter());
        System.out.print("Markdown Format - ");
        document.display();

        sc.close();
    }
}
// Document class
class Document {
    private String content;
    private TextFormatter formatter;

    public void setContent(String content) {
        this.content = content;
    }

    public void setFormatter(TextFormatter formatter) {
        this.formatter = formatter;
    }

    public void display() {
        System.out.println(formatter.format(content));
    }
}

// Strategy interface
interface TextFormatter {
    String format(String text);
}

// Concrete strategies
class PlainTextFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return text;
    }
}

class HTMLFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return "<html><body>" + text + "</body></html>";
    }
}

class MarkdownFormatter implements TextFormatter {
    @Override
    public String format(String text) {
        return "**" + text + "**";
    }
}
