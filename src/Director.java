
public class Director {
	
	protected NotebookBuilder notebookBuilder;
	
	
	public void setNotebookBuilder (NotebookBuilder noteBuilder) {
		
		this.notebookBuilder = noteBuilder;	
		
	}
	
	
	public Notebook getNotebook() {
		
		return notebookBuilder.getNotebook();
	}

	public void criaNotebook() {
		
		notebookBuilder.buildNome();
		notebookBuilder.buildMarca();
		notebookBuilder.buildMemoriaRam();
		notebookBuilder.buildHd();
		notebookBuilder.buildProcessador();
				
	}

	
	
}
