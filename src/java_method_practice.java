import java.util.*;
import java.util.Random;
import java.util.Arrays;
import java.util.Scanner;

//1. Simple Interest Program
class SimpleInterest {
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principal: ");
        double p = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        double r = sc.nextDouble();
        System.out.print("Enter Time (in years): ");
        double t = sc.nextDouble();

        double si = calculateSimpleInterest(p, r, t);
        System.out.println("The Simple Interest is " + si +
                " for Principal " + p + ", Rate of Interest " + r + " and Time " + t);
    }
}

//2. Maximum Handshakes
class Handshakes {
    public static int calculateHandshakes(int n) {
        return (n * (n - 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int students = sc.nextInt();

        int handshakes = calculateHandshakes(students);
        System.out.println("Maximum number of possible handshakes = " + handshakes);
    }
}

//3. Athlete in Triangular Park
class TriangularPark {
    public static double calculateRounds(double a, double b, double c) {
        double perimeter = a + b + c;
        double distance = 5000; // 5 km in meters
        return distance / perimeter;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter side1: ");
        double s1 = sc.nextDouble();
        System.out.print("Enter side2: ");
        double s2 = sc.nextDouble();
        System.out.print("Enter side3: ");
        double s3 = sc.nextDouble();

        double rounds = calculateRounds(s1, s2, s3);
        System.out.println("The athlete must complete " + Math.ceil(rounds) + " rounds to finish 5km.");
    }
}

//4. Positive, Negative, or Zero
class NumberCheck {
    public static int checkNumber(int num) {
        if (num > 0) return 1;
        else if (num < 0) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int result = checkNumber(n);
        if (result == 1) System.out.println("Positive Number");
        else if (result == -1) System.out.println("Negative Number");
        else System.out.println("Zero");
    }
}

//5. Spring Season Check
class SpringSeason {
    public static boolean isSpringSeason(int month, int day) {
        return (month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20);
    }

    public static void main(String[] args) {
        int month = Integer.parseInt(args[0]);
        int day = Integer.parseInt(args[1]);

        if (isSpringSeason(month, day))
            System.out.println("It's a Spring Season");
        else
            System.out.println("Not a Spring Season");
    }
}

//6. Sum of n Natural Numbers
class SumNatural {
    public static int findSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) sum += i;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        System.out.println("Sum of first " + n + " natural numbers = " + findSum(n));
    }
}

//7. Smallest and Largest of 3 Numbers
class SmallestLargest {
    public static int[] findSmallestAndLargest(int n1, int n2, int n3) {
        int smallest = Math.min(n1, Math.min(n2, n3));
        int largest = Math.max(n1, Math.max(n2, n3));
        return new int[]{smallest, largest};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 3 numbers: ");
        int a = sc.nextInt(), b = sc.nextInt(), c = sc.nextInt();

        int[] result = findSmallestAndLargest(a, b, c);
        System.out.println("Smallest = " + result[0] + ", Largest = " + result[1]);
    }
}

//8. Quotient and Remainder
class Division {
    public static int[] findRemainderAndQuotient(int number, int divisor) {
        return new int[]{number % divisor, number / divisor};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int num = sc.nextInt();
        System.out.print("Enter divisor: ");
        int div = sc.nextInt();

        int[] result = findRemainderAndQuotient(num, div);
        System.out.println("Remainder = " + result[0] + ", Quotient = " + result[1]);
    }
}

//9. Chocolate Distribution
class Chocolates {
    public static int[] findRemainderAndQuotient(int chocolates, int children) {
        return new int[]{chocolates % children, chocolates / children};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of chocolates: ");
        int chocolates = sc.nextInt();
        System.out.print("Enter number of children: ");
        int children = sc.nextInt();

        int[] result = findRemainderAndQuotient(chocolates, children);
        System.out.println("Each child gets " + result[1] + " chocolates and remaining = " + result[0]);
    }
}

