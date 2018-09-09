import java.util.ArrayList;

public class AFDR {

	ArrayList<Character> monedas = new ArrayList<Character>();
	int i = 0;
	int y=0;
	private boolean acepta = false;
	private int cambio = 0;

	public void eQ0() {
		
		
		if (monedas.size() > (i+1)) {
			if (monedas.get(i) == '1')
				eQ1();

			else if (monedas.get(i) == '2')
				eQ2();

			else if (monedas.get(i) == '5')
				eQ5();

			else if (monedas.get(i) == 'D')
				eQ10();

		}
		else {
			acepta = false;
		}
	}

	public void eQ1() {
		
		if (monedas.size() > (i+1)) {
			i++;
			if (monedas.get(i) == '1')
				eQ2();

			else if (monedas.get(i) == '2')
				eQ3();

			else if (monedas.get(i) == '5')
				eQ6();

			else if (monedas.get(i) == 'D')
				eQ11();
		} else
			acepta = false;
	}

	public void eQ2() {
		
		if (monedas.size() > (i+1)) {
			i++;
			if (monedas.get(i) == '1')
				eQ3();

			else if (monedas.get(i) == '2')
				eQ4();

			else if (monedas.get(i) == '5')
				eQ7();

			else if (monedas.get(i) == 'D')
				eQ12();

		} else
			acepta = false;
	}

	public void eQ3() {
		
		if (monedas.size() > (i+1)) {
			i++;
			if (monedas.get(i) == '1')
				eQ4();

			else if (monedas.get(i) == '2')
				eQ5();

			else if (monedas.get(i) == '5')
				eQ8();

			else if (monedas.get(i) == 'D')
				eQ13();
		} else
			acepta = false;
	}

	public void eQ4() {
		
		if (monedas.size() > (i+1)) {
			i++;
			if (monedas.get(i) == '1')
				eQ5();

			else if (monedas.get(i) == '2')
				eQ6();

			else if (monedas.get(i) == '5')
				eQ9();

			else if (monedas.get(i) == 'D')
				eQ14();
		} else
			acepta = false;
	}

	public void eQ5() {
		
		if (monedas.size() > (i+1)) {
			i++;
			if (monedas.get(i) == '1')
				eQ6();

			else if (monedas.get(i) == '2')
				eQ7();

			else if (monedas.get(i) == '5')
				eQ10();

			else if (monedas.get(i) == 'D')
				eQ15();

		} else
			acepta = false;
	}

	public void eQ6() {
		
		if (monedas.size() > (i+1)) {
			i++;
			if (monedas.get(i) == '1')
				eQ7();

			else if (monedas.get(i) == '2')
				eQ8();

			else if (monedas.get(i) == '5')
				eQ11();

			else if (monedas.get(i) == 'D')
				eQ16();
		} else
			acepta = false;
	}

	public void eQ7() {
		
		if (monedas.size() > (i+1)) {
			i++;
			if (monedas.get(i) == '1')
				eQ8();

			else if (monedas.get(i) == '2')
				eQ9();

			else if (monedas.get(i) == '5')
				eQ12();

			else if (monedas.get(i) == 'D')
				eQ16();
		}

		else
			acepta = false;
	}

	public void eQ8() {
		
		if (monedas.size() > (i+1)) {
			i++;
			if (monedas.get(i) == '1')
				eQ9();

			else if (monedas.get(i) == '2')
				eQ10();

			else if (monedas.get(i) == '5')
				eQ13();

			else if (monedas.get(i) == 'D')
				eQ16();
		}

		else
			acepta = false;
	}

	public void eQ9() {
		
		if (monedas.size() > (i+1)) {
			i++;
			if (monedas.get(i) == '1')
				eQ10();

			else if (monedas.get(i) == '2')
				eQ11();

			else if (monedas.get(i) == '5')
				eQ14();

			else if (monedas.get(i) == 'D')
				eQ16();

		} else
			acepta = false;
	}

	public void eQ10() {
		
		if (monedas.size() > (i+1)) {
			i++;
			if (monedas.get(i) == '1')
				eQ11();

			else if (monedas.get(i) == '2')
				eQ12();

			else if (monedas.get(i) == '5')
				eQ15();

			else if (monedas.get(i) == 'D')
				eQ16();

		} else
			acepta = false;
	}

	public void eQ11() {
		
		if (monedas.size() > (i+1)) {
			i++;
			if (monedas.get(i) == '1')
				eQ12();

			else if (monedas.get(i) == '2')
				eQ13();

			else if (monedas.get(i) == '5')
				eQ16();

			else if (monedas.get(i) == 'D')
				eQ16();

		}

		else
			acepta = false;
	}

	public void eQ12() {
		
		if (monedas.size() > (i+1)) {
			i++;
			if (monedas.get(i) == '1')
				eQ13();

			else if (monedas.get(i) == '2')
				eQ14();

			else if (monedas.get(i) == '5')
				eQ16();

			else if (monedas.get(i) == 'D')
				eQ16();
		} else
			acepta = false;
	}

	public void eQ13() {
		
		if (monedas.size() > (i+1)) {
			i++;
			if (monedas.get(i) == '1')
				eQ14();

			else if (monedas.get(i) == '2')
				eQ15();

			else if (monedas.get(i) == '5')
				eQ16();

			else if (monedas.get(i) == 'D')
				eQ16();
		} else
			acepta = false;
	}

	public void eQ14() {
		
		if (monedas.size() > (i+1)) {
			i++;
			if (monedas.get(i) == '1')
				eQ15();

			else if (monedas.get(i) == '2')
				eQ16();

			else if (monedas.get(i) == '5')
				eQ16();

			else if (monedas.get(i) == 'D')
				eQ16();

		}

		else
			acepta = false;

	}

	public void eQ15() {
	
		cambio=0;
		acepta = true;
		System.out.println(acepta);
	}

	public void eQ16() {
		// Estado error
       int suma,g;
       suma=0;
		acepta = true;
		//Se recorre el arreglo para obtener el total de dinero_
		//ingresado y asi regresar el cambio
		for (g=0; g<monedas.size();g++) {
		if (monedas.get(g) == 'D')
			suma=suma+10;
		else
			suma = suma+Character.getNumericValue(monedas.get(g));
		}
		cambio= suma-15;
	}

	public boolean getAcepta() {
		return acepta;
	}

	public int getCambio() {
		return cambio;
	}

}
