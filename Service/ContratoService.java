package Service;

import DAO.ContratoDAO;
import Models.Contratos;
import Models.Veiculos;
import Pagamento.IPagamento;

import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class ContratoService {

    ContratoDAO dao = new ContratoDAO();
    PagamentoService pgmnt = new PagamentoService();
    public Contratos iniciarContrato(Veiculos veiculo, LocalDate dataAluguel, Period tempoAluguel, String finalidade, IPagamento metodoPagamento){

        Contratos contrato = new Contratos();
        contrato.setVeiculo(veiculo);
        contrato.setDataAluguel(dataAluguel);
        contrato.setFinalidade(finalidade);
        contrato.setValorParcial(veiculo.getDiaria()* tempoAluguel.getDays());

        pgmnt.receberPagamento(metodoPagamento,contrato.getValorParcial());

      return dao.Criar(contrato);


    }

    public Contratos DevolucaoVeiculo(Contratos contrato, LocalDate devolucao) throws Exception {
        contrato.setDataDevolucao(devolucao);
        Period periodoUsado = Period.between(contrato.getDataAluguel(), devolucao);
        Period compensavel = periodoUsado.minus(contrato.getTempoAluguel());
        if(!compensavel.isNegative() && !compensavel.isZero()){
            IPagamento metodo =contrato.getMetodo();
            Float valorCompensar = periodoUsado.getDays()*contrato.getVeiculo().getDiaria() - contrato.getValorParcial();
            pgmnt.receberPagamento(metodo,valorCompensar);
            contrato.setValorTotal(valorCompensar+contrato.getValorParcial());
        }else{
            contrato.setValorTotal(contrato.getValorParcial());
        }
        return dao.Atualizar(contrato.getId(),contrato);
    }

}
