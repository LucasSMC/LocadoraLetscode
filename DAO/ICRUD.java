package DAO;

import java.util.stream.Stream;

public interface ICRUD<T> {

    T Criar(T entidade);

    boolean Deletar(T entidade);

    T Atualizar(long Id, T entidade) throws Exception;

    Stream<T> Read();
}
