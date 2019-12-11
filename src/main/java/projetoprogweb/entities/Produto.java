package projetoprogweb.entities;

public class Produto {
	
	private String medida;
	private double preco;
	private int quantidadeDisp;
	private String nome;
	
	public Produto(String medida, double preco, int quantidadeDisp, String nome) {
		
		this.medida = medida;
		this.preco = preco;
		this.quantidadeDisp = quantidadeDisp;
		this.nome = nome;
	}
	
	public String getMedida() {
		return medida;
	}
	public void setMedida(String medida) {
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

