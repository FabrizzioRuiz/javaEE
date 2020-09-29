package mx.com.gm.sga.cliente.ciclovidajpa;

import javax.persistence.*;
import javax.persistence.Persistence;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.*;

public class PersistirObjetoJPA {
    static Logger log = LogManager.getRootLogger();
    
    public static void main(String[] args) {
      EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
      EntityManager em = emf.createEntityManager();
      EntityTransaction tx = em.getTransaction();
      
      //Inicia la transaccion
      //Paso 1. Crea nuevo objeto
      Persona persona1 = new Persona("Pedro","Luna", "pluna@gmail.com", "12345");
      
      //Paso 2. Inicia Transaccion
      tx.begin();
      
      //Paso3. Ejecutamos SQL
      em.persist(persona1);
      log.debug("Objeto persistido - aun sin commit" + persona1);
      //Paso 4. comit/rollback
      tx.commit();
      
      //Objeto en estado detached
      log.debug("Objeto persistido - estado detached" + persona1);
      
      //Cerramos el EM
      em.close();
    }
    
}
