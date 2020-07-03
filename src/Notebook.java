
public class Notebook {
	
	private String memoriaRam; 
	private String hd;
	private String nome;
	private String processador;
	private String marca ; 
	
	
	public Notebook() {

	}
	
	public void setMarca(String marca) {
	}
	
	public void setMemoriaRam(String memoriaRam) {
		this.memoriaRam = memoriaRam;
	}
	
	public void setHd(String hd) {
		this.hd = hd;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void setProcessador(String processador) {
		this.processador = processador;
	}
	
	
	public String toString() {
		
		return "Notebook [nome = " + nome + "Marca =" + marca + "Memória RAM = " + memoriaRam + "HD =" + hd + "Processador =" + processador + "]";
	}
	
	
	
	
	
	
	
	
	

}
