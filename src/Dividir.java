public class Dividir implements Operacao {

    @Override
    public void resultado(Double num1, Double num2){
        System.out.println("Resultado: "+(num1/num2));
    }

}