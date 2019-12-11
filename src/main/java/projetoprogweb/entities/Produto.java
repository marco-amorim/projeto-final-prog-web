package projetoprogweb.entities;

public class Produto {
	
	private int medida;
	private double preco;
	private int quantidadeDisp;
	private String nome;
	
	public Produto(int medida, double preco, int quantidadeDisp, String nome) {
		
		this.medida = medida;
		this.preco = preco;
		this.quantidadeDisp = quantidadeDisp;
		this.nome = nome;
	}
	
	public int getMedida() {
		return medida;
	}
	public void setMedida(int medida) {
		this.medida = medida;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	public int getQuantidadeDisp() {
		return quantidadeDisp;
	}
	public void setQuantidadeDisp(int quantidadeDisp) {
		this.quantidadeDisp = quantidadeDisp;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
}

