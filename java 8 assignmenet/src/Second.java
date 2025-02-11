//Question 2:-Using (instance) Method reference create and apply add and subtract method and using (Static) Method reference create
//and apply multiplication method for the functional interface created.



@FunctionalInterface
interface ArithmeticOperation {
    int operation(int a, int b);
}

public class Second {

        public int add(int a, int b) {
            return a + b;
        }

        public int subtract(int a, int b) {
            return a - b;
        }

        public static int multiply(int a, int b) {
            return a * b;
        }

        public static void main(String[] args) {
            Second calculator = new Second();


            ArithmeticOperation addition = calculator::add;
            System.out.println("Addition: " + addition.operation(10, 5));


            ArithmeticOperation subtraction = calculator::subtract;
            System.out.println("Subtraction: " + subtraction.operation(10, 5));


            ArithmeticOperation multiplication = Second::multiply;
            System.out.println("Multiplication: " + multiplication.operation(10, 5));
        }

}
