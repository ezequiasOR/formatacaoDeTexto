package formatacaoDeTexto.editorDeTexto.formatacao;

import formatacaoDeTexto.editorDeTexto.Formatacao;

public class CaixaAlta implements Formatacao {

	public String formatarTexto(String texto) {
		return texto.toUpperCase();
	}
}
