package bressan.sandra.singleton;

/**
 * Singleton "preguiçoso"
 */

public class SingletonLazy {
	
	private static SingletonLazy instancia;

	private SingletonLazy() { //private evita que seja instanciado
		super();
	}

	public static SingletonLazy getInstancia() {
		if (instancia == null) {
			instancia = new SingletonLazy();
		}
		return instancia;
	}

}
