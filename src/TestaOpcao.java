import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.Scanner;

public class TestaOpcao {
    private static final String API_KEY;

    static {
        // Cargar la clave de API desde un archivo de configuración
        Properties properties = new Properties();
        try {
            FileInputStream fis = new FileInputStream("config.properties");
            properties.load(fis);
            API_KEY = properties.getProperty("API_KEY");
            if (API_KEY == null || API_KEY.isEmpty()) {
                throw new IllegalStateException("API_KEY no está configurada en config.properties.");
            }
        } catch (IOException e) {
            throw new RuntimeException("Error al cargar el archivo config.properties", e);
        }
    }

    public TestaOpcao() {
    }

    public void testa(int opcaoSelecionada) throws IOException, InterruptedException {
        Scanner valor = new Scanner(System.in);
        double numero = 0.0;
        ExchangeRate conv = new ExchangeRate();
        String endereco;
        double taxaConv;
        switch (opcaoSelecionada) {
            case 1:
                endereco = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/USD/ARS";
                System.out.println("Digite o valor em dólar a ser convertido em peso argentino");
                numero = valor.nextDouble();
                taxaConv = conv.conversorMoeda(endereco);
                System.out.println("O Valor convertido é " + numero * taxaConv);
                break;
            case 2:
                endereco = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/ARS/USD";
                System.out.println("Digite o valor em peso argentino a ser convertido em dólar");
                numero = valor.nextDouble();
                taxaConv = conv.conversorMoeda(endereco);
                System.out.println("O Valor convertido é " + numero * taxaConv);
                break;
            case 3:
                endereco = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/USD/BRL";
                System.out.println("Digite o valor em dólar a ser convertido em real");
                numero = valor.nextDouble();
                taxaConv = conv.conversorMoeda(endereco);
                System.out.println("O Valor convertido é " + numero * taxaConv);
                break;
            case 4:
                endereco = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/BRL/USD";
                System.out.println("Digite o valor em real a ser convertido em dólar");
                numero = valor.nextDouble();
                taxaConv = conv.conversorMoeda(endereco);
                System.out.println("O Valor convertido é " + numero * taxaConv);
                break;
            case 5:
                endereco = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/USD/COP";
                System.out.println("Digite o valor em dólar a ser convertido em peso colombiano");
                numero = valor.nextDouble();
                taxaConv = conv.conversorMoeda(endereco);
                System.out.println("O Valor convertido é " + numero * taxaConv);
                break;
            case 6:
                endereco = "https://v6.exchangerate-api.com/v6/" + API_KEY + "/pair/COP/USD";
                System.out.println("Digite o valor em peso colombiano a ser convertido em dólar");
                numero = valor.nextDouble();
                taxaConv = conv.conversorMoeda(endereco);
                System.out.println("O Valor convertido é " + numero * taxaConv);
            case 7:
                break;
            default:
                System.out.println("Digite um número que corresponda a uma das opções acima");
        }
    }
}
