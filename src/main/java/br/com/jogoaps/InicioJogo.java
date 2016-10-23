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

public class InicioJogo extends JFrame implements ActionListener {
	private JButton inicioJogo;
	private JButton melhoresJogadores;
	private JButton respostasPerguntas;
	private JLabel imagem;
	private JLabel terceiraLinhaTitulo;
	private JLabel primeiraLinhaTitulo;
	private JLabel segundaLinhaTitulo;
	private JPanel tela;

	public InicioJogo() {
		setTitle("PRESERVAR O MEIO AMBIENTE É PRESERVAR O PLANETA. PRESERVAR O PLANETA  É PRESERVAR A VIDA.");
		setSize(900, 600);
		setResizable(false);
		setLocation(50, 50);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		terceiraLinhaTitulo = new JLabel("EDUCAÇÃO AMBIENTAL");
		terceiraLinhaTitulo.setLocation(340, 120);
		terceiraLinhaTitulo.setSize(600, 60);
		terceiraLinhaTitulo.setFont(new Font("Showcard Gothic", Font.BOLD, 40));
		terceiraLinhaTitulo.setForeground(Color.orange);
		terceiraLinhaTitulo.setBackground(Color.black);
		
		primeiraLinhaTitulo = new JLabel("QUIZ");
		primeiraLinhaTitulo.setLocation(500, 20);
		primeiraLinhaTitulo.setSize(470, 40);
		primeiraLinhaTitulo.setFont(new Font("Showcard Gothic", Font.BOLD, 40));
		primeiraLinhaTitulo.setForeground(Color.orange);

		segundaLinhaTitulo = new JLabel("DE");
		segundaLinhaTitulo.setLocation(520, 70);
		segundaLinhaTitulo.setSize(470, 40);
		segundaLinhaTitulo.setFont(new Font("Showcard Gothic", Font.BOLD, 40));
		segundaLinhaTitulo.setForeground(Color.orange);

		ImageIcon img = new ImageIcon("./src/a.png");
		inicioJogo = new JButton("", img);
		inicioJogo.setSize(235, 85);
		inicioJogo.setLocation(330, 210);
		inicioJogo.addActionListener(this);
		inicioJogo.setFont(new Font("arial", Font.BOLD, 22));
		inicioJogo.setBackground(Color.BLUE);
		inicioJogo.setFocusable(false);
		inicioJogo.setContentAreaFilled(false);
		inicioJogo.setForeground(Color.BLUE);
		inicioJogo.setBorderPainted(false);

		melhoresJogadores = new JButton("Melhor");
		melhoresJogadores.setBounds(350, 320, 205, 65);
		melhoresJogadores.addActionListener(this);
		melhoresJogadores.setFont(new Font("Showcard Gothic", Font.BOLD, 30));
		melhoresJogadores.setFocusable(false);
		melhoresJogadores.setForeground(Color.BLUE);

		respostasPerguntas = new JButton("Resposta");
		respostasPerguntas.setBounds(350, 420, 205, 65);
		respostasPerguntas.addActionListener(this);
		respostasPerguntas.setFont(new Font("Showcard Gothic", Font.BOLD, 30));
		respostasPerguntas.setFocusable(false);
		respostasPerguntas.setForeground(Color.BLUE);

		ImageIcon icon = new ImageIcon(".\\src\\we1.gif");
		imagem = new JLabel(icon);
		imagem.setLocation(0, 0);
		imagem.setSize(900, 600);

		tela = new JPanel();
		tela.setSize(900, 600);
		tela.setLocation(0, 0);
		tela.setBackground(Color.black);
		tela.setLayout(null);
		
		getContentPane().setLayout(null);
		tela.add(terceiraLinhaTitulo);
		tela.add(primeiraLinhaTitulo);
		tela.add(segundaLinhaTitulo);
		tela.add(inicioJogo);
		tela.add(melhoresJogadores);
		tela.add(respostasPerguntas);
		getContentPane().add(imagem);
		getContentPane().add(tela);
		tela.add(imagem);
	}

	public static void main(String arg[]) {
		new InicioJogo().setVisible(true);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == inicioJogo) {
			Pergunta1 pergunta1 = new Pergunta1();
			pergunta1.setVisible(true);
			dispose();
		}

		if (e.getSource() == melhoresJogadores) {
			MelhoresJogadores melhoresJogadores = new MelhoresJogadores();
			melhoresJogadores.setVisible(true);
			dispose();
		}
		if (e.getSource() == respostasPerguntas) {
			Respostas respostas = new Respostas();
			respostas.setVisible(true);
			dispose();
		}
	}
}
