

public class AFDR {
	
	char [] monedas;
	int i=0;
	
	
	public void eQ0() {
		//Estado Inicial
		if(monedas[i]=='1') {
			i++;
			eQ1();
		}
		
		if(monedas[i]=='2') {
			i++;
			eQ2();
		}
		
		if(monedas[i]=='5') {
			i++;
			eQ5();
		}
		
		if(monedas[i]=='D') {
			i++;
			eQ10();
		}
		
		
	}
	
	public void eQ1() {
		//Estado q1
		
		if(monedas[i]=='1') {
			i++;
			eQ2();
		}
		
		if(monedas[i]=='2') {
			i++;
			eQ3();
		}
		
		if(monedas[i]=='5') {
			i++;
			eQ6();
		}
		
		if(monedas[i]=='D') {
			i++;
			eQ11();
		}
		
		
	}
	
	public void eQ2() {
		//Estado q2
		
		if(monedas[i]=='1') {
			i++;
			eQ3();
		}
		
		if(monedas[i]=='2') {
			i++;
			eQ4();
		}
		
		if(monedas[i]=='5') {
			i++;
			eQ7();
		}
		
		if(monedas[i]=='D') {
			i++;
			eQ12();
		}
		
	}
	
	public void eQ3() {
		//Estado q3
		
		if(monedas[i]=='1') {
			i++;
			eQ4();
		}
		
		if(monedas[i]=='2') {
			i++;
			eQ5();
		}
		
		if(monedas[i]=='5') {
			i++;
			eQ8();
		}
		
		if(monedas[i]=='D') {
			i++;
			eQ13();
		}
		
	}
	
	public void eQ4() {
		//Estado q4
		
		if(monedas[i]=='1') {
			i++;
			eQ5();
		}
		
		if(monedas[i]=='2') {
			i++;
			eQ6();
		}
		
		if(monedas[i]=='5') {
			i++;
			eQ9();
		}
		
		if(monedas[i]=='D') {
			i++;
			eQ14();
		}
		
	}
	
	public void eQ5() {
		if(monedas[i]=='1') {
			i++;
			eQ6();
		}
		
		if(monedas[i]=='2') {
			i++;
			eQ7();
		}
		
		if(monedas[i]=='5') {
			i++;
			eQ10();
		}
		
		if(monedas[i]=='D') {
			i++;
			eQ15();
		}
		
	}
	
	public void eQ6() {
		//Estado q6
		
		if(monedas[i]=='1') {
			i++;
			eQ7();
		}
		
		if(monedas[i]=='2') {
			i++;
			eQ8();
		}
		
		if(monedas[i]=='5') {
			i++;
			eQ11();
		}
		
		if(monedas[i]=='D') {
			i++;
			eQ16(monedas[i],6);
		}
		
	}
	
	public void eQ7() {
		//Estado q7
		
		if(monedas[i]=='1') {
			i++;
			eQ8();
		}
		
		if(monedas[i]=='2') {
			i++;
			eQ9();
		}
		
		if(monedas[i]=='5') {
			i++;
			eQ12();
		}
		
		if(monedas[i]=='D') {
			i++;
			eQ16(monedas[i],7);
		}
		
	}
	
	public void eQ8() {
		//Estado q8
		
		if(monedas[i]=='1') {
			i++;
			eQ9();
		}
		
		if(monedas[i]=='2') {
			i++;
			eQ10();
		}
		
		if(monedas[i]=='5') {
			i++;
			eQ13();
		}
		
		if(monedas[i]=='D') {
			i++;
			eQ16(monedas[i],8);
		}
		
	}
	
	public void eQ9() {
		//Estado q9
		
		if(monedas[i]=='1') {
			i++;
			eQ10();
		}
		
		if(monedas[i]=='2') {
			i++;
			eQ11();
		}
		
		if(monedas[i]=='5') {
			i++;
			eQ14();
		}
		
		if(monedas[i]=='D') {
			i++;
			eQ16(monedas[i],9);
		}
		
	}
	
	public void eQ10() {
		//Estado q10
		
		if(monedas[i]=='1') {
			i++;
			eQ11();
		}
		
		if(monedas[i]=='2') {
			i++;
			eQ12();
		}
		
		if(monedas[i]=='5') {
			i++;
			eQ15();
		}
		
		if(monedas[i]=='D') {
			i++;
			eQ16(monedas[i],10);
		}
		
	}
	
	public void eQ11() {
		//Estado q11
		
		if(monedas[i]=='1') {
			i++;
			eQ12();
		}
		
		if(monedas[i]=='2') {
			i++;
			eQ13();
		}
		
		if(monedas[i]=='5') {
			i++;
			eQ16(monedas[i],11);
		}
		
		if(monedas[i]=='D') {
			i++;
			eQ16(monedas[i],11);
		}
		
	}
	
	public void eQ12() {
		//Estado q12
		
		if(monedas[i]=='1') {
			i++;
			eQ13();
		}
		
		if(monedas[i]=='2') {
			i++;
			eQ14();
		}
		
		if(monedas[i]=='5') {
			i++;
			eQ16(monedas[i],12);
		}
		
		if(monedas[i]=='D') {
			i++;
			eQ16(monedas[i],12);
		}
		
	}
	
	public void eQ13() {
		//Estado q13
		
		if(monedas[i]=='1') {
			i++;
			eQ14();
		}
		
		if(monedas[i]=='2') {
			i++;
			eQ15();
		}
		
		if(monedas[i]=='5') {
			i++;
			eQ16(monedas[i],13);
		}
		
		if(monedas[i]=='D') {
			i++;
			eQ16(monedas[i],13);
		}
		
	}
	
	public void eQ14() {
		//Estado q14
		
		if(monedas[i]=='1') {
			i++;
			eQ15();
		}
		
		if(monedas[i]=='2') {
			i++;
			eQ16(monedas[i],14);
		}
		
		if(monedas[i]=='5') {
			i++;
			eQ16(monedas[i],14);
		}
		
		if(monedas[i]=='D') {
			i++;
			eQ16(monedas[i],14);
		}
		
	}
	
	public void eQ15() {
		//Estado Final
		
	}
	
	public int eQ16(char m, int numE) {
		//Estado error
		int cambio = 0;
		
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
		
		return cambio;
	}
	

}
