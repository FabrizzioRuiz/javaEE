package test;

import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.*;

public class ClienteEntidadTest {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        //Inicia la transacion
        tx.begin();
        //No se debe especificar el id de la base de datos
        Persona persona1 = new Persona("Jose", "Gomez", "jgomez@gmail.com", "12345");
        log.debug("Objeto a persistir: "+persona1);
        //Persistimos el objeto
        em.persist(persona1);
        //Terminamos la transaccion
        tx.commit();
        log.debug("Objeto persistido"+persona1);
        em.close();
        
    }
}
