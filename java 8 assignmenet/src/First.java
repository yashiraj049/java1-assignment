//Question 1:-Write the following a functional interface and implement it using lambda: -> First number is greater than second number or not Parameter (int ,int )
//Return boolean -> Increment the number by 1 and return incremented value Parameter (int) Return int -> Concatination of 2 string Parameter (String , String )
//Return (String) -> Convert a string to uppercase and return . Parameter (String) Return (String)



public class First {
        public static void main(String[] args) {
            // Compare Numbers
            CompareNumbers compareNumbers = (num1, num2) -> num1 > num2;
            System.out.println("Is 10 greater than 5? " + compareNumbers.compare(10, 5));
            System.out.println("Is 5 greater than 10? " + compareNumbers.compare(5, 10));

            // Increment Number
            IncrementNumber incrementNumber = num -> num + 1;
            System.out.println("Increment 10 by 1: " + incrementNumber.increment(10));
            System.out.println("Increment 20 by 1: " + incrementNumber.increment(20));

            // Concatenate Strings
            ConcatenateStrings concatenateStrings = (str1, str2) -> str1 + str2;
            System.out.println("Concatenate 'Hello' and ' World': " + concatenateStrings.concatenate("Hello", " World"));
            System.out.println("Concatenate 'Java' and ' Programming': " + concatenateStrings.concatenate("Java", " Programming"));

            // Convert to Uppercase
            ConvertToUppercase convertToUppercase = String::toUpperCase;
            System.out.println("Convert 'hello world' to uppercase: " + convertToUppercase.convert("hello world"));
            System.out.println("Convert 'java programming' to uppercase: " + convertToUppercase.convert("java programming"));
        }


}
