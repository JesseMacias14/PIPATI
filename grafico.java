
/* JUAN YAIR ORTIZ RIVERA */

import java.io.*;
import javax.swing.*;
import javax.imageio.*;
import java.awt.event.*;

public class grafico{

	public static void main(String[] args) {

		try {

			// BASIC ELEMENTS
			ImageIcon background = new ImageIcon(ImageIO.read(new File("dark.jpg")));
			ImageIcon win  = new ImageIcon(ImageIO.read(new File("carta-w.png")).getScaledInstance(300,130,0) );
			ImageIcon draw = new ImageIcon(ImageIO.read(new File("carta-d.png")).getScaledInstance(300,130,0) );
			ImageIcon lose = new ImageIcon(ImageIO.read(new File("carta-l.png")).getScaledInstance(300,130,0) );
			ImageIcon clean   = new ImageIcon();
			ImageIcon rematch = new ImageIcon(ImageIO.read(new File("carta-r.png")).getScaledInstance(260,90,0) );
			ImageIcon rock      = new ImageIcon(ImageIO.read(new File("carta-01.jpg")).getScaledInstance(100,150,0) );
			ImageIcon rock2     = new ImageIcon(ImageIO.read(new File("carta-01n.jpg")).getScaledInstance(100,150,0) );
			ImageIcon paper     = new ImageIcon(ImageIO.read(new File("carta-02.jpg")).getScaledInstance(100,150,0) );
			ImageIcon paper2    = new ImageIcon(ImageIO.read(new File("carta-02n.jpg")).getScaledInstance(100,150,0) );
			ImageIcon scissors  = new ImageIcon(ImageIO.read(new File("carta-03.jpg")).getScaledInstance(100,150,0) );
			ImageIcon scissors2 = new ImageIcon(ImageIO.read(new File("carta-03n.jpg")).getScaledInstance(100,150,0) );
			ImageIcon generic   = new ImageIcon(ImageIO.read(new File("carta-g.jpg")).getScaledInstance(100,150,0) );

			// COMPONENTS
			JFrame ventana = new JFrame ("Rock | Paper | Scissors");
			ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			ventana.setResizable(false);
			ventana.setContentPane(new JLabel( background ));

			// RESULTS
			JLabel	resultado = new JLabel();
			resultado.setBounds(160, 220, 300, 130);

			// REMATCH
			JButton nuevotiro = new JButton( rematch );
			nuevotiro.setBounds(180, 490, 260, 90);
			nuevotiro.setVisible(false);
			nuevotiro.setBorder(BorderFactory.createEmptyBorder());

			// CPU
			JButton boton0 = new JButton( generic );
			boton0.setBounds(260, 50, 100, 150);
			boton0.setFocusable(false);
			boton0.setBorder(BorderFactory.createEmptyBorder());

			// ROCK
			JButton boton1 = new JButton( rock2 );
			boton1.setBounds(60, 350, 100, 150);
			boton1.setBorder(BorderFactory.createEmptyBorder());
			boton1.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        nuevotiro.setVisible(true);
			    }
			});
			boton1.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e){
					if( !nuevotiro.isVisible() ){
						boton1.setIcon( rock );
					}
				}
				public void mouseExited(MouseEvent e){
					if( !nuevotiro.isVisible() ){
						boton1.setIcon( rock2 );
					}
				}	
			});
	
			// PAPER
			JButton boton2 = new JButton( paper2 );
			boton2.setBounds(260, 350, 100, 150);
			boton2.setBorder(BorderFactory.createEmptyBorder());
			boton2.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        nuevotiro.setVisible(true);
			    }
			});
			boton2.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e){
					if( !nuevotiro.isVisible() ){
						boton2.setIcon( paper );
					}
				}
				public void mouseExited(MouseEvent e){
					if( !nuevotiro.isVisible() ){
						boton2.setIcon( paper2 );
					}
				}	
			});
		
			// SCISSORS
			JButton boton3 = new JButton( scissors2 );
			boton3.setBounds(460, 350, 100, 150);
			boton3.setBorder(BorderFactory.createEmptyBorder());
			boton3.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        nuevotiro.setVisible(true);
			    }
			});
			boton3.addMouseListener(new MouseAdapter() {
				public void mouseEntered(MouseEvent e){
					if( !nuevotiro.isVisible() ){
						boton3.setIcon( scissors );
					}
				}
				public void mouseExited(MouseEvent e){
					if( !nuevotiro.isVisible() ){
						boton3.setIcon( scissors2 );
					}
				}	
			});

			// REMATCH
			nuevotiro.addActionListener(new ActionListener() {
			    public void actionPerformed(ActionEvent e) {
			        nuevotiro.setVisible(false);
			        boton1.setIcon( rock2 );
			        boton2.setIcon( paper2 );
			        boton3.setIcon( scissors2 );
			        resultado.setIcon( clean );
			    }
			});

			// ADDING
			ventana.add(boton0);
			ventana.add(boton1);
			ventana.add(boton2);
			ventana.add(boton3);
			ventana.add(resultado);
			ventana.add(nuevotiro);

			// ENDING
			ventana.pack();
			ventana.setVisible(true);

		} catch (IOException e) {
		    System.out.println(e.toString());
		}

	}

}
