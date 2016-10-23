package br.com.jogoaps;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MelhoresJogadores extends JFrame implements ActionListener {
	private JButton imagemVoltar;
	private JPanel tela;
	private JLabel imagem;
	private JLabel tituloPontuacao;
	private JLabel tituloNome;
	private JLabel tituloMelhorJogador;
	private JLabel mostrarNome;
	private JLabel mostrarPontuacao;
	private BancoDados bancoDados = new BancoDados();

	public MelhoresJogadores() {

		setTitle("RANKING");
		setSize(900, 600);
		setResizable(false);
		setLocation(50, 50);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		ImageIcon icon = new ImageIcon("./src/mj.jpg");
		imagem = new JLabel(icon);
		imagem.setLocation(0, 0);
		imagem.setSize(900, 600);
		imagem.setVisible(true);

		tituloPontuacao = new JLabel("Pontuação");
		tituloPontuacao.setLocation(550, 30);
		tituloPontuacao.setSize(200, 200);
		tituloPontuacao.setFont(new Font("Showcard Gothic", Font.BOLD, 30));
		tituloPontuacao.setForeground(Color.red);
		tituloPontuacao.setVisible(true);

		tituloNome = new JLabel("Nome Jogadores");
		tituloNome.setLocation(30, 30);
		tituloNome.setSize(380, 200);
		tituloNome.setFont(new Font("Showcard Gothic", Font.BOLD, 30));
		tituloNome.setForeground(Color.red);
		tituloNome.setVisible(true);

		tituloMelhorJogador = new JLabel("OS MELHORES JOGADORES");
		tituloMelhorJogador.setLocation(150, -50);
		tituloMelhorJogador.setSize(700, 200);
		tituloMelhorJogador
				.setFont(new Font("Showcard Gothic", Font.PLAIN, 50));
		tituloMelhorJogador.setForeground(Color.blue);
		tituloMelhorJogador.setVisible(true);

		mostrarNome = new JLabel("");
		mostrarNome.setLocation(30, 150);
		mostrarNome.setSize(380, 400);
		mostrarNome.setFont(new Font("Showcard Gothic", Font.BOLD, 30));
		mostrarNome.setForeground(Color.MAGENTA);
		mostrarNome.setVisible(true);

		mostrarPontuacao = new JLabel("");
		mostrarPontuacao.setLocation(550, 150);
		mostrarPontuacao.setSize(380, 400);
		mostrarPontuacao.setFont(new Font("Showcard Gothic", Font.BOLD, 30));
		mostrarPontuacao.setForeground(Color.MAGENTA);
		mostrarPontuacao.setVisible(true);

		ImageIcon img2 = new ImageIcon("./src/v.png");
		imagemVoltar = new JButton("", img2);
		imagemVoltar.setSize(120, 50);
		imagemVoltar.setLocation(380, 480);
		imagemVoltar.addActionListener(this);
		imagemVoltar.setFont(new Font("arial", Font.BOLD, 22));
		imagemVoltar.setBackground(Color.red);
		imagemVoltar.setFocusable(false);
		imagemVoltar.setContentAreaFilled(false);
		imagemVoltar.setForeground(Color.red);
		imagemVoltar.setContentAreaFilled(false);
		imagemVoltar.setBorderPainted(false);

		tela = new JPanel();
		tela.setSize(900, 600);
		tela.setLocation(0, 0);
		tela.setBackground(Color.black);
		tela.setLayout(null);

		getContentPane().setLayout(null);
		getContentPane().add(tela);
		tela.add(mostrarNome);
		tela.add(mostrarPontuacao);
		tela.add(imagemVoltar);
		tela.add(tituloMelhorJogador);
		tela.add(tituloNome);
		tela.add(tituloPontuacao);
		tela.add(imagem);
		fragmentarNomes();
	}

	public void fragmentarNomes() {
		if (bancoDados.pesquisarNomeJogador().size() == 1) {
			mostrarNome.setText("<html>"
					+ bancoDados.pesquisarNomeJogador().get(0) + "</html>");
		} else if (bancoDados.pesquisarNomeJogador().size() == 2) {
			mostrarNome.setText("<html>"
					+ bancoDados.pesquisarNomeJogador().get(0) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(1) + "</html>");
		} else if (bancoDados.pesquisarNomeJogador().size() == 3) {
			mostrarNome.setText("<html>"
					+ bancoDados.pesquisarNomeJogador().get(0) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(1) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(2) + "</html>");
		} else if (bancoDados.pesquisarNomeJogador().size() == 4) {
			mostrarNome.setText("<html>"
					+ bancoDados.pesquisarNomeJogador().get(0) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(1) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(2) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(3) + "</html>");
		} else if (bancoDados.pesquisarNomeJogador().size() == 5) {
			mostrarNome.setText("<html>"
					+ bancoDados.pesquisarNomeJogador().get(0) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(1) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(2) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(3) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(4) + "</html>");
		} else if (bancoDados.pesquisarNomeJogador().size() == 6) {
			mostrarNome.setText("<html>"
					+ bancoDados.pesquisarNomeJogador().get(0) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(1) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(2) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(3) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(4) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(5) + "</html>");
		} else if (bancoDados.pesquisarNomeJogador().size() == 7) {
			mostrarNome.setText("<html>"
					+ bancoDados.pesquisarNomeJogador().get(0) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(1) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(2) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(3) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(4) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(5) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(6) + "</html>");
		} else if (bancoDados.pesquisarNomeJogador().size() == 8) {
			mostrarNome.setText("<html>"
					+ bancoDados.pesquisarNomeJogador().get(0) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(1) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(2) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(3) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(4) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(5) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(6) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(7) + "</html>");
		} else if (bancoDados.pesquisarNomeJogador().size() == 9) {
			mostrarNome.setText("<html>"
					+ bancoDados.pesquisarNomeJogador().get(0) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(1) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(2) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(3) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(4) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(5) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(6) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(7) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(8) + "</html>");
		} else if (bancoDados.pesquisarNomeJogador().size() == 10) {
			mostrarNome.setText("<html>"
					+ bancoDados.pesquisarNomeJogador().get(0) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(1) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(2) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(3) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(4) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(5) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(6) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(7) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(8) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(9) + "</html>");
		}

		if (bancoDados.pesquisarPontuacaoJogador().size() == 1) {
			mostrarPontuacao
					.setText("<html>"
							+ bancoDados.pesquisarPontuacaoJogador().get(0)
							+ "</html>");
		} else if (bancoDados.pesquisarPontuacaoJogador().size() == 2) {
			mostrarPontuacao
					.setText("<html>"
							+ bancoDados.pesquisarPontuacaoJogador().get(0)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(1)
							+ "</html>");
		} else if (bancoDados.pesquisarPontuacaoJogador().size() == 3) {
			mostrarPontuacao
					.setText("<html>"
							+ bancoDados.pesquisarPontuacaoJogador().get(0)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(1)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(2)
							+ "</html>");
		} else if (bancoDados.pesquisarPontuacaoJogador().size() == 4) {
			mostrarPontuacao
					.setText("<html>"
							+ bancoDados.pesquisarPontuacaoJogador().get(0)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(1)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(2)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(3)
							+ "</html>");
		} else if (bancoDados.pesquisarPontuacaoJogador().size() == 5) {
			mostrarPontuacao.setText("<html>"
					+ bancoDados.pesquisarPontuacaoJogador().get(0) + "<br>"
					+ bancoDados.pesquisarPontuacaoJogador().get(1) + "<br>"
					+ bancoDados.pesquisarPontuacaoJogador().get(2) + "<br>"
					+ bancoDados.pesquisarPontuacaoJogador().get(3) + "<br>"
					+ bancoDados.pesquisarNomeJogador().get(4) + "</html>");
		} else if (bancoDados.pesquisarPontuacaoJogador().size() == 6) {
			mostrarPontuacao
					.setText("<html>"
							+ bancoDados.pesquisarPontuacaoJogador().get(0)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(1)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(2)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(3)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(4)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(5)
							+ "</html>");
		} else if (bancoDados.pesquisarPontuacaoJogador().size() == 7) {
			mostrarPontuacao
					.setText("<html>"
							+ bancoDados.pesquisarPontuacaoJogador().get(0)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(1)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(2)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(3)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(4)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(5)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(6)
							+ "</html>");
		} else if (bancoDados.pesquisarPontuacaoJogador().size() == 8) {
			mostrarPontuacao
					.setText("<html>"
							+ bancoDados.pesquisarPontuacaoJogador().get(0)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(1)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(2)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(3)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(4)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(5)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(6)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(7)
							+ "</html>");
		} else if (bancoDados.pesquisarPontuacaoJogador().size() == 9) {
			mostrarPontuacao
					.setText("<html>"
							+ bancoDados.pesquisarPontuacaoJogador().get(0)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(1)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(2)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(3)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(4)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(5)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(6)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(7)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(8)
							+ "</html>");
		} else if (bancoDados.pesquisarPontuacaoJogador().size() == 10) {
			mostrarPontuacao
					.setText("<html>"
							+ bancoDados.pesquisarPontuacaoJogador().get(0)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(1)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(2)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(3)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(4)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(5)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(6)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(7)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(8)
							+ "<br>"
							+ bancoDados.pesquisarPontuacaoJogador().get(9)
							+ "</html>");
		}
	}

	public static void main(String[] args) {
		new MelhoresJogadores().setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == imagemVoltar) {
			new InicioJogo().setVisible(true);
			dispose();
		}
	}
}
