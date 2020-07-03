
public class Programa {

	public static void main(String[] args) {
		
		Director diretor = new Director();
		
		NotebookBuilder notebookSonic = new SonicMaster();
		notebookSonic.criaNotebook();
		diretor.setNotebookBuilder(notebookSonic);
		diretor.criaNotebook();
		
		Notebook produtoNotebook = diretor.getNotebook();
		
		System.out.println(produtoNotebook);
		
		
	}
	
}
