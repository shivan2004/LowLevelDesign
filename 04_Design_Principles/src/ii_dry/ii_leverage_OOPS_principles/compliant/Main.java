package ii_dry.ii_leverage_OOPS_principles.compliant;

abstract class Button {
    public abstract void onClick();
    public void animation() {
        System.out.println("Animation");
    }
}

class SubmitButton extends Button {
    @Override
    public void onClick() {
        animation();
        System.out.println("Form Submitted");
    }
}

class CancelButton extends Button {
    @Override
    public void onClick() {
        animation();
        System.out.println("Action Cancelled");
    }
}



public class Main {
    public static void main(String[] args) {
        Button submit = new SubmitButton();
        submit.onClick();

        Button cancel = new CancelButton();
        cancel.onClick();
    }
}
