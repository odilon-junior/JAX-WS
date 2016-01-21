package br.com.estoque.ws;

import br.com.estoque.modelo.item.Item;
import br.com.estoque.modelo.item.ItemDao;
import br.com.estoque.modelo.item.ListaItens;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by odilon on 19/01/16.
 */
@WebService
public class EstoqueWS {

    private ItemDao dao = new ItemDao();

    @WebMethod(operationName = "todosOsItens")
    @WebResult(name = "itens")
    public ListaItens getItens() {
        System.out.println("Chamando todosItens()");
        return new ListaItens(dao.todosItens());
    }
}
