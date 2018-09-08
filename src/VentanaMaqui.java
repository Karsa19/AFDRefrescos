import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class VentanaMaqui extends JFrame implements ActionListener {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private JButton moneda1, moneda2, moneda5, moneda10;
	private JButton dmoneda, comprar;
	private JTextArea pantalla;
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
        this.setSize(310, 210);                                 
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
		dmoneda= new JButton();
		comprar= new JButton();
		
		//Configuracion de los botones
		pantalla.setText("$ 00");
		pantalla.setEditable(false);
		pantalla.setBounds(50,30,200,30);
		
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
		
		dmoneda.setText("Devolver");
		dmoneda.setBounds(50,140,100,30);
		dmoneda.addActionListener(this);
		
		comprar.setText("Comprar");
		comprar.setBounds(170,140,100,30);
		comprar.addActionListener(this);
		
		this.add(pantalla);
		this.add(moneda1);
		this.add(moneda2);
		this.add(moneda5);
		this.add(moneda10);
		this.add(dmoneda);
		this.add(comprar);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		if(e.getSource()==moneda1) {
			dinero=dinero+1;
			ref.monedas.add('1');
			pantalla.setText("$ "+Integer.toString(dinero));
		}
		
		if(e.getSource()==moneda2) {
			dinero=dinero+2;
			ref.monedas.add('2');
			pantalla.setText("$ "+Integer.toString(dinero));
		}
		
		if(e.getSource()==moneda5) {
			dinero=dinero+5;
			ref.monedas.add('5');
			pantalla.setText("$ "+Integer.toString(dinero));
		}
		
		if(e.getSource()==moneda10) {
			dinero=dinero+10;
			ref.monedas.add('D');
			pantalla.setText("$ "+Integer.toString(dinero));
		}
		
		if(e.getSource()==dmoneda) {
			dinero=0;
			ref.monedas.clear();
			pantalla.setText("$ "+Integer.toString(dinero));
			ref.i=0;
		}
		
		if(e.getSource()==comprar) {
			ref.eQ0();
		}
		
	}
	

}
