package org.example.DesignPattern.CreationalDesignPattern.AbstractFactoryPattern.BetterCode;

public class AbstractFactoryPattern {

    private Button button;
    private Scroll scroll;
    AbstractFactoryPattern(UIFactory uiFactory) {
        this.button = uiFactory.createButton();
        this.scroll = uiFactory.createScroll();
    }
    public void renderUI(){
        button.render();

        scroll.scroll();
    }
    public static void main(String[] args) {
        UIFactory windowFactory = new WindowFactory();
        AbstractFactoryPattern app = new AbstractFactoryPattern(windowFactory);
        app.renderUI(); // Window component are all grouped in the window Factory and the Mac are grouped in mac.
    }
}
interface UIFactory{
    Button createButton();
    Scroll createScroll();
}
class WindowFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new WindowButton();
    }
    @Override
    public Scroll createScroll() {
        return new WindowScrollBar();
    }
}
class MacOSFactory implements UIFactory{
    @Override
    public Button createButton() {
        return new MacOsButton();
    }
    @Override
    public Scroll createScroll() {
        return new MacOsScrollBar();
    }
}
interface Button{
    void render();
}
interface Scroll{
    void scroll();
}
// Window UI components.
class WindowButton implements Button {
    public void render() {
        System.out.println("Rendering Window Button");
    }
}

class WindowScrollBar implements Scroll{
    public void scroll() {
        System.out.println("Scrolling Window Scroll Bar");
    }
}

// Mac UI component.
class MacOsButton implements Button {
    public void render() {
        System.out.println("Rendering MacOs Button");
    }
}

class MacOsScrollBar implements Scroll{
    public void scroll() {
        System.out.println("Scrolling MacOs Scroll Bar");
    }
}