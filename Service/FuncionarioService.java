package Service;

import DAO.ClientePFDAO;
import DAO.FuncionarioDao;
import Enums.Sexo;
import Enums.TipoPessoa;
import Models.ClientePF;
import Models.Funcionario;

import java.time.LocalDate;
import java.util.Date;
import java.util.stream.Stream;

public class FuncionarioService {
    FuncionarioDao dao = new FuncionarioDao();

    public void adicionaFuncionario(String username, String Password, String Nome, LocalDate dtContratacao) {
        Funcionario funcionario = new Funcionario();
        funcionario.setUsername(username);
        funcionario.setPassword(Password);
        funcionario.setNome(Nome);
        funcionario.setDtContratacao(dtContratacao);
        dao.Criar(funcionario);

    }

    public void atualizarCliente(Long id, Funcionario funci) throws Exception {
        dao.Atualizar(id, funci);
    }

    public Stream<Funcionario> LerClientes(){
        return dao.Read();
    }

    public void delete(Funcionario funci){
        dao.Deletar(funci);
    }
}
