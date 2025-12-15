package ii_dry.ii_leverage_OOPS_principles.non_compliant;

class SubmitButton {
    void onClick() {
        System.out.println("Form Submitted");
    }

    //duplication of animation method
    void animation() {
        System.out.println("Animation");
    }
}

class CancelButton {
    void onClick() {
        System.out.println("Action Cancelled");
    }
    void animation() {
        System.out.println("Animation");
    }
}

public class Main {
    public static void main(String[] args) {
        SubmitButton submitButton = new SubmitButton();
        submitButton.onClick();

        CancelButton cancelButton = new CancelButton();
        cancelButton.onClick();
    }
}
