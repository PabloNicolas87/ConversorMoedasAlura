import com.google.gson.Gson;
import com.google.gson.JsonParser;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        int opcao = 0;
        while (opcao != 7) {
            System.out.println("""
                    ***************************************************************
                    
                    Seja Bem-vindo ao conversor de Moedas
                    
                    _______________________________________
                    
                    1- Dólar  >>>>>>>>>> Peso Argentino
                    2- Peso Argentino >> Dólar
                    3- Dólar >>>>>>>>>>> Real Brasileiro
                    4- Real Brasileiro > Dólar
                    5- Dólar >>>>>>>>>>> Peso Colombiano
                    6- Peso Colombiano > Dolar
                   
                    7- Sair
                    
                    _______________________________________
                    
                    Escolha uma opção...
                    
                    ***************************************************************
                    """);
            opcao = leitura.nextInt();

            TestaOpcao conversao = new TestaOpcao();
            conversao.testa(opcao);
        }
    }
}