//10. Wind Chill Calculation
class WindChill {
    public static double calculateWindChill(double temp, double windSpeed) {
        return 35.74 + 0.6215 * temp + (0.4275 * temp - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter temperature (F): ");
        double t = sc.nextDouble();
        System.out.print("Enter wind speed (mph): ");
        double w = sc.nextDouble();

        System.out.println("Wind Chill Temperature = " + calculateWindChill(t, w));
    }
}


//11. Trigonometric Functions
class Trigonometry {
    public static double[] calculateTrigonometricFunctions(double angle) {
        double rad = Math.toRadians(angle);
        return new double[]{Math.sin(rad), Math.cos(rad), Math.tan(rad)};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter angle in degrees: ");
        double angle = sc.nextDouble();

        double[] result = calculateTrigonometricFunctions(angle);
        System.out.println("Sine = " + result[0] + ", Cosine = " + result[1] + ", Tangent = " + result[2]);
    }
}
// LEVEL 2
class Factors {
    public static int[] findFactors(int n) {
        int count = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) count++;

        int[] factors = new int[count];
        int index = 0;
        for (int i = 1; i <= n; i++) if (n % i == 0) factors[index++] = i;

        return factors;
    }

    public static int sum(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += x;
        return sum;
    }

    public static int product(int[] arr) {
        int prod = 1;
        for (int x : arr) prod *= x;
        return prod;
    }

    public static int sumOfSquares(int[] arr) {
        int sum = 0;
        for (int x : arr) sum += Math.pow(x, 2);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        int[] factors = findFactors(n);
        System.out.print("Factors: ");
        for (int f : factors) System.out.print(f + " ");
        System.out.println("\nSum = " + sum(factors));
        System.out.println("Product = " + product(factors));
        System.out.println("Sum of Squares = " + sumOfSquares(factors));
    }
}

//2. Sum of Natural Numbers (Recursion vs Formula)
class SumNatural {
    public static int recursiveSum(int n) {
        if (n == 0) return 0;
        return n + recursiveSum(n - 1);
    }

    public static int formulaSum(int n) {
        return (n * (n + 1)) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Not a natural number!");
            return;
        }

        int rec = recursiveSum(n);
        int formula = formulaSum(n);

        System.out.println("Recursive sum = " + rec);
        System.out.println("Formula sum = " + formula);
        System.out.println("Both are equal? " + (rec == formula));
    }
}

//3. Leap Year Check
class LeapYear {
    public static boolean isLeapYear(int year) {
        if (year < 1582) return false;
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter year: ");
        int y = sc.nextInt();

        if (isLeapYear(y)) System.out.println(y + " is a Leap Year");
        else System.out.println(y + " is NOT a Leap Year");
    }
}

//4. Unit Converter (Km, Miles, Meters, Feet, Inches, Celsius, Pounds, Liters)
class UnitConvertor {

    public static double convertKmToMiles(double km) {
        double km2miles = 0.621371;
        return km * km2miles;
    }

    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        return miles * miles2km;
    }

    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        return meters * meters2feet;
    }

    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        return feet * feet2meters;
    }

    public static void main(String[] args) {
        double km = 10;
        double miles = 6.2;
        double meters = 100;
        double feet = 328;

        System.out.println(km + " km = " + convertKmToMiles(km) + " miles");
        System.out.println(miles + " miles = " + convertMilesToKm(miles) + " km");
        System.out.println(meters + " meters = " + convertMetersToFeet(meters) + " feet");
        System.out.println(feet + " feet = " + convertFeetToMeters(feet) + " meters");
    }
}


//5. Student Vote Checker
class StudentVoteChecker {
    public static boolean canStudentVote(int age) {
        if (age < 0) return false;
        return age >= 18;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] ages = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
            ages[i] = sc.nextInt();
            System.out.println("Can vote? " + canStudentVote(ages[i]));
        }
    }
}

