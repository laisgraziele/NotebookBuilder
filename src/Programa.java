
public class Programa {

	public static void main(String[] args) {
		
		Director diretor = new Director();
		notebookSonic.criaNotebook();
		NotebookBuilder notebookSonic = new SonicMaster();
		
		diretor.setNotebookBuilder(notebookSonic);
		
		Notebook produtoNotebook = diretor.getNotebook();
		
		System.out.println(produtoNotebook);
		
		
	}
	
}
