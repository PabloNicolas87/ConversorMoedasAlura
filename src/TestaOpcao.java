import java.io.IOException;
import java.util.Scanner;

public class TestaOpcao {
    public void testa(int opcaoSelecionada) throws IOException, InterruptedException {
        Scanner valor = new Scanner(System.in);
        double numero = 0;
        ExchangeRate conv = new ExchangeRate();
        String endereco;
        double taxaConv;

        switch (opcaoSelecionada) {
            case 1:
                endereco = "https://v6.exchangerate-api.com/v6/077ac129727640d9768f99ff/pair/USD/ARS";
                System.out.println("Digite o valor em dólar a ser convertido em peso argentino");
                numero = valor.nextDouble();
                taxaConv = conv.conversorMoeda(endereco);
                //System.out.println(taxaConv);
                System.out.println("O Valor convertido é " + numero * taxaConv);
                break;
            case 2:
                endereco = "https://v6.exchangerate-api.com/v6/077ac129727640d9768f99ff/pair/ARS/USD";
                System.out.println("Digite o valor em peso argentino a ser convertido em dólar");
                numero = valor.nextDouble();
                taxaConv = conv.conversorMoeda(endereco);
                //System.out.println(taxaConv);
                System.out.println("O Valor convertido é " + numero * taxaConv);
                break;
            case 3:
                //GET https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/USD/BRL
                endereco = "https://v6.exchangerate-api.com/v6/077ac129727640d9768f99ff/pair/USD/BRL";
                System.out.println("Digite o valor em dólar a ser convertido em real");
                numero = valor.nextDouble();
                taxaConv = conv.conversorMoeda(endereco);
                //System.out.println(taxaConv);
                System.out.println("O Valor convertido é " + numero * taxaConv);
                break;
            case 4:
                // GET https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/BRL/USD
                endereco = "https://v6.exchangerate-api.com/v6/077ac129727640d9768f99ff/pair/BRL/USD";
                System.out.println("Digite o valor em real a ser convertido em dólar");
                numero = valor.nextDouble();
                taxaConv = conv.conversorMoeda(endereco);
                //System.out.println(taxaConv);
                System.out.println("O Valor convertido é " + numero * taxaConv);
                break;
            case 5:
                // GET https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/USD/COP
                endereco = "https://v6.exchangerate-api.com/v6/077ac129727640d9768f99ff/pair/USD/COP";
                System.out.println("Digite o valor em dólar a ser convertido em peso colombiano");
                numero = valor.nextDouble();
                taxaConv = conv.conversorMoeda(endereco);
                //System.out.println(taxaConv);
                System.out.println("O Valor convertido é " + numero * taxaConv);
                break;
            case 6:
                // GET https://v6.exchangerate-api.com/v6/YOUR-API-KEY/pair/COP/USD
                endereco = "https://v6.exchangerate-api.com/v6/077ac129727640d9768f99ff/pair/COP/USD";
                System.out.println("Digite o valor em peso colombiano a ser convertido em dólar");
                numero = valor.nextDouble();
                taxaConv = conv.conversorMoeda(endereco);
                //System.out.println(taxaConv);
                System.out.println("O Valor convertido é " + numero * taxaConv);
                break;
            case 7:
                break;
            // Opcional: valor padrão
            default:
                System.out.println("Digite um número que corresponda a uma das opções acima");
                break;
        }
    }
}
