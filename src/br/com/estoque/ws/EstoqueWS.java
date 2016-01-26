package br.com.estoque.ws;

import br.com.estoque.modelo.item.Item;
import br.com.estoque.modelo.item.ItemDao;
import br.com.estoque.modelo.item.ListaItens;
import br.com.estoque.modelo.usuario.TokenDao;
import br.com.estoque.modelo.usuario.TokenUsuario;

import javax.jws.WebMethod;
import javax.jws.WebParam;
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

    @WebMethod(operationName = "CadastrarItem")
    public Item cadastrarItem(@WebParam(name = "toekn", header = true) TokenUsuario token,
                              @WebParam(name = "item") Item item) throws AutorizacaoException {
        if (!new TokenDao().ehValido(token)) {
            throw new AutorizacaoException("Autorizacao falhou");
        }

        System.out.println("Cadastrando " + item);

        this.dao.cadastrar(item);
        return item;
    }
}
