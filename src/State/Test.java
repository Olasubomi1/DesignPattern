package State;

public class Test {
    public static void main(String[] args) {
        Canvas canvas = new Canvas();
        canvas.setCurrentTool(new SelectionTool());
        canvas.MouseDown();
        canvas.MouseUp();
        canvas.setCurrentTool(new BrushTool());
        canvas.MouseDown();
        canvas.MouseUp();
    }
}
