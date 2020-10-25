package formatacaoDeTexto.editorDeTexto.formatacao;

import formatacaoDeTexto.editorDeTexto.Formatacao;

public class Italico implements Formatacao {

	public String formatarTexto(String texto) {
		return "<i>" + texto + "</i>";
	}

}
