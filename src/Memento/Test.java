package Memento;

public class Test {
    public static void main(String[] args) {
        var editor = new Editor();
        editor.setContent("a");
        System.out.println(editor.getContent());
        editor.setContent("b");
        System.out.println(editor.getContent());
        System.out.println(editor.getPrevContent());
        editor.undo();
        System.out.println(editor.getContent());
        System.out.println(editor.getPrevContent());
    }
}
