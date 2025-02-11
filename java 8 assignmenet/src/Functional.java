//Question 1:-Write the following a functional interface and implement it using lambda: -> First number is greater than second number or not Parameter (int ,int )
//Return boolean -> Increment the number by 1 and return incremented value Parameter (int) Return int -> Concatination of 2 string Parameter (String , String )
//Return (String) -> Convert a string to uppercase and return . Parameter (String) Return (String)

@FunctionalInterface
interface CompareNumbers {
    boolean compare(int num1, int num2);
}

@FunctionalInterface
interface IncrementNumber {
    int increment(int num);
}

@FunctionalInterface
interface ConcatenateStrings {
    String concatenate(String str1, String str2);
}

@FunctionalInterface
interface ConvertToUppercase {
    String convert(String str);
}