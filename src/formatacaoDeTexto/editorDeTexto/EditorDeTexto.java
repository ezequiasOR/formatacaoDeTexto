package formatacaoDeTexto.editorDeTexto;

import formatacaoDeTexto.editorDeTexto.formatacao.CaixaBaixa;

public class EditorDeTexto {

	private String texto;
	private Formatacao formatacao;
	
	public EditorDeTexto(String texto) {
		this.texto = texto;
		this.formatacao = new CaixaBaixa();
	}
	
	public String publicarTexto() {
		return formatacao.formatarTexto(texto);
	}
	
	public String getTexto() {
		return texto;
	}
	
	public void setTexto(String texto) {
		this.texto = texto;
	}
	
	public Formatacao getFormatacao() {
		return formatacao;
	}
	
	public void setFormatacao(Formatacao formatacao) {
		this.formatacao = formatacao;
	}

}
