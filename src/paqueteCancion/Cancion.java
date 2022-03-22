package paqueteCancion;
/**
 * clase para construir canciones y sus métodos
 * @author Alba
 * @version 15.02.22
 * 
 */
public class Cancion {

	private String titulo;
	private String grupo;
	private int duracion;
	private boolean sonando;

	// Definimos los constructores

	/**
	 * constructor inicial que muestra un titulo vacio, la duracion 0 y que no esta sonando ninguna cancion
	 */
	Cancion() // Constructor sin parámetros
	{
		this.titulo = "";
		this.duracion = 0;
		this.sonando = false;
	}
	/**
	 * segundo constructor que nos muestra 2 parámetros
	 * @param titulo string que muestra el titulo
	 * @param duracion se trata de un int que nos muestra la duracion en segundos
	 */
	
	Cancion(String titulo, int duracion)// constructor con 2 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = false;
	}
	/**
	 * este constructor nos muestra los siguientes parametros
	 * @param titulo string que muestra el titulo
	 * @param grupo string
	 * @param duracion se trata de un int que nos muestra la duracion en segundos
	 * @param sonando booleado no muestra si etsa sonando=true o no=false
	 */
	Cancion(String titulo, String grupo, int duracion, boolean sonando) // constructor con 4 parámetros
	{
		this.titulo = titulo;
		this.duracion = duracion;
		this.sonando = sonando;
		this.grupo = grupo;
	}
/**
 * esta clase nos muestra si la cancion esta sonando o no
 * @return nos devuelve si una cancion esta sonando o no
 */
	boolean reproducirCancion() {
		if (this.sonando) {
			return false;
		} else {
			this.sonando = true;
			return true;
		}
	}
/**
 * esta clase nos muestra como parar la cancion si esta sonando
 * @return nos devuelve que ha parado la cancion
 */
	boolean pararCancion() {
		if (!this.sonando) {
			return false;
		} else {
			this.sonando = false;
			return true;
		}
	}

	// meter métodos get/set/toString()
	
	/**
	 * este metodo nos muestra el titulo de la cancion
	 * @return nos devuelve el titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * este metodo da y devuelve el nombre del grupo
	 * @return devuelve el nombre del grupo 
	 */
	public String getGrupo() {
		return grupo;
	}

	public void setGrupo(String grupo) {
		this.grupo = grupo;
	}
	/**
	 * este metodo nos devuleve la duración de la cancion que este sonando
	 * @return nos devuelve la duracion de la cancion actual
	 */
	public int getDuracion() {
		return duracion;
	}

	public void setDuracion(int duracion) {
		this.duracion = duracion;
	}
	/**
	 * este metodo nos muestra si la cancion esta sonando o no a traves de un booleano
	 * @return devuelve booleano true o false si suena o no la cancion
	 */
	public boolean isSonando() {
		return sonando;
	}

	public void setSonando(boolean sonando) {
		this.sonando = sonando;
	}

	/**
	 * este metodo nos dice si una cancion es la misma que otra a traves del titulo y el grupo
	 * @param cancion string
	 * @return devuelve booleano si la cancion esta sonando
	 */
	boolean MismaCancion(Cancion cancion) {
		if (this.titulo == cancion.titulo && this.grupo == cancion.grupo)
			return true;
		else
			return false;
	}
	/**
	 * este metodo nos muestra la cancion de mayor duracion recorriendo la longitud de un array
	 * @param canciones string con el nombre de la cancion de mayor duracion
	 * @return devuelve int con la duracion de la ca
	 */
	public static String MayorDuracion(Cancion[] canciones) {
		int posMax = 0;
		int max = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (canciones[i].duracion > max) {
				posMax = i;
				max = canciones[i].duracion;
			}
		}
		return canciones[posMax].titulo;

	}
	/**
	 * este metodo nos permite acceder a la siguiente cancion a traves de un array de posiciones
	 * @param canciones string
	 * @param titulo string
	 * @return nos muestra la siguiente cancion
	 */
	
	static String SiguienteCancion(Cancion[] canciones, String titulo) {
		int pos = 0;
		int siguiente = 0;
		for (int i = 0; i < canciones.length; i++) {
			if (titulo == canciones[i].titulo) {
				pos = i;
			}
		}
		if (pos == canciones.length - 1) {
			siguiente = 0;
		} else {
			siguiente = pos + 1;
		}
		return canciones[siguiente].titulo;
	}

	@Override
	public String toString() {
		return "Cancion [titulo=" + titulo + ", autor=" + grupo + ", duracion=" + duracion + ", sonando=" + sonando
				+ "]";
	}
	
	
}
