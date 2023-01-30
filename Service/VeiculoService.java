package Service;

import DAO.ICRUD;
import DAO.VeiculosDAO;
import Models.Carro;
import Models.Veiculos;

import java.util.stream.Stream;

public class VeiculoService {

    VeiculosDAO dao = new VeiculosDAO();

    public void adicionaCarro(String Placa, float diaria) {
        Carro objeto = new Carro();
        dao.Criar(objeto);

    }

    public void atualizarCarro(Long id, Carro carro) throws Exception {
        dao.Atualizar(id, carro);
    }

    public Stream<Veiculos> LerCarros(){
        return dao.Read();
    }

    public void delete(Carro carro){
        dao.Deletar(carro);
    }
}
