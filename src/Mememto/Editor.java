package Mememto;

public class Editor {
    private String content;
    private String oldContent;


    public String getOldContent() {
        return oldContent;
    }

    public void undo(){
        if (oldContent.equals(null))
            return;
        else if (oldContent.length() > 0) {
            content = oldContent;
        }
    }
    
    public void setContent(String content) {
        this.oldContent = getContent();
        this.content = content;
    }

    public String getContent() {
        return content;
    }

}
