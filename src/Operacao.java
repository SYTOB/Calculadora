
public class Operacao extends OpInterface {

    @Override
    public double adicao(double num1, double num2) {
        double result = num1 + num2;
        return result;   
    }

    @Override
    public double subtracao(double num1, double num2) {
        double result = num1 - num2;
        return result; 
        
    }

    @Override
    public double divisao(double num1, double num2) {
        double result = num1 / num2;
        return result;
        
    }

    @Override
    public double multiplicacao(double num1, double num2) {
        double result = num1 * num2;
        return result;   
        
    }
    

    public double operacao(String aux, double num1, double num2){


        if(aux.equals("+")){
            return adicao(num1,num2);
        }
        else if(aux.equals("-")){
            return subtracao(num1,num2);
        }
        else if(aux.equals("*")){
            return multiplicacao(num1,num2);
        }
        else if(aux.equals("/")){
            return divisao(num1,num2);
        }
        else{
            return 0;
        }

    }


}
