package test;

import beans.HolaMundoEjbRemote;
import javax.naming.*;

public class TestHolaMundoEJB {
    public static void main(String[] args) {
        System.out.println("Iniciando llamada al EJB el cliente\n");
        try {
            Context jndi = new InitialContext();
            HolaMundoEjbRemote holamundoejb = (HolaMundoEjbRemote) jndi.lookup("java:global/HolaMundoEJB/HolaMundoEjbImpl!beans.HolaMundoEjbRemote");
            int resultado = holamundoejb.sumar(5, 3);
            System.out.println("Resultado de la suma es: "+resultado);
        } catch (NamingException e) {
            e.printStackTrace(System.out);
        }
    }
 
}
