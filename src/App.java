import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Numero num1 = new Numero();
        Numero num2 = new Numero();
        Numero op = new Numero();

        Scanner scan = new Scanner(System.in);

        Operacao method = new Operacao();
        System.out.println("Calculadora!");
        System.out.println("Forma de Input");
        System.out.println("Primeiro número > Operação > Segundo número");
        num1.setValor(scan.nextDouble()); 
        op.setValorOp(scan.next()); 
        num2.setValor(scan.nextDouble()); 


        System.out.println("Resultado: "+method.operacao(op.getValorOp(),num1.getValor(),num2.getValor()));
        
        scan.close();

    }
}
