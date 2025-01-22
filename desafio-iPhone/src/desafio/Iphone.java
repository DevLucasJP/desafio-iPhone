package desafio;

public class Iphone implements ReprodutorMusical, NavegadorInternet, Telefone {

	private String musicaAtual;
	private boolean pause;
	private String paginaInicial;

	public void setMusicaAtual(String musicaAtual) {
		this.musicaAtual = musicaAtual;
	}

	public String getMusicaAtual() {
		return musicaAtual;
	}

	public void setPause(boolean pause) {
		this.pause = pause;
	}

	public boolean isPause() {
		return pause;
	}

	public void setPaginaInicial(String paginaInicial) {
		this.paginaInicial = paginaInicial;
	}

	public String getPaginaInicial() {
		return paginaInicial;
	}

	public void tocar() {

		if (musicaAtual == null) {
			System.out.println("Escolha uma música primeiro!");
		} else {

			setPause(false);
			System.out.println("Tocando agora: " + getMusicaAtual());
		}
	}

	public void pausar() {

		if (getMusicaAtual() == null || pause == true) {
			System.out.println("Nenhuma música está sendo reproduzida no momento.");
		} else {

			setPause(true);
			System.out.println("A música foi pausada.");
		}
	}

	public void selecionarMusica(String musica) {
		setMusicaAtual(musica);
	}

	public void exibirPagina(String url) {

		if (url != null && url.trim() != "") {
			System.out.println("Carregando o site " + url);
		}
	}

	public void adicionarNovaAba() {

		if (paginaInicial == null) {
			System.out.println("Abrindo uma aba em branco.");
		} else {
			System.out.println("Carregando " + getPaginaInicial());
		}
	}

	public void atualizarPagina() {
		System.out.println("Atualizando a página atual.");
	}

	public void ligar(String numero) {

		if (numero == null || !numero.matches("^?\\d+$")) {
			System.out.println("O número discado é inválido!");
		} else {
			System.out.println("Ligando para " + numero);
		}
	}

	public void atender() {
		System.out.println("Em chamada.");
	}

	public void iniciarCorreioVoz() {
		System.out.println("Existem mensagens não ouvidas em seu correio de voz!");
	}
}
