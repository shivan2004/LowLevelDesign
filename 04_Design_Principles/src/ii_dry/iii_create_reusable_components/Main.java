package ii_dry.iii_create_reusable_components;

class Button {
    private final String label;
    public Button(String label) {
        this.label = label;
    }

    public void render() {
        System.out.println("Rendering Button : " + label);
    }
}

public class Main {
    public static void main(String[] args) {
        Button submitButton = new Button("Submit");
        submitButton.render();

        Button cancelButton = new Button("Cancel");
        cancelButton.render();
    }
}
