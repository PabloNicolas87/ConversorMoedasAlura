/*import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLParameters;
import java.io.IOException;
import java.net.Authenticator;
import java.net.CookieHandler;
import java.net.ProxySelector;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.time.Duration;
import java.util.Optional;
import java.util.Scanner;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;

public class ConversorMoedas {
    public ConversorMoedas() throws IOException, InterruptedException {



        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE) // Define a política de nomeação de campos como CamelCase
                .setPrettyPrinting() // Configura o Gson para imprimir o JSON de forma legível
                .create();

            String endereco = "USD/BRL";

            HttpClient client = HttpClient.newHttpClient();

            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create("https://v6.exchangerate-api.com/v6/077ac129727640d9768f99ff/pair/" + endereco))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            JsonObject jsonObject = gson.fromJson(response.body(), JsonObject.class);
            double taxaConversao = jsonObject.get("conversion_rate").getAsDouble();
            System.out.println("taxa de conversao é " + taxaConversao);
        }
    }

 */







