package br.edu.insper.desagil.asp1;

public class Pedido {
	private Produto produto;
	private int quantidade;
	public Pedido(Produto produto) {
		super();
		this.produto = produto;
		this.quantidade = 1;
		}
	public Produto getProduto() {
		return this.produto;
	}
	
	public int getQuantidade() {
		return this.quantidade;
	}
	
	public void addQuantidade() {
		this.quantidade+=1;
	}
	
	public double totalPedidos() {
		double preco = this.produto.getPreco();
		double total = preco * this.getQuantidade();
		return total;
	}
	
}
