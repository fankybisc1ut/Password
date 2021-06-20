package abstractas;

import java.util.Random;

public class CreaPass {
	private String password;
	private int longitud;
	public CreaPass(int longitud) {
		
		this.longitud = longitud;
		password = generaPass();
	}
	
	public String getpassword()
	{
		return this.password;
	}
	public int getlongitud() {
		return longitud;
	}
	public String generaPass() {
		this.password= "";
		
		for (int i =0; i<longitud;i++) {
			if(i<2) {
			char mayus=(char)(int)(Math.random()* (91-65) + 65);
			password+=mayus;
		}else if(i==3) {
			char minusculas = (char)(int)(Math.random()*(123-97)+97);
			password+=minusculas;
		}
		else {
			char numeros = (char)(int)(Math.random()*(58-48) + 48);
			password+=numeros;
		}
		}
		return password;
		
	}
	
	public String esSegura() {
	int minus=0;
	int mayus=0;
	int num=0;
		for(int i=0;i<password.length();i++) {
			if(Character.isLowerCase(password.charAt(i))) {
				minus+=1;
			}else if( Character.isUpperCase(password.charAt(i))) {
				mayus+=1;
				
			}else {
				num+=1;
			}
		}
		if(num>=4 && minus>=1 && mayus>=2) {
			return " password es seguro";
		}else {
			return " password es debil";
		}
	}
}
		