//6. Youngest & Tallest Friend
class Friends {
    public static int youngest(int[] ages) {
        int idx = 0;
        for (int i = 1; i < ages.length; i++)
            if (ages[i] < ages[idx]) idx = i;
        return idx;
    }

    public static int tallest(double[] heights) {
        int idx = 0;
        for (int i = 1; i < heights.length; i++)
            if (heights[i] > heights[idx]) idx = i;
        return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] names = {"Amar", "Akbar", "Anthony"};
        int[] ages = new int[3];
        double[] heights = new double[3];

        for (int i = 0; i < 3; i++) {
            System.out.print("Enter age of " + names[i] + ": ");
            ages[i] = sc.nextInt();
            System.out.print("Enter height of " + names[i] + " in cm: ");
            heights[i] = sc.nextDouble();
        }

        System.out.println("Youngest = " + names[youngest(ages)]);
        System.out.println("Tallest = " + names[tallest(heights)]);
    }
}

//7. Positive/Negative, Even/Odd, Compare
class NumberArray {
    public static boolean isPositive(int n) { return n >= 0; }
    public static boolean isEven(int n) { return n % 2 == 0; }
    public static int compare(int a, int b) {
        if (a > b) return 1;
        if (a == b) return 0;
        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            arr[i] = sc.nextInt();

            if (isPositive(arr[i])) {
                System.out.print("Positive and ");
                if (isEven(arr[i])) System.out.println("Even");
                else System.out.println("Odd");
            } else {
                System.out.println("Negative");
            }
        }

        int result = compare(arr[0], arr[4]);
        if (result == 0) System.out.println("First and Last are Equal");
        else if (result == 1) System.out.println("First is Greater");
        else System.out.println("First is Smaller");
    }
}

//8. BMI Calculator
class BMI {
    public static double calculateBMI(double weight, double heightCm) {
        double heightM = heightCm / 100.0;
        return weight / (heightM * heightM);
    }

    public static String getStatus(double bmi) {
        if (bmi < 18.5) return "Underweight";
        else if (bmi < 25) return "Normal";
        else if (bmi < 30) return "Overweight";
        else return "Obese";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[][] data = new double[10][3];

        for (int i = 0; i < 10; i++) {
            System.out.print("Enter weight(kg) of person " + (i + 1) + ": ");
            data[i][0] = sc.nextDouble();
            System.out.print("Enter height(cm) of person " + (i + 1) + ": ");
            data[i][1] = sc.nextDouble();

            data[i][2] = calculateBMI(data[i][0], data[i][1]);
        }

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + " => Weight=" + data[i][0] +
                    "kg, Height=" + data[i][1] + "cm, BMI=" + data[i][2] +
                    ", Status=" + getStatus(data[i][2]));
        }
    }
}

//9. Quadratic Roots
class Quadratic {
    public static double[] findRoots(double a, double b, double c) {
        double delta = b * b - 4 * a * c;
        if (delta < 0) return new double[] {};
        else if (delta == 0) return new double[]{-b / (2 * a)};
        else {
            double sqrt = Math.sqrt(delta);
            return new double[]{(-b + sqrt) / (2 * a), (-b - sqrt) / (2 * a)};
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a, b, c: ");
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        double[] roots = findRoots(a, b, c);
        if (roots.length == 0) System.out.println("No Real Roots");
        else {
            for (double r : roots) System.out.println("Root = " + r);
        }
    }
}

//10. Random Numbers (Average, Min, Max)
class RandomNumbers {
    public static int[] generate4DigitRandomArray(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
            arr[i] = 1000 + (int)(Math.random() * 9000);
        return arr;
    }

    public static double[] findAverageMinMax(int[] numbers) {
        int min = numbers[0], max = numbers[0], sum = 0;
        for (int n : numbers) {
            sum += n;
            min = Math.min(min, n);
            max = Math.max(max, n);
        }
        return new double[]{(double)sum / numbers.length, min, max};
    }

