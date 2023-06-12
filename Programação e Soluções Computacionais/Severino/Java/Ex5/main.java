package ExSeverino.Ex5;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        //Números
        Float numeros[] = new Float[10];
        //Par
        Float par[] = new Float[10];
        //Impar
        Float impar[] = new Float[10];
        //Contador par
        int contadorPar = 0;
        //Contador Impar 
        int contadorImpar = 0;
        //Input
        Scanner input = new Scanner(System.in);
        //Recebe os números
        for(int x = 0; x < 10 ; x++){
            System.out.println("Insira um número: ");
            float numero = input.nextFloat();
            //Adiciona na lista de números
            numeros[x] = numero;

            //Verifica se o número é par ou impar
            if(numero % 2 == 0){
                par[contadorPar] = numero;
                contadorPar ++;
            }
            else{
                impar[contadorImpar] = numero;
                contadorImpar ++;
            }

        }

        //Imprimir vetor geral
        System.out.println("___VETOR GERAL__");
        for(int x = 0; x < 10; x++){
            System.out.println("Numeros[" + x + "] = " + numeros[x]);
        }


        //Imprime vetor par 
        System.out.println("___VETOR PAR__");
        for(int x = 0; x < contadorPar; x++){
            System.out.println("Numeros[" + x + "] = " + par[x]);
        }

        System.out.println("___VETOR IMPAR__");
        for(int x = 0; x < contadorImpar; x++){
            System.out.println("Numeros[" + x + "] = " + impar[x]);
        }



    }
}
