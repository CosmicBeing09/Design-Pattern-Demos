package behavioral_design_patterns.memento;

public class Client {

    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor("Hello, World!");
        History history = new History();

        // Save the initial state
        history.addMemento(textEditor.save());

        // Make some changes
        textEditor.setContent("Hello, OpenAI!");
        // Save the new state
        history.addMemento(textEditor.save());

        // Make more changes
        textEditor.setContent("Hello, GPT-3!");

        // Restore the first state
        textEditor.restore(history.getMemento(0));
        System.out.println(textEditor.getContent());  // Output: Hello, World!

        // Restore the second state
        textEditor.restore(history.getMemento(1));
        System.out.println(textEditor.getContent());  // Output: Hello, OpenAI!
    }
}
