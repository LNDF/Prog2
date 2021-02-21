package ejercicios.tema1.basicos;

/**
 * Saca a consola la tabla de multiplicar del 0 al 9, en el formato:
 *             0  1  2  3  4  5  6  7  8  9
 *            -----------------------------
 * Tabla de 0  0  0  0  0  0  0  0  0  0  0
 * Tabla de 1  0  1  2  3  4  5  6  7  8  9
 * Tabla de 2  0  2  4  6  8 10 12 14 16 18
 * ...
 * 
 * @author Lander Gallastegi
 *
 */
public class EjercicioC {
	
	/**
	 * Devuelbe cuantas cifras tiene un numero entero.
	 * Para ello, divide el número entre 10 hasta que 
	 * quede 0.
	 * 
	 * @param numero El numero para calcular cuantas cifras tiene
	 * @return La cantidad de cifras
	 */
	public static int cifras(int numero) {
		int cifra = 0;
		do {
			cifra++;
			numero /= 10;
		} while(numero != 0);
		return cifra;
	}
	
	/**
	 * Imprime un string n cantidad de veces en la misma linea
	 * 
	 * @param cantidad La cantidad de espacios para imprimir
	 * @param str El string para imprimir
	 */
	public static void imprimirString(int cantidad, String str) {
		for (int i = 0; i < cantidad; i++) {
			System.out.print(str);
		}
	}
	
	/**
	 * Imprime un numero, pero antes imprime x cantidad de espacios.
	 * la cantidad de espacios se calcula quitandole la cantidad de
	 * cifras del numero a maxCifras.
	 * 
	 * @param numero
	 * @param maxCifras
	 */
	public static void imprimirNumero(int numero, int maxCifras) {
		int c = maxCifras - cifras(numero);
		if (c < 0) {
			c = 0;
		}
		imprimirString(c, " ");
		System.out.print(numero);
	}
	
	/**
	 * La método de punto de entrada.
	 * Imprime con un formato limpio la tabla de multiplicación del 0 al 9
	 * 
	 * @param args Los argumentos de la linea de comandos.
	 */
	public static void main(String[] args) {
		int maxTabla = 9;
		String mensaje = "Tabla de ";
		int longitudLinea = 0;
		int maxCifras = cifras(maxTabla);
		int maxCifrasMultiplicacion = cifras(maxTabla * maxTabla);
		int longitudMensaje = mensaje.length() + 1 + maxCifras;
		imprimirString(longitudMensaje, " ");
		for (int i = 0; i <= maxTabla; i++) {
			imprimirNumero(i, maxCifrasMultiplicacion + 1);
		}
		System.out.println("");
		imprimirString(longitudMensaje, " ");
		imprimirString((maxCifrasMultiplicacion + 1) * (maxTabla + 1), "-");
		System.out.println("");
		for (int i = 0; i <= maxTabla; i++) {
			System.out.print(mensaje);
			imprimirNumero(i, maxCifras);
			System.out.print(" ");
			for (int j = 0; j <= maxTabla; j++) {
				imprimirNumero(i * j, maxCifrasMultiplicacion + 1);
			}
			System.out.println("");
		}
	}
	
}