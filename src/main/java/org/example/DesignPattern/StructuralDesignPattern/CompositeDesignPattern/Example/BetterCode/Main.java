package org.example.DesignPattern.StructuralDesignPattern.CompositeDesignPattern.Example.BetterCode;

public class Main {
    public static void main(String[] args) {
        Directory codeDirectory = new Directory("Leetcode");
        File fileName = new File("Practice.java");
        codeDirectory.add(fileName);

        Directory dpDirectory = new Directory("Dynamic Problem");
        File Knapsack = new File("Knapsack.java");
        dpDirectory.add(Knapsack);
        codeDirectory.add(dpDirectory);

        codeDirectory.ls();
    }
}
