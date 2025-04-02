package calculadora;

import javax.swing.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculadora implements ActionListener{

	// Criação dos Campos de texto
	JTextField campoTexto01, campoTexto02,campoTexto03;
	//Criação do Botão
	JButton botaoSoma, botaoSubtracao;
	
	Calculadora(){
		
		//Criação de um Frame(Quadro)
		JFrame quadroPrincipal = new JFrame();
		campoTexto01 = new JTextField();
		campoTexto01.setBounds(50, 50, 150,20);
		campoTexto02 = new JTextField();
		campoTexto02.setBounds(50, 100, 150, 20);
		campoTexto03 = new JTextField();
		campoTexto03.setBounds(50, 150, 150, 20);
		
		//Campo de Texto3 não pode ser editado
		campoTexto03.setEditable(false);
		// Instanciação dos botões e inserção dos botões no Frame
		botaoSoma = new JButton("+");
		botaoSoma.setBounds(50,200, 50, 50);
		botaoSubtracao = new JButton("-");
		botaoSubtracao.setBounds(120,200, 50, 50);
		//Adicionando evento ao botão
		botaoSoma.addActionListener(this);
		botaoSubtracao.addActionListener(this);
		//Adicionando os componentes ao nosso Quadro
		quadroPrincipal.add(campoTexto01);
		quadroPrincipal.add(campoTexto02);
		quadroPrincipal.add(campoTexto03);
		quadroPrincipal.add(botaoSoma);
		quadroPrincipal.add(botaoSubtracao);
//Configurando as informações do meu quadro Principal
		quadroPrincipal.setSize(300, 300);
		quadroPrincipal.setLayout(null);
		quadroPrincipal.setVisible(true);
	}
	//Criação da ação quando é disparado a ação atraves do aperto do botão
	
	public void actionPerformed(ActionEvent e) {
		
		//Declaração das Variáveis
		
		String numero1 = campoTexto01.getText();
		String numero2 = campoTexto02.getText();
		
		//Converter o valor das variáveis para inteiro
		
		int numero01=Integer.parseInt(numero1);
		int numero02=Integer.parseInt(numero2);
		
		//Criar uma variável para resultado
		
		int resultado=0;
		
		//Verificar qual botão foi clicado
		
		if(e.getSource() == botaoSoma) {
			resultado = numero01+numero02;
		} else if(e.getSource() == botaoSubtracao) {
			resultado = numero01-numero02;
		}
		//Converter o resultado inteiro para String
		
		String resultadoFinal=String.valueOf(resultado);
		campoTexto03.setText(resultadoFinal);
	}
	public static void main(String[] args) {
		new Calculadora();
	}
}
