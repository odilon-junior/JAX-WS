package br.com.estoque.ws;

import javax.xml.ws.WebFault;

/**
 * Created by odilon on 25/01/16.
 */

@WebFault(name = "AutorizacaoFault", messageName = "AutorizacaoFault")
public class AutorizacaoException extends Exception {

    public AutorizacaoException(String s) {
        super(s);
    }

    public String getFaultInfo() {
        return "Token invalido";
    }
}
