package Calculator;

// Calculator class with basic operations
class Calculator {
    
    // Method to perform calculation based on operation
    public double calculate(double a, double b, String operation) {
        switch (operation.toLowerCase()) {
            case "add": 
                return a + b;
            case "sub":
                return a - b;
            case "mul": 
                return a * b;
            case "div": 
                if (b != 0) {
                    return a / b;
                } else {
                    System.out.println("Error: Division by zero!");
                    return 0;
                }
            default:
                System.out.println("Invalid operation!");
                return 0;
        }
    }
}

