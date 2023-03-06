package Memento;

public class Editor {
    private String content;
    private String prevContent;

    public String getPrevContent() {
        return prevContent;
    }

    public void undo(){
        if (prevContent.equals(null))
            return;
        else if (prevContent.length() > 0) {
            content = prevContent;
        }
    }
    
    public void setContent(String content) {
        this.prevContent = getContent();
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
