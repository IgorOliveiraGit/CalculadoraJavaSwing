package application;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Main{
	
	public static void main(String[] args) {
		criarEMostrarCalculadora();
    }
	
	static String campo = "";
	static float resultado;
	static boolean operacao = false; 
	
	private static void criarEMostrarCalculadora() {
		
		JFrame jFrame = new JFrame("Calculadora");
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(500, 600);
		
		GridLayout grid = new GridLayout(4, 4, 3, 3);
        
        jFrame.setLayout(grid);
        
        JLabel textoExibido = new JLabel();
        textoExibido.setText(campo);
        jFrame.add(textoExibido);
        
        JButton botao1 = new JButton("7");
		botao1.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo += "7";
                textoExibido.setText(campo);
            }
		});
		
		JButton botao2 = new JButton("8");
		botao2.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo += "8";
                textoExibido.setText(campo);
            }
		});
		
		JButton botao3 = new JButton("9");
		botao3.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo += "9";
                textoExibido.setText(campo);
            }
		});
		
		JButton botao4 = new JButton("/");
		botao4.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                if (!operacao) {
                	campo += "/";
                	textoExibido.setText(campo);
                	operacao = true;
                }
                
            }
		});
		
		JButton botao5 = new JButton("4");
		botao5.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo += "4";
                textoExibido.setText(campo);
            }
		});
		
		JButton botao6 = new JButton("5");
		botao6.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo += "5";
                textoExibido.setText(campo);
            }
		});
		
		JButton botao7 = new JButton("6");
		botao7.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo += "6";
                textoExibido.setText(campo);
            }
		});
		
		JButton botao8 = new JButton("*");
		botao8.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if (!operacao) {
				campo += "*";
                textoExibido.setText(campo);
                operacao = true;
				}
            }
		});
		
		JButton botao9 = new JButton("1");
		botao9.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo += "1";
                textoExibido.setText(campo);
            }
		});
		
		JButton botao10 = new JButton("2");
		botao10.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo += "2";
                textoExibido.setText(campo);
            }
		});
		
		JButton botao11 = new JButton("3");
		botao11.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo += "3";
                textoExibido.setText(campo);
            }
		});
		
		JButton botao12 = new JButton("-");
		botao12.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if (!operacao) {
				campo += "-";
                textoExibido.setText(campo);
                operacao = true;
				}
            }
		});
		
		JButton botao13 = new JButton("0");
		botao13.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo += "0";
                textoExibido.setText(campo);
            }
		});
		
		JButton botao14 = new JButton(".");
		botao14.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				campo += ".";
                textoExibido.setText(campo);
            }
		});
		
		JButton botao15 = new JButton("=");
		botao15.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				resultado = Calculos.RealizarOperacao(campo);
				campo = Float.toString(resultado);
				textoExibido.setText(campo);
				operacao = false;
            }
		});
		
		JButton botao16 = new JButton("+");
		botao16.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				if (!operacao) {
				campo += "+";
                textoExibido.setText(campo);
                operacao = true;
				}
            }
		});
		
		JButton botao17 = new JButton("Limpar");
		botao17.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(java.awt.event.ActionEvent evt) {
				campo = "";
				operacao = false;
				textoExibido.setText(campo);
            }
		});
		
        jFrame.add(botao1);
        jFrame.add(botao2);
        jFrame.add(botao3);
	    jFrame.add(botao4);	    	    
	    jFrame.add(botao8);
	    jFrame.add(botao5);
	    jFrame.add(botao6);
	    jFrame.add(botao7);
	    jFrame.add(botao12);
	    jFrame.add(botao16);	    
	    jFrame.add(botao9);
	    jFrame.add(botao10);
	    jFrame.add(botao11);
	    jFrame.add(botao13);	    
	    jFrame.add(botao14);
	    jFrame.add(botao17);
	    jFrame.add(botao15);
	   
	    jFrame.setVisible(true);
	}
}
