package br.com.alura.screenmatch.principal;

import java.io.IOException;
import java.net.*;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Base64;

public class PrincipalComBusca {
    public static void main(String[] args) throws Exception {
        //Credenciais
        String username = "do-user";
        String password = "1234";

        //Configuração do cliente com proxy
        HttpClient client = HttpClient.newBuilder()
                .proxy(ProxySelector.of(new InetSocketAddress("10.26.0.159",8080)))
                .authenticator(new Authenticator(){
                    @Override
                    protected PasswordAuthentication getPasswordAuthentication(){
                        return new PasswordAuthentication(username,password.toCharArray());
                    }
                })
                .build();

        //Configuração da requisição
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create("http://www.omdbapi.com/?apikey=b57420eb&t=matrix"))
                .build();

        //Envio da requisição
        HttpResponse<String> response = client
                .send(request,HttpResponse.BodyHandlers.ofString());


        System.out.println("Status Code: " + response.statusCode());
        System.out.println("Body: " + response.body());
    }


}
