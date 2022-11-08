import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);

        // Maintain two stacks: one for operands and one for operators/parentheses.
        Stack<Double> operands = new Stack<Double>();
        Stack<Character> operators = new Stack<Character>();

        System.out.print("Enter an infix expression with spaces between all tokens, X to exit: ");
        String infixExpression = keyboard.nextLine();

        // Scan the infix expression one token at a time, from left to right. Here a “token” is defined as an operand, operator, or parentheses symbol.
        while(!infixExpression.equalsIgnoreCase("X"))
        {
            String[] tokens = infixExpression.split(" ");
            boolean validExpression = true;

            for(int i = 0; i < tokens.length && validExpression; i++)
            {
                String str = tokens[i];

                if(str.chars().allMatch(Character::isDigit) || (str.length() > 1 && str.charAt(0) == '-' && str.substring(1).chars().allMatch(Character::isDigit)))
                {
                    // If the token is an operand, push it onto the operand stack.
                    operands.push(Double.parseDouble(str));
                }
                else if(str.equals("("))
                {
                    operators.push(str.charAt(0));
                }
                else if (str.equals(")"))
                {
                    while (operators.peek() != '(')
                        applyOperator(operators.pop(), operands);

                    operators.pop();
                }
                else if(str.equals("+") || str.equals("-") || str.equals("*") || str.equals("/") || str.equals("^"))
                {
                    while (!operators.empty() && isLessPrecedence(str.charAt(0), operators.peek()))
                        applyOperator(operators.pop(), operands);

                    operators.push(str.charAt(0));
                }
                else
                {
                    validExpression = false;
                }
            }

            if(validExpression)
            {
                while (!operators.empty() && operands.size() >= 2)
                    applyOperator(operators.pop(), operands);

                if(!operators.isEmpty() || operands.size() != 1)
                    validExpression = false;
            }

            if(validExpression)
                System.out.println("Result: " + operands.pop());
            else
                System.out.println("Invalid expression!");


            System.out.print("\nEnter an infix expression with spaces between all tokens, X to exit: ");
            infixExpression = keyboard.nextLine();
        }
    }

    // applyOperator method implementation
    public static void applyOperator(Character ch, Stack<Double> operands)
    {
        Double result;

        Double value1 = operands.pop();
        Double value2 = operands.pop();

        if(ch == '+')
            result = value2 + value1;
        else if(ch == '-')
            result = value2 - value1;
        else if(ch == '/')
            result = value2 / value1;
        else if(ch == '*')
            result = value2 * value1;
        else if(ch == '%')
            result = value2 % value1;
        else if(ch == '^')
            result = Math.pow(value2, value1);
        else
            result = 0.0;

        operands.push(result);
    }

    // isLessPrecedence method implementation
    public static boolean isLessPrecedence(char op1, char op2)
    {
        if(op2 == '(' || op2 == ')')
            return false;

        if(op1 == '^' && op2 != '^')
            return false;

        if((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;

        return true;
    }
} // end of InfixEvaluation class