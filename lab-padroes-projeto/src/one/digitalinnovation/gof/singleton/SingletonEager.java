package one.digitalinnovation.gof.singleton;

/**
 * Singleton "apressado"
 *
 * @author vrobles
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager();

    private SingletonEager(){
        super();
    }

    public static SingletonEager getInstancia(){
        return instancia;
    }
}
