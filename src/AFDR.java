import java.util.ArrayList;

public class AFDR {
	
	ArrayList<Character> monedas= new ArrayList<Character>();
	int i=0;
	private boolean acepta= false;
	private int cambio = 0;
	
	
	public void eQ0() {
		//Estado Inicial
		
		if(monedas.size()>i) {
		
			if(monedas.get(i)=='1') {
			i++;
			eQ1();
			}
		
			if(monedas.get(i)=='2') {
			i++;
			eQ2();
			}
		
			if(monedas.get(i)=='5') {
			i++;
			eQ5();
			}
		
			if(monedas.get(i)=='D') {
			i++;
			eQ10();
			}
		
		}
		
		else {
			acepta=false;
		}
	}
	
	public void eQ1() {
		//Estado q1
		
		if(monedas.size()>i) {
			if(monedas.get(i)=='1') {
				i++;
				eQ2();
			}
			
			if(monedas.get(i)=='2') {
				i++;
				eQ3();
			}
			
			if(monedas.get(i)=='5') {
				i++;
				eQ6();
			}
			
			if(monedas.get(i)=='D') {
				i++;
				eQ11();
			}
		}
		
		acepta=false;
	}
	
	public void eQ2() {
		//Estado q2
		
		if(monedas.size()>i) {
			if(monedas.get(i)=='1') {
				i++;
				eQ3();
			}
			
			if(monedas.get(i)=='2') {
				i++;
				eQ4();
			}
			
			if(monedas.get(i)=='5') {
				i++;
				eQ7();
			}
			
			if(monedas.get(i)=='D') {
				i++;
				eQ12();
			}
		}
		else {
			acepta=false;
		}
		
	}
	
	public void eQ3() {
		//Estado q3
		if(monedas.size()>i) {
			if(monedas.get(i)=='1') {
				i++;
				eQ4();
			}
			
			if(monedas.get(i)=='2') {
				i++;
				eQ5();
			}
			
			if(monedas.get(i)=='5') {
				i++;
				eQ8();
			}
			
			if(monedas.get(i)=='D') {
				i++;
				eQ13();
			}
		}
		else {
			acepta=false;
		}
		
	}
	
	public void eQ4() {
		//Estado q4
		
		if(monedas.size()>i) {
			if(monedas.get(i)=='1') {
				i++;
				eQ5();
			}
			
			if(monedas.get(i)=='2') {
				i++;
				eQ6();
			}
			
			if(monedas.get(i)=='5') {
				i++;
				eQ9();
			}
			
			if(monedas.get(i)=='D') {
				i++;
				eQ14();
			}
		}
		
		else {
			acepta=false;
		}
		
	}
	
	public void eQ5() {
		
		if(monedas.size()>i) {
			if(monedas.get(i)=='1') {
				i++;
				eQ6();
			}
			
			if(monedas.get(i)=='2') {
				i++;
				eQ7();
			}
			
			if(monedas.get(i)=='5') {
				i++;
				eQ10();
			}
			
		}
		
		if(monedas.get(i)=='D') {
			eQ15();
		}
		
		else {
			acepta=false;
		}
		
	}
	
	public void eQ6() {
		//Estado q6
		
		if(monedas.size()>i) {
			if(monedas.get(i)=='1') {
				i++;
				eQ7();
			}
			
			if(monedas.get(i)=='2') {
				i++;
				eQ8();
			}
			
			if(monedas.get(i)=='5') {
				i++;
				eQ11();
			}
		}
			
		if(monedas.get(i)=='D') {
			eQ16(monedas.get(i),6);
		}
		
		else {
			acepta=false;
		}
		
	}
	
	public void eQ7() {
		//Estado q7
		
		if(monedas.size()>i) {
			if(monedas.get(i)=='1') {
				i++;
				eQ8();
			}
			
			if(monedas.get(i)=='2') {
				i++;
				eQ9();
			}
			
			if(monedas.get(i)=='5') {
				i++;
				eQ12();
			}
		}
		if(monedas.get(i)=='D') {
			eQ16(monedas.get(i),7);
		}
		
		
		else {
			acepta=false;
		}
		
	}
	
