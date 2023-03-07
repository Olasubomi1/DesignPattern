package State;

public class Canvas {
    private ToolType currentTool;

    public void MouseDown(){
        if(currentTool == ToolType.SELECTION){
            System.out.println("Selection icon");
        } else if (currentTool == ToolType.BRUSH) {
            System.out.println("Brush icon");
        }else if (currentTool == ToolType.ERASER){
            System.out.println("Eraser icon");
        }
    }

    public void MouseUp(){
        if(currentTool == ToolType.SELECTION){
            System.out.println("Selection: Draw dash rectangle");
        } else if (currentTool == ToolType.BRUSH) {
            System.out.println("Brush: Draw a line");
        }else if (currentTool == ToolType.ERASER){
            System.out.println("Eraser: Erase the line");
        }
    }

    public ToolType getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(ToolType currentTool) {
        this.currentTool = currentTool;
    }

}
