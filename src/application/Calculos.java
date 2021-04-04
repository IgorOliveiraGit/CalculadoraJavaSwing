package application;

public class Calculos {
	
	private static String VerificarOperador(String campo) {
		if (campo.contains("+")) {
			return "Soma";
		}else if (campo.contains("*")) {
			return "Multi";
		}else if (campo.contains("-")) {
			return "Sub";
		}else if (campo.contains("/")) {
			return "Div";
		}
		return null;
	}

	public static float RealizarOperacao(String campo) {
		String operacao = VerificarOperador(campo);
		float valor1;
		float valor2;
		
		if (operacao.equals("Soma")) {
			valor1 = Float.parseFloat(campo.substring(0, campo.indexOf("+")));
			valor2 = Float.parseFloat(campo.substring(campo.indexOf("+")+1, campo.length()));
			return valor1 + valor2;
		}else if (operacao.equals("Multi")) {
			valor1 = Float.parseFloat(campo.substring(0, campo.indexOf("*")));
			valor2 = Float.parseFloat(campo.substring(campo.indexOf("*")+1, campo.length()));
			return valor1 * valor2;
		}else if (operacao.equals("Sub")) {
			valor1 = Float.parseFloat(campo.substring(0, campo.indexOf("-")));
			valor2 = Float.parseFloat(campo.substring(campo.indexOf("-")+1, campo.length()));
			return valor1 - valor2;
		}else if (operacao.equals("Div")) {
			valor1 = Float.parseFloat(campo.substring(0, campo.indexOf("/")));
			valor2 = Float.parseFloat(campo.substring(campo.indexOf("/")+1, campo.length()));
			return valor1 / valor2;
		}
		return 0;
	}
}
