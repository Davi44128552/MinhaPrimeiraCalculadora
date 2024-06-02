public class Operacoes {

    // Operações

    public double Soma(double a, double b){
        return a + b;
    }

    public double Subtracao(double a, double b){
        return a - b;
    }

    public double Multiplicacao(double a, double b){
        return a * b;
    }

    public double Divisao(double a, double b){

        try {
            double divisao = a / b;
            return divisao;
        }

        catch (ArithmeticException e){
            System.out.println("Não é possível dividir um número por 0");
            return 0;
        }

    }

    public String fatorial(String texto){

        int num = Integer.parseInt(texto);
        double valor = 1;

        for (int i = num; i > 0; i--){
            valor *= i;
        }

        String resultado = "" + valor;

        return resultado;

    }

    // Realização do cálculo
    public double Operacao(String calculo, double a, double b){

        if (calculo.contains("+")){
            return Soma(a, b);
        }

        else if (calculo.contains("-")){
            return Subtracao(a, b);
        }

        else if (calculo.contains("×")){
            return Multiplicacao(a, b);
        }

        else if (calculo.contains("÷")){
            return Divisao(a, b);
        }

        return -1;

    }
    
}
