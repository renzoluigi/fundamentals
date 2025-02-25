package Exercicios;

class CalculatorConundrum {
    public String calculate(int operand1, int operand2, String operation) {
        if (operation == null){
            throw new IllegalArgumentException("Operation cannot be null");
        }else if (operation.equals("+")){
            return operand1 + " " + operation + " " + operand2 + " = " + (operand1+operand2);
        } else if (operation.equals("*")){
            return operand1 + " " + operation + " " + operand2 + " = " + (operand1*operand2);
        } else if (operation.equals("/")){
            try{
                int result = operand1/operand2;
                return operand1 + " " + operation + " " + operand2 + " = " + (operand1/operand2);
            } catch (ArithmeticException exception) {
                throw new IllegalOperationException("Division by zero is not allowed", exception);
            }
        } else if (operation.isEmpty()) {
            throw new IllegalArgumentException("Operation cannot be empty");
        } else if (operation.equals("-")){
            throw new IllegalOperationException("Operation '-' does not exist");
        } throw new IllegalOperationException("Operation '" + operation + "' does not exist");
    }
}