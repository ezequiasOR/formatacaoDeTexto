package formatacaoDeTexto.editorDeTexto.formatacao;

import formatacaoDeTexto.editorDeTexto.Formatacao;

public class Negrito implements Formatacao {

	public String formatarTexto(String texto) {
		return "<b>" + texto + "</b>";
	}

}
