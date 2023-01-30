package DAO;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

import Models.Model;

public abstract class AbstractDAO<T extends Model> implements ICRUD<T> {

    private long id = 1L;

    private Set<T> dados = new HashSet<>();

    @Override
    public T Atualizar(long Id, T entidade) throws Exception {
        T atualizar = dados.stream().filter(objeto -> objeto.getId() == Id).findFirst()
                .orElseThrow(() -> new Exception("Não encontrado"));
        dados.remove(atualizar);
        entidade.setId(Id);
        dados.add(entidade);
        return entidade;
    }

    @Override
    public T Criar(T entidade) {
        entidade.setId(id++);
        dados.add(entidade);
        return entidade;
    }

    @Override
    public boolean Deletar(T entidade) {
        try {
            dados.remove(entidade);
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public Stream<T> Read() {
        return Collections.unmodifiableSet(dados).stream();

    }

}