    public static void main(String[] args) {
        int[] arr = generate4DigitRandomArray(5);
        System.out.print("Numbers: ");
        for (int n : arr) System.out.print(n + " ");
        System.out.println();

        double[] result = findAverageMinMax(arr);
        System.out.println("Average = " + result[0] + ", Min = " + result[1] + ", Max = " + result[2]);
    }
}
// LEVEL 3

class Level3Programs {

    // 1. Football team players’ height
    static void analyzeFootballTeamHeights() {
        Random randomizer = new Random();
        int[] playerHeightsCm = new int[11];
        int totalHeightSum = 0;
        int minHeight = Integer.MAX_VALUE;
        int maxHeight = Integer.MIN_VALUE;

        for (int i = 0; i < 11; i++) {
            playerHeightsCm[i] = 150 + randomizer.nextInt(101);
            totalHeightSum += playerHeightsCm[i];
            minHeight = Math.min(minHeight, playerHeightsCm[i]);
            maxHeight = Math.max(maxHeight, playerHeightsCm[i]);
        }
        double meanHeight = (double) totalHeightSum / 11;

        System.out.println("Football Players Heights:");
        System.out.println("Shortest Player Height=" + minHeight + " cm");
        System.out.println("Tallest Player Height=" + maxHeight + " cm");
        System.out.println("Mean Height=" + meanHeight + " cm");
        System.out.println();
    }

    // 2. NumberChecker Part 1
    static void checkNumberProperties1(int number) {
        String numberAsString = Integer.toString(number);
        int[] digits = new int[numberAsString.length()];
        for (int i = 0; i < numberAsString.length(); i++) {
            digits[i] = numberAsString.charAt(i) - '0';
        }

        System.out.println("Number Properties Check 1 for " + number + ":");
        System.out.println("Digit Count=" + digits.length);

        // Duck number check
        boolean isDuckNumber = numberAsString.contains("0") && numberAsString.charAt(0) != '0';
        System.out.println("Is Duck Number=" + isDuckNumber);

        // Armstrong number check
        double sumOfPoweredDigits = 0;
        for (int digit : digits) {
            sumOfPoweredDigits += Math.pow(digit, digits.length);
        }
        System.out.println("Is Armstrong Number=" + (sumOfPoweredDigits == number));

        // Finding largest, second largest, smallest, second smallest
        Arrays.sort(digits);
        System.out.println("Largest Digit=" + digits[digits.length - 1] + ", Second Largest=" + digits[digits.length - 2]);
        System.out.println("Smallest Digit=" + digits[0] + ", Second Smallest=" + digits[1]);
        System.out.println();
    }

    // 3. NumberChecker Part 2
    static void checkNumberProperties2(int number) {
        String numberAsString = Integer.toString(number);
        int sumOfDigits = 0;
        int sumOfDigitSquares = 0;
        int[] digitFrequencies = new int[10];

        for (int i = 0; i < numberAsString.length(); i++) {
            int digit = numberAsString.charAt(i) - '0';
            sumOfDigits += digit;
            sumOfDigitSquares += digit * digit;
            digitFrequencies[digit]++;
        }

        System.out.println("Number Properties Check 2 for " + number + ":");
        System.out.println("Digit Count=" + numberAsString.length() + ", Sum=" + sumOfDigits + ", Sum of Squares=" + sumOfDigitSquares);
        System.out.println("Is Harshad Number=" + (number % sumOfDigits == 0));

        System.out.println("Digit Frequencies:");
        for (int i = 0; i < 10; i++) {
            if (digitFrequencies[i] > 0) {
                System.out.println("Digit " + i + " appears " + digitFrequencies[i] + " time(s)");
            }
        }
        System.out.println();
    }

