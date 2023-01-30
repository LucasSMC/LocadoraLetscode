package Service;

import DAO.ClientePFDAO;
import Enums.Sexo;
import Enums.TipoPessoa;
import Models.ClientePF;

import java.util.Date;
import java.util.stream.Stream;

public class ClienteService {
    ClientePFDAO dao = new ClientePFDAO();

    public void adicionaCliente(String nome, TipoPessoa tipo, Date dtNascimento, Sexo sexo, String profissao, String cPF,
                                String habilitacao) {
        ClientePF cliente = new ClientePF( nome,  tipo,  dtNascimento,  sexo,  profissao,  cPF,
                 habilitacao);
        dao.Criar(cliente);

    }

    public void atualizarCliente(Long id, ClientePF cliente) throws Exception {
        dao.Atualizar(id, cliente);
    }

    public Stream<ClientePF> LerClientes(){
        return dao.Read();
    }

    public void delete(ClientePF cliente){
        dao.Deletar(cliente);
    }
}
