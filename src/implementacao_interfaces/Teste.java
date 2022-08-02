package implementacao_interfaces;

import implementacao_singleton.SingletonEager;
import implementacao_singleton.SingletonLazy;

public class Teste {

	public static void main(String[] args) {
		
		SingletonEager eager1 = SingletonEager.getInstancia();
		System.out.println(eager1);
		
		SingletonEager eager2 = SingletonEager.getInstancia();
		System.out.println(eager2);
		
		SingletonLazy lazy1 = SingletonLazy.getInstancia();
		System.out.println(lazy1);
		
		SingletonLazy lazy2 = SingletonLazy.getInstancia();
		System.out.println(lazy2);
		

	}

}
