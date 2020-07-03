
public abstract class NotebookBuilder  {
	
	protected Notebook notebook;
	
	public Notebook getNotebook() {
		
		return notebook;
		
	}
	
	
	public void criaNotebook() {
		
		notebook = new Notebook();
	}
	
	
	public abstract void buildNome();
	public abstract void buildMarca();
	public abstract void buildMemoriaRam();
	public abstract void buildHd();
	public abstract void buildProcessador();


}


