package br.com.estoque.ws;

import br.com.estoque.modelo.item.Item;
import br.com.estoque.modelo.item.ItemDao;

import javax.jws.WebService;
import java.util.List;

/**
 * Created by odilon on 19/01/16.
 */
@WebService
public class EstoqueWS {

    private ItemDao dao = new ItemDao();

    public List<Item> getItens() {
        System.out.println("Chamando todosItens()");
        return dao.todosItens();
    }
}
