package bressan.sandra.singleton;

public class SingletonTest {

	public static void main(String[] args) {
		
		//Testes relacionados ao Design Pattern Singleton
		SingletonLazy lazy  = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		
		SingletonLazyHolder lazyH  = SingletonLazyHolder.getInstancia();
		System.out.println(lazyH);
		lazyH = SingletonLazyHolder.getInstancia();
		System.out.println(lazyH);
		
		SingletonEager Eager  = SingletonEager.getInstancia();
		System.out.println(Eager);
		Eager = SingletonEager.getInstancia();
		System.out.println(Eager);
	}
}