    // 4. NumberChecker Part 3
    static void checkNumberProperties3(int number) {
        String numberAsString = Integer.toString(number);
        String reversedNumber = new StringBuilder(numberAsString).reverse().toString();

        System.out.println("Number Properties Check 3 for " + number + ":");
        System.out.println("Reversed Number=" + reversedNumber);
        System.out.println("Is Palindrome=" + numberAsString.equals(reversedNumber));

        boolean isDuckNumber = numberAsString.contains("0") && numberAsString.charAt(0) != '0';
        System.out.println("Is Duck Number=" + isDuckNumber);
        System.out.println();
    }

    // 5. NumberChecker Part 4
    static void checkNumberProperties4(int number) {
        System.out.println("Number Properties Check 4 for " + number + ":");

        // Prime
        boolean isPrimeNumber = number > 1;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }
        System.out.println("Is Prime Number=" + isPrimeNumber);

        // Neon
        int numberSquared = number * number;
        int sumOfSquaredDigits = 0;
        int tempSquared = numberSquared;
        while (tempSquared > 0) {
            sumOfSquaredDigits += tempSquared % 10;
            tempSquared /= 10;
        }
        System.out.println("Is Neon Number=" + (sumOfSquaredDigits == number));

        // Spy
        int sumOfDigits = 0;
        long productOfDigits = 1;
        int tempNumber = number;
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            sumOfDigits += digit;
            productOfDigits *= digit;
            tempNumber /= 10;
        }
        System.out.println("Is Spy Number=" + (sumOfDigits == productOfDigits));

        // Automorphic
        String numberString = Integer.toString(number);
        String squaredNumberString = Integer.toString(number * number);
        System.out.println("Is Automorphic=" + squaredNumberString.endsWith(numberString));

