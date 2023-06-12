package ExSeverino.Ex13;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float temperaturas[] = new float[12];
        String[] meses = {"1-Janeiro", 
        "2-Fevereiro", 
        "3-Março", 
        "4-Abril",
        "5-Maio",
        "6-Junho",
        "7-Julho",
        "8-Agosto",
        "9-Setembro",
        "10-Outubro",
        "11-Novemrbo",
        "12-Dezembro"};
        float mediaTemperatura = 0;

        //Pegando temperaturas
        for(int x = 0; x < 12; x++){
            System.out.println("Insira a temperatura do Mês: " + meses[x]);
            temperaturas[x] = input.nextFloat();
        }

        //Média da temperatura
        for(int x = 0; x<12;x++){
            mediaTemperatura += temperaturas[x];
        }
        mediaTemperatura = mediaTemperatura / temperaturas.length;

        //Verificando temperaturas
        System.out.println("Meses em que a temperatura foi acima da média:");
        for(int x = 0; x<12;x++){
            if(temperaturas[x] > mediaTemperatura){
                System.out.println(meses[x] + "--->" + temperaturas[x] + "°C");
            }
        }
    }
}
