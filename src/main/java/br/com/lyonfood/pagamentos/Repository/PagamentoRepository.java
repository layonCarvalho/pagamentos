package br.com.lyonfood.pagamentos.Repository;

import br.com.lyonfood.pagamentos.Model.Pagamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PagamentoRepository extends JpaRepository<Pagamento, Long> {
}
