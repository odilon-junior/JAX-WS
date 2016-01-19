package br.com.estoque.ws;

import javax.xml.ws.Endpoint;

/**
 * Created by odilon on 19/01/16.
 */
public class PublicaEstoqueWS {
    public static void main(String[] args) {
        EstoqueWS implementacaoWS = new EstoqueWS();
        String URL = "http://localhost:8080/estoquews";

        System.out.println("EstoqueWS rodando: " + URL);

        Endpoint.publish(URL, implementacaoWS);
    }
}