	public void eQ8() {
		//Estado q8
		
		if(monedas.size()>i) {
			if(monedas.get(i)=='1') {
				i++;
				eQ9();
			}
			
			if(monedas.get(i)=='2') {
				i++;
				eQ10();
			}
			
			if(monedas.get(i)=='5') {
				i++;
				eQ13();
			}
		}
		if(monedas.get(i)=='D') {
			eQ16(monedas.get(i),8);
		}
		
		
		else {
			acepta=false;
		}
		
	}
	
	public void eQ9() {
		//Estado q9
		
		if(monedas.size()>i) {
			if(monedas.get(i)=='1') {
				i++;
				eQ10();
			}
			
			if(monedas.get(i)=='2') {
				i++;
				eQ11();
			}
			
			if(monedas.get(i)=='5') {
				i++;
				eQ14();
			}
		}
		
		if(monedas.get(i)=='D') {
			eQ16(monedas.get(i),9);
		}
		
		
		else {
			acepta=false;
		}
		
	}
	
	public void eQ10() {
		//Estado q10
		
		if(monedas.size()>i) {
			if(monedas.get(i)=='1') {
				i++;
				eQ11();
			}
			
			if(monedas.get(i)=='2') {
				i++;
				eQ12();
			}	
		}
		
		if(monedas.get(i)=='5') {
			eQ15();
		}
			
		if(monedas.get(i)=='D') {
			eQ16(monedas.get(i),10);
		}
		
		else {
			acepta=false;
		}
		
	}
	
	public void eQ11() {
		//Estado q11
		
		if(monedas.size()>i) {
			if(monedas.get(i)=='1') {
				i++;
				eQ12();
			}
			
			if(monedas.get(i)=='2') {
				i++;
				eQ13();
			}
		}
			
		if(monedas.get(i)=='5') {
			eQ16(monedas.get(i),11);
		}
			
			
		if(monedas.get(i)=='D') {
			eQ16(monedas.get(i),11);
		}
		
		
		else {
			acepta=false;
		}
		
	}
	
	public void eQ12() {
		//Estado q12
		
		if(monedas.size()>i) {
			if(monedas.get(i)=='1') {
				i++;
				eQ13();
			}
			
			if(monedas.get(i)=='2') {
				i++;
				eQ14();
			}
		}
		
		if(monedas.get(i)=='5') {
			eQ16(monedas.get(i),12);
		}
		
		if(monedas.get(i)=='D') {
			eQ16(monedas.get(i),12);
		}
		
		else {
			acepta=false;
		}
		
	}
	
	public void eQ13() {
		//Estado q13
		
		if(monedas.size()>i) {
			if(monedas.get(i)=='1') {
				i++;
				eQ14();
			}
		}
		
		if(monedas.get(i)=='2') {
			eQ15();
		}
		
		if(monedas.get(i)=='5') {
			eQ16(monedas.get(i),13);
		}
		
		if(monedas.get(i)=='D') {
			eQ16(monedas.get(i),13);
		}
		
		else {
			acepta=false;
		}
		
	}
	
	public void eQ14() {
		//Estado q14
		
		if(monedas.get(i)=='1') {
			eQ15();
		}
		
		if(monedas.get(i)=='2') {
			eQ16(monedas.get(i),14);
		}
		
		if(monedas.get(i)=='5') {
			eQ16(monedas.get(i),14);
		}
		
		if(monedas.get(i)=='D') {
			eQ16(monedas.get(i),14);
		}
		
		else {
			acepta=false;
		}
		
	}
	
	public void eQ15() {
		//Estado Final
		acepta=true;
	}
	
	public void eQ16(char m, int numE) {
		//Estado error
		
		acepta=true;
		
		if(m=='1') {
			cambio=(numE+1)-15;
		}
		
		if(m=='2') {
			cambio=(numE+2)-15;
		}
		
		if(m=='5') {
			cambio=(numE+5)-15;
		}
		
		if(m=='D') {
			cambio=(numE+10)-15;
		}
		
		System.out.println("cambio:" + cambio);
		
	}

	public boolean getAcepta() {
		return acepta;
	}

	public int getCambio() {
		return cambio;
	}
	

}