        // Buzz
        System.out.println("Is Buzz Number=" + (number % 10 == 7 || number % 7 == 0));
        System.out.println();
    }

    // 6. NumberChecker Part 5
    static void checkNumberProperties5(int number) {
        System.out.println("Number Properties Check 5 for " + number + ":");
        int sumOfProperDivisors = 0;
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfProperDivisors += i;
            }
        }

        System.out.println("Is Perfect Number=" + (sumOfProperDivisors == number));
        System.out.println("Is Abundant Number=" + (sumOfProperDivisors > number));
        System.out.println("Is Deficient Number=" + (sumOfProperDivisors < number));

        // Strong number
        long factorialSum = 0;
        int tempNumber = number;
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            long factorial = 1;
            for (int i = 1; i <= digit; i++) {
                factorial *= i;
            }
            factorialSum += factorial;
            tempNumber /= 10;
        }
        System.out.println("Is Strong Number=" + (factorialSum == number));
        System.out.println();
    }

    // 7. Factors Array Program
    static void findAndAnalyzeFactors(int number) {
        System.out.println("Factors of " + number + ":");
        List<Integer> factorsList = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factorsList.add(i);
            }
        }

        long sumOfFactors = 0;
        long productOfFactors = 1;
        long productOfFactorCubes = 1;
        int greatestFactor = 0;

        for (int factor : factorsList) {
            sumOfFactors += factor;
            productOfFactors *= factor;
            productOfFactorCubes *= Math.pow(factor, 3);
            greatestFactor = Math.max(greatestFactor, factor);
        }

        System.out.println("Factors=" + factorsList);
        System.out.println("Greatest Factor=" + greatestFactor);
        System.out.println("Sum of Factors=" + sumOfFactors);
        System.out.println("Product of Factors=" + productOfFactors);
        System.out.println("Product of Cubes of Factors=" + productOfFactorCubes);
        System.out.println();
    }

    // 8. Six-digit OTP Generator
    static void generateUniqueOTPs() {
        Random rand = new Random();
        Set<Integer> uniqueOTPs = new HashSet<>();
        while (uniqueOTPs.size() < 10) {
            uniqueOTPs.add(100000 + rand.nextInt(900000));
        }

        System.out.println("10 Unique Six-digit OTPs:");
        System.out.println(uniqueOTPs);
        System.out.println();
    }

    // 9. Calendar Program
    static void displayCalendar(int month, int year) {
        String[] monthNames = {"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            daysInMonth[1] = 29;
        }

        System.out.println("Calendar for " + monthNames[month - 1] + " " + year + ":");
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");

        // Zeller's congruence to find first day of the month
        int q = 1;
        int m = month;
        int Y = year;
        if (m < 3) {
            m += 12;
            Y -= 1;
        }
        int K = Y % 100;
        int J = Y / 100;
        int dayIndex = (q + 13 * (m + 1) / 5 + K + K / 4 + J / 4 + 5 * J) % 7;

        dayIndex = (dayIndex + 6) % 7;

        for (int i = 0; i < dayIndex; i++) {
            System.out.print("    ");
        }

        for (int i = 1; i <= daysInMonth[month - 1]; i++) {
            System.out.printf("%3d ", i);
            if ((i + dayIndex) % 7 == 0) {
                System.out.println();
            }
        }
        System.out.println("\n");
    }

    // 10. Collinear Points
    static void checkCollinearity(int x1, int y1, int x2, int y2, int x3, int y3) {
        int triangleAreaFormula = (x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2));
        System.out.println("Collinear Points (" + x1 + "," + y1 + "), (" + x2 + "," + y2 + "), (" + x3 + "," + y3 + "):");
        System.out.println("Are the points collinear? " + (triangleAreaFormula == 0));
        System.out.println();
    }

    // 11. Employee Bonus
    static void calculateEmployeeBonuses() {
        Random rand = new Random();
        double totalOriginalSalary = 0;
        double totalFinalSalary = 0;
        double totalBonusAmount = 0;

        System.out.println("Employee Bonus Calculation:");
        System.out.printf("%-10s %-10s %-10s %-10s %-10s\n", "EmpID", "Salary", "Years", "Bonus", "New Salary");
        System.out.println("---------------------------------------------------");

        for (int i = 1; i <= 10; i++) {
            int employeeSalary = 10000 + rand.nextInt(90001);
            int yearsOfService = 1 + rand.nextInt(20);
            double bonusAmount = (yearsOfService > 5) ? (0.05 * employeeSalary) : (0.02 * employeeSalary);
            double finalSalary = employeeSalary + bonusAmount;

            totalOriginalSalary += employeeSalary;
            totalFinalSalary += finalSalary;
            totalBonusAmount += bonusAmount;

            System.out.printf("%-10d %-10d %-10d %-10.2f %-10.2f\n", i, employeeSalary, yearsOfService, bonusAmount, finalSalary);
        }

        System.out.println("---------------------------------------------------");
        System.out.printf("Totals:    %-10.2f %-10s %-10.2f %-10.2f\n", totalOriginalSalary, "", totalBonusAmount, totalFinalSalary);
        System.out.println();
    }

    // 12. Distance and Line Equation
    static void analyzeLineAndDistance(int x1, int y1, int x2, int y2) {
        System.out.println("Analyzing Line for Points (" + x1 + "," + y1 + ") and (" + x2 + "," + y2 + "):");
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Euclidean Distance=" + distance);

        if (x2 - x1 == 0) {
            System.out.println("Line Equation: x = " + x1 + " (Vertical line)");
        } else {
            double slope = (double) (y2 - y1) / (x2 - x1);
            double yIntercept = y1 - slope * x1;
            System.out.println("Line Equation: y = " + slope + "x + " + yIntercept);
        }
        System.out.println();
    }

    // 13. Student Marks Scorecard
    static void generateStudentScorecard() {
        Random rand = new Random();
        int numberOfStudents = 5;

        System.out.println("Student Marks Scorecard:");
        System.out.printf("%-10s %-5s %-5s %-5s %-5s %-8s %-8s\n", "Student", "Phy", "Chem", "Math", "Total", "Avg", "Per(%)");
        System.out.println("------------------------------------------------------");

        for (int i = 0; i < numberOfStudents; i++) {
            int physicsMarks = rand.nextInt(101);
            int chemistryMarks = rand.nextInt(101);
            int mathMarks = rand.nextInt(101);

            int totalMarks = physicsMarks + chemistryMarks + mathMarks;
            double averageScore = totalMarks / 3.0;
            double percentageScore = (totalMarks / 300.0) * 100;

            System.out.printf("Student %-2d %-5d %-5d %-5d %-5d %-8.2f %-8.2f\n", i + 1, physicsMarks, chemistryMarks, mathMarks, totalMarks, averageScore, percentageScore);
        }
        System.out.println();
    }

    // 14. Matrix Part 1
    static void performMatrixOperations() {
        Random rand = new Random();
        int[][] matrixA = new int[2][2];
        int[][] matrixB = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrixA[i][j] = rand.nextInt(10);
                matrixB[i][j] = rand.nextInt(10);
            }
        }

        System.out.println("Matrix A:\n" + Arrays.deepToString(matrixA));
        System.out.println("Matrix B:\n" + Arrays.deepToString(matrixB));

        int[][] additionResult = new int[2][2];
        int[][] subtractionResult = new int[2][2];
        int[][] multiplicationResult = new int[2][2];

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                additionResult[i][j] = matrixA[i][j] + matrixB[i][j];
                subtractionResult[i][j] = matrixA[i][j] - matrixB[i][j];
                for (int k = 0; k < 2; k++) {
                    multiplicationResult[i][j] += matrixA[i][k] * matrixB[k][j];
                }
            }
        }
        System.out.println("Matrix Addition:\n" + Arrays.deepToString(additionResult));
        System.out.println("Matrix Subtraction:\n" + Arrays.deepToString(subtractionResult));
        System.out.println("Matrix Multiplication:\n" + Arrays.deepToString(multiplicationResult));
        System.out.println();
    }

    // 15. Matrix Part 2
    static void analyzeMatrixProperties() {
        Random rand = new Random();
        int[][] inputMatrix = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                inputMatrix[i][j] = rand.nextInt(10);
            }
        }
        System.out.println("Input Matrix:\n" + Arrays.deepToString(inputMatrix));

        int[][] transposedMatrix = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                transposedMatrix[j][i] = inputMatrix[i][j];
            }
        }
        System.out.println("Transposed Matrix:\n" + Arrays.deepToString(transposedMatrix));

        int determinant = inputMatrix[0][0] * inputMatrix[1][1] - inputMatrix[0][1] * inputMatrix[1][0];
        System.out.println("Determinant=" + determinant);

        if (determinant != 0) {
            double[][] inverseMatrix = new double[2][2];
            inverseMatrix[0][0] = (double) inputMatrix[1][1] / determinant;
            inverseMatrix[0][1] = (double) -inputMatrix[0][1] / determinant;
            inverseMatrix[1][0] = (double) -inputMatrix[1][0] / determinant;
            inverseMatrix[1][1] = (double) inputMatrix[0][0] / determinant;
            System.out.println("Inverse Matrix:\n" + Arrays.deepToString(inverseMatrix));
        } else {
            System.out.println("Inverse does not exist (determinant is 0).");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        System.out.println("--- Level 3 Programs: Human-Readable Version ---");
        System.out.println();

        analyzeFootballTeamHeights();
        checkNumberProperties1(153);
        checkNumberProperties2(126);
        checkNumberProperties3(121);
        checkNumberProperties4(25);
        checkNumberProperties5(28);
        findAndAnalyzeFactors(12);
        generateUniqueOTPs();
        displayCalendar(2, 2024);
        checkCollinearity(1, 1, 2, 2, 3, 3);
        calculateEmployeeBonuses();
        analyzeLineAndDistance(1, 2, 3, 4);
        generateStudentScorecard();
        performMatrixOperations();
        analyzeMatrixProperties();
    }
}