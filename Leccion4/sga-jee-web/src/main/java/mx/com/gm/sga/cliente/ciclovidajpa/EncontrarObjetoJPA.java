package mx.com.gm.sga.cliente.ciclovidajpa;

import javax.persistence.*;
import mx.com.gm.sga.domain.Persona;
import org.apache.logging.log4j.*;


public class EncontrarObjetoJPA {

    static Logger log = LogManager.getRootLogger();

    public static void main(String[] args) {
        //Iniciamos la fabrica
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("SgaPU");
        EntityManager em = emf.createEntityManager();
        

        //Inicia la transaccion
        //Paso 1. Obtener transaccion
        EntityTransaction tx = em.getTransaction();
        tx.begin();
       
        //Paso 2. Ejecuatmos SQL de tipo Select
        Persona persona1 = em.find(Persona.class, 1);
        
        //Paso 3. Termina la transaccion
        tx.commit();
        
        //Objeto en estadoi deteach
        log.debug("Objeto recuperado: "+persona1);
        
        //Cerramos el EM
        em.close();
    }
}
