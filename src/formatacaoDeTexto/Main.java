package formatacaoDeTexto;

import java.util.Scanner;

import formatacaoDeTexto.editorDeTexto.EditorDeTexto;
import formatacaoDeTexto.editorDeTexto.Formatacao;
import formatacaoDeTexto.editorDeTexto.TipoFormatacao;

public class Main {

	public static void main(String[] args) {
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.print("Informe o texto: ");
			String texto = entrada.nextLine();
			
			EditorDeTexto editorDeTexto = new EditorDeTexto(texto);
			
			System.out.println("Qual o tipo de formatação");
			System.out.print("(1) Caixa Alta (2) Caixa Baixa (3) Negrito (4) Italico: ");
			int opcaoFormatacao = entrada.nextInt();
			
			TipoFormatacao tipoFormatacao = TipoFormatacao.values()[opcaoFormatacao -1 ];
			Formatacao formatacao = tipoFormatacao.obterFormatacao();
			
			editorDeTexto.setFormatacao(formatacao);
			System.out.println(editorDeTexto.publicarTexto());
		}
	}
}
