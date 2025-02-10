import java.util.Scanner;

public class CircleCalculator {
    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);
        
        // Prompt the user to enter the radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();  // Input radius as a double
        
        // Use the Math.PI constant for the value of pi
        double pi = Math.PI;
        
        // Calculate the area (Area = π * r^2)
        double area = pi * Math.pow(radius, 2);
        
        // Calculate the circumference (Circumference = 2 * π * r)
        double circumference = 2 * pi * radius;
        
        // Output the results with formatting
        System.out.println("\nArea of the circle: " + area);
        System.out.println("Circumference of the circle: " + circumference);
        
        // Optionally, round the results to 2 decimal places
        System.ou
