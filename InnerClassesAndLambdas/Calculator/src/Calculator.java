public class Calculator {
    public DoMath toOperation(String op) {
        DoMath res = (x1, x2) -> {return Double.MIN_VALUE;};;

        switch (op) {
             /* TODO
Use a lambda expression to set "res" to the correct function.*/
            case "+": res = (x1, x2) -> {return x1 + x2;};
                break;
           /* TODO
Use a lambda expression to set "res" to the correct function.*/
            case "-": res = (x1, x2) -> {return x1 - x2;};
                break;
             /* TODO
Use a lambda expression to set "res" to the correct function.*/
            case "*": res = (x1, x2) -> {return x1 * x2;};
                break;
             /* TODO
Use a lambda expression to set "res" to the correct function. You must account for divisions by zero as specified in the instructions.*/
            case "/": res = (x1, x2) -> {if (x2 != 0) return x1/x2; else return Double.POSITIVE_INFINITY;};
                break;
          /* TODO
In the default value, the res function should return the minimum possible value.*/
        }
        return res;
    }

    public Double compute(Double n1, Double n2, String op){

        DoMath calc = toOperation(op);

        return calc.compute(n1, n2);
      /* TODO
set calc to the correct function calling the method above.*//* TODO
return the result of calc.compute with the numbers given.*/
    }
}
