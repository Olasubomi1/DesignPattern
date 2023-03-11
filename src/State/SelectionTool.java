package State;

public class SelectionTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Draw icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dash rectangle");
    }
}
