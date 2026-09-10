package org.example.DesignPattern.CreationalDesignPattern.AbstractFactoryPattern.ProblematicCode;

public class NoAbstractFactory {

    public static void main(String[] args) {
        WindowButton windowButton = new WindowButton();
        WindowScrollBar windowScrollBar = new WindowScrollBar();
        windowButton.render();
        windowScrollBar.scroll();

        // The window button and the scrollbar are connected. The window Button is created and the scroll bar created separately and there is no way to stop creating the mac scroll bar.
        // The issue is the window class are related and they are all should be created in a same group.

    }
}

// Window UI components.
class WindowButton {
    public void render() {
        System.out.println("Rendering Window Button");
    }
}

class WindowScrollBar {
    public void scroll() {
        System.out.println("Scrolling Window Scroll Bar");
    }
}

// Mac UI component.
class MacOsButton {
    public void render() {
        System.out.println("Rendering MacOs Button");
    }
}

class MacOsScrollBar {
    public void scroll() {
        System.out.println("Scrolling MacOs Scroll Bar");
    }
}