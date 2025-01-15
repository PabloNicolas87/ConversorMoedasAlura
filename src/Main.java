import com.google.gson.Gson;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.util.Scanner;
//' https://v6.exchangerate-api.com/v6/077ac129727640d9768f99ff/latest/USD

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 7) {
            System.out.println("""
                    ***************************************************************
                    Seja bem vindo ao Conversor de Moeda (Por Saulo Palácio)
                    
                    1- Dólar  >>>>>>>>>> Peso Argentino
                    2- Peso Argentino >> Dólar
                    3- Dólar >>>>>>>>>>> Real Brasileiro
                    4- Real Brasileiro > Dólar
                    5- Dólar >>>>>>>>>>> Peso Colombiano
                    6- Peso Colombiano > Dolar
                    7- Sair
                    
                    Escolha uma das opções acima.
                    ***************************************************************
                    """);
            opcao = leitura.nextInt();

            TestaOpcao conversao = new TestaOpcao();
            conversao.testa(opcao);
        }
    }
}
