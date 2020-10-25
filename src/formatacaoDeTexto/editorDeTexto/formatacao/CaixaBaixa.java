package formatacaoDeTexto.editorDeTexto.formatacao;

import formatacaoDeTexto.editorDeTexto.Formatacao;

public class CaixaBaixa implements Formatacao {

	public String formatarTexto(String texto) {
		return texto.toLowerCase();
	}

}
