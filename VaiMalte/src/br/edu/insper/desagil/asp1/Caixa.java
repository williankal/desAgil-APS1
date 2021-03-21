package br.edu.insper.desagil.asp1;

import java.util.HashMap;
import java.util.Map;

public class Caixa {
	
	private Map<Integer, Integer> descontos;
	
	public Caixa() {
		this.descontos = new HashMap<>();
	}
	
	public void addDesconto(Produto produto, int codigo) {
		if (99 >= codigo && codigo >= 1) {
			this.descontos.put(produto.getCodigo(), codigo);
		}
	}
	
	public double total(Carrinho carrinho) {
		double somaTotal = 0.0;
		double desconto;
		
		for (Pedido pedido: carrinho.getPedidos()) {
			int codigo = pedido.getProduto().getCodigo();
			desconto = 1;
			
			if (this.descontos.containsKey(codigo)) {
				desconto = this.descontos.get(codigo) * 0.01;
			}
			somaTotal += pedido.totalPedidos() * desconto;
		}
		return somaTotal;
	}
	
}
