package br.com.dio.desafio.dominio;

public class Curso extends Conteudo {
	
	private int cargaHoraia;
	
	
	
	public Curso(String titulo, String descricao, int cargaHoraia) {
		super();
		this.setTitulo(titulo);
		this.setDescricao(descricao);
		this.cargaHoraia = cargaHoraia;
	}
	
	

	
	public int getCargaHoraia() {
		return cargaHoraia;
	}
	
	public void setCargaHoraia(int cargaHoraia) {
		this.cargaHoraia = cargaHoraia;
	}

	@Override
	public String toString() {
		return "Curso [titulo=" + this.getTitulo() + ", descricao=" + this.getDescricao() + ", cargaHoraia=" + cargaHoraia + "]\n";
	}



	@Override
	public double calcularXP() {
		// TODO Auto-generated method stub
		return XP_PADRAO * this.cargaHoraia;
	}
	
	
	
	
}
