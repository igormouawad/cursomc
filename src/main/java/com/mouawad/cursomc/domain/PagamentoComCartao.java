package com.mouawad.cursomc.domain;

import java.io.Serializable;

import com.mouawad.cursomc.domain.enums.EstadoPagamento;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
public class PagamentoComCartao extends Pagamento implements Serializable {
	private static final long serialVersionUID = 1L;

	private Integer numeroDeParcelas;

	public PagamentoComCartao(Integer id, EstadoPagamento estado, Pedido pedido, Integer numeroDeParcelas) {
		super(id, estado.getCod(), pedido);
		this.numeroDeParcelas = numeroDeParcelas;
	}

}
