import java.util.Scanner;

public class MultiplicarNumeros {
    //multiplicar 2 numeros sin tener que usar el simbolo de mult
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String n1S, n2S;
        int n1Int, n2Int;
        char signo1;
        char signo2;
        int resultadoInteger = 0;
        String resultadoString;
        boolean n1Positivo = true, n2Positivo = true;

        System.out.println("Ingresa el primer numero : ");
        n1S = s.next();
        System.out.println("Ingresa el segundo numero : ");
        n2S = s.next();

        signo1 = n1S.charAt(0);
        signo2 = n2S.charAt(0);

        if (signo1 == '-'){
            n1Positivo = false;
            n1Int = Integer.parseInt(n1S.substring(1));
        } else {
            n1Int = Integer.parseInt(n1S);
        }

        if (signo2 == '-'){
            n2Positivo = false;
            n2Int = Integer.parseInt(n2S.substring(1));
        } else {
            n2Int = Integer.parseInt(n2S);
        }

        multiplicacion: for (int i = 0; i<n1Int; i++){
            resultadoInteger += n2Int;
        }

        if ((n1Positivo && n2Positivo) || !n1Positivo && !n2Positivo){
            resultadoString = String.valueOf(resultadoInteger);
        } else {
            resultadoString = "-" + String.valueOf(resultadoInteger);
        }

        System.out.println("resultadoString = " + resultadoString);

    }
}
