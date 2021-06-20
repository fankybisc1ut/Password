package abstractas;

import javax.swing.JOptionPane;

public class UsoPass {

	public static void main(String[] args) {
	
		int tamanho=Integer.parseInt(JOptionPane.showInputDialog("introduce dimensiones de array"));
		int longitud = Integer.parseInt(JOptionPane.showInputDialog("Introduce longitud de password"));
		
		CreaPass mispass[]= new CreaPass[tamanho];
		
		for(int i=0; i<mispass.length;i++) {
			mispass[i]= new CreaPass(longitud);
			System.out.println("Password " +  mispass[i].getpassword() + " Longitud " + mispass[i].getlongitud()  );
			System.out.println(mispass[i].esSegura());
		}
	}
}
