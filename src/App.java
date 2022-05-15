import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException,
            ClassNotFoundException, NoSuchMethodException, InvocationTargetException {

        String operacao;
        double num1, num2;

        Scanner scan = new Scanner(System.in);

        System.out.println("Calculadora!");
        System.out.println("Informe o primeiro número: ");
        num1 = scan.nextDouble();

        System.out.println("Escolha(digite) uma das operações [Somar - Subtrair - Multiplicar - Dividir]");
        operacao = scan.next();

        System.out.println("Informe o segundo número: ");
        num2 = scan.nextDouble();
        scan.close();

        executar(operacao, num1, num2);

    }

    private static void executar(String operacao, Double num1, Double num2)
            throws InstantiationException, IllegalAccessException,
            ClassNotFoundException, NoSuchMethodException, InvocationTargetException {

        Object classInstance = Class.forName(operacao).getDeclaredConstructor().newInstance();

        Method execute = Class.forName(operacao).getDeclaredMethod(
                "resultado",
                new Class[] { Double.class, Double.class });

        execute.invoke(classInstance, num1, num2);

    }

}
