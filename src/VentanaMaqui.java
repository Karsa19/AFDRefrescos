import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextArea;

public class VentanaMaqui extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton moneda1, moneda2, moneda5, moneda10;
	private ButtonGroup sabores;
	private JRadioButton coca, manzana, fanta;
	private JButton dmoneda, comprar;
	private JTextArea pantalla;
	Font fuente=new Font("Dialog", Font.BOLD, 20);
	private int dinero=0;
	private 
	
	AFDR ref= new AFDR();

	public VentanaMaqui() {
		super();
		configVentana();
		inicializarComp();
		
	}
	
	private void configVentana() {
        this.setTitle("Maquina de Refrescos");                   
        this.setSize(320, 280);                                 
        this.setLocationRelativeTo(null);                       
        this.setLayout(null);                                   
        this.setResizable(false);                               
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);    
    }
	
	public void inicializarComp() {
		pantalla= new JTextArea();
		moneda1 = new JButton();
		moneda2 = new JButton();
		moneda5 = new JButton();
		moneda10 = new JButton();
		sabores= new ButtonGroup();
		coca= new JRadioButton("Coca");
		manzana= new JRadioButton("Manzana");
		fanta= new JRadioButton("Fanta");
		dmoneda= new JButton();
		comprar= new JButton();
		
		//Configuracion de los botones
		pantalla.setText("$ 00");
		pantalla.setEditable(false);
		pantalla.setBounds(50,30,200,30);
		pantalla.setFont(fuente);
		
		moneda1.setText("$1");
		moneda1.setBounds(20,90,60,30);
		moneda1.addActionListener(this);
		
		moneda2.setText("$2");
		moneda2.setBounds(90,90,60,30);
		moneda2.addActionListener(this);
		
		moneda5.setText("$5");
		moneda5.setBounds(160,90,60,30);
		moneda5.addActionListener(this);
		
		moneda10.setText("$10");
		moneda10.setBounds(230,90,60,30);
		moneda10.addActionListener(this);
		
		sabores.add(coca);
		sabores.add(manzana);
		sabores.add(fanta);
		
		coca.setBounds(40, 140, 60, 30);
		coca.setVisible(false);
		manzana.setBounds(100, 140, 80, 30);
		manzana.setVisible(false);
		fanta.setBounds(180, 140, 60, 30);
		fanta.setVisible(false);
		
		dmoneda.setText("Devolver");
		dmoneda.setBounds(50,200,100,30);
		dmoneda.addActionListener(this);
		
		comprar.setText("Comprar");
		comprar.setBounds(170,200,100,30);
		comprar.addActionListener(this);
		
		this.add(pantalla);
		this.add(moneda1);
		this.add(moneda2);
		this.add(moneda5);
		this.add(moneda10);
		this.add(coca);
		this.add(manzana);
		this.add(fanta);
		this.add(dmoneda);
		this.add(comprar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		
		if(e.getSource()==moneda1) {
			if(dinero<15) {
				dinero=dinero+1;
				ref.monedas.add('1');
				pantalla.setText("$ "+Integer.toString(dinero));
			}
			
			if(dinero>=15) {
				coca.setVisible(true);
				manzana.setVisible(true);
				fanta.setVisible(true);
			}
		}
		
		if(e.getSource()==moneda2) {
			if(dinero<15) {
				dinero=dinero+2;
				ref.monedas.add('2');
				pantalla.setText("$ "+Integer.toString(dinero));
			}
			
			if(dinero>=15) {
				coca.setVisible(true);
				manzana.setVisible(true);
				fanta.setVisible(true);
			}
		}
		
		if(e.getSource()==moneda5) {
			if(dinero<15) {
				dinero=dinero+5;
				ref.monedas.add('5');
				pantalla.setText("$ "+Integer.toString(dinero));
			}
			
			if(dinero>=15) {
				coca.setVisible(true);
				manzana.setVisible(true);
				fanta.setVisible(true);
			}
		}
		
		if(e.getSource()==moneda10) {
			if(dinero<15) {
				dinero=dinero+10;
				ref.monedas.add('D');
				pantalla.setText("$ "+Integer.toString(dinero));
			}
			
			if(dinero>=15) {
				coca.setVisible(true);
				manzana.setVisible(true);
				fanta.setVisible(true);
			}
		}
		
		if(e.getSource()==dmoneda) {
			dinero=0;
			ref.monedas.clear();
			pantalla.setText("$ "+Integer.toString(dinero));
			ref.i=0;
		}
		
		if(e.getSource()==comprar) {
			ref.eQ0();
			
			if(ref.getAcepta()==true) {
				pantalla.setText("Cambio: $ "+Integer.toString(ref.getCambio()));
			}
			
			if(ref.getAcepta()==false){
				pantalla.setText("Dinero Insuficiente");
			}
			
			coca.setVisible(false);
			manzana.setVisible(false);
			fanta.setVisible(false);
			
		}
		
	}
	

}
