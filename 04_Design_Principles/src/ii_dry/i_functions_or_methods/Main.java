package ii_dry.i_functions_or_methods;

class NumberSwapper {
    //non-dry approach
    public void processNumbersNonDry() {
        int a = 5;
        int b = 10;

        int temp = a;
        a = b;
        b = temp;

        //later in code, swap different numbers
        int x = 20;
        int y = 30;

        //repeating logic
        temp = x;
        x = y;
        y = temp;
    }

    //dry approach - creating a reusable swap method
    public void swap(int[] numbers) {
        if(numbers.length >= 2) {
            int temp = numbers[0];
            numbers[0] = numbers[1];
            numbers[1] = temp;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        NumberSwapper numberSwapper = new NumberSwapper();
        int[] numbers = new int[]{5, 7};
        System.out.println("Before Swap : " + numbers[0] + ", " + numbers[1]);

        numberSwapper.swap(numbers);
        System.out.println("After Swap : " + numbers[0] + ", " + numbers[1]);
    }
}
