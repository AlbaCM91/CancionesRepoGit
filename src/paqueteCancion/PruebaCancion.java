package paqueteCancion;
/**
 * esta clase contiene los metodos que hemos aportado a la clase Cancion, donde nos muestra la primera cancio que aparece,
 * la cancion qu está sonando, si queremos parar la cancion o pasar a l siguiente, cual es la de mayor duracion y un listado
 * de todas las canciones disponibles
 * @author Alba
 * @version 17.02.22
 *
 */
public class PruebaCancion {
/**
 * en esta clase vamos a trabajar con algunos de los siguientes metodos
 * @see Cancion#reproducirCancion() este metodo nos permite reproducir canciones
 * @see Cancion#pararCancion() este metodo nos permite para la cancion que este sonando
 * @see Cancion#MismaCancion(Cancion) este metodo nos permite saber si una cancion es la misma que otra
 * @see Cancion#SiguienteCancion(Cancion[], String) este metodo nos permite pasar a la siguiente cancion
 * @see Cancion#MayorDuracion(Cancion[]) aqui nos muestra la cancion de mayor duracion
 * @param args ..
 */
public static void main(String[] args) {
		
		Cancion cancionMiaRosalia = new Cancion("Bulerías", "Rosalía", 157, false);
		Cancion cancionMiaEzVIt = new Cancion("No me renta II", "EZVIT", 178, false);
		
		
	
		Cancion cancionPrueba = new Cancion();
		System.out.println(cancionPrueba);
		
		Cancion cancionClasico = new Cancion("Sweet Home Alabama", 180);
		System.out.println(cancionPrueba);
		
		Cancion primeraCancion = new Cancion("I Don't Like Mondays", "The Boomtown Rats", 390, true);
		Cancion segundaCancion = new Cancion("Don’t Stop Believin’", "Journey", 320, false);
		Cancion terceraCancion = new Cancion("Come Join The Murder", "The White Buffalo & The Forest Rangers", 420, false);

		if (primeraCancion.reproducirCancion()) {
			System.out.println(primeraCancion.getTitulo() + "está sonando");
		}
		if (primeraCancion.pararCancion()) {
			System.out.println(primeraCancion.getTitulo() + "stop");
		}
		if (primeraCancion.MismaCancion(cancionClasico)) {
			System.out.println("Parece que no son la misma canción");
		}
		Cancion nueva = new Cancion("Baba O'riley", "The Who", 310, false);
		Cancion[] canciones = { primeraCancion, segundaCancion, terceraCancion, nueva };
		
		mostrarCancionesyAutor(canciones);
		mostrarCancionMasLarga(canciones);

		mostrarSiguienteCancion(primeraCancion, canciones);
		mostrarSiguienteCancion(nueva, canciones);
	}


	private static void mostrarSiguienteCancion(Cancion miCancion, Cancion[] canciones) {
		System.out.println("La canción que sonará después de " + miCancion.getTitulo() + " será "
				+ Cancion.SiguienteCancion(canciones, miCancion.getTitulo()));
	}


	private static void mostrarCancionMasLarga(Cancion[] canciones) {
		System.out.println("La canción más larga es: " + Cancion.MayorDuracion(canciones));
	}


	private static void mostrarCancionesyAutor(Cancion[] canciones) {
		for (int i = 0; i < canciones.length; i++) {
			System.out.println("La canción es " + canciones[i].getTitulo() + " de " + canciones[i].getGrupo());
		}
	}
	
}
