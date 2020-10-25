package formatacaoDeTexto.editorDeTexto;

import formatacaoDeTexto.editorDeTexto.formatacao.CaixaAlta;
import formatacaoDeTexto.editorDeTexto.formatacao.CaixaBaixa;
import formatacaoDeTexto.editorDeTexto.formatacao.Italico;
import formatacaoDeTexto.editorDeTexto.formatacao.Negrito;

public enum TipoFormatacao {

	CAIXAALTA {
		@Override
		public Formatacao obterFormatacao() {
			return new CaixaAlta();
		}
	},
	CAIXABAIXA {
		@Override
		public Formatacao obterFormatacao() {
			return new CaixaBaixa();
		}
	},
	NEGRITO {
		@Override
		public Formatacao obterFormatacao() {
			return new Negrito();
		}
	},
	ITALICO {
		@Override
		public Formatacao obterFormatacao() {
			return new Italico();
		}
	};
	
	public abstract Formatacao obterFormatacao();
}
