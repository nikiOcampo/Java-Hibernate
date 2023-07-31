package educacionit.jpa;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import educacionit.jpa.entidades.herencia1.Cliente1;
import educacionit.jpa.entidades.herencia1.Empleado1;
import educacionit.jpa.entidades.herencia1.Persona1DAO;
import educacionit.jpa.entidades.herencia2.Cliente2;
import educacionit.jpa.entidades.herencia2.Cliente2DAO;
import educacionit.jpa.entidades.herencia2.Empleado2;
import educacionit.jpa.entidades.herencia2.Empleado2DAO;
import educacionit.jpa.entidades.herencia3.Cliente3;
import educacionit.jpa.entidades.herencia3.Cliente3DAO;
import educacionit.jpa.entidades.herencia3.Empleado3;
import educacionit.jpa.entidades.herencia3.Empleado3DAO;
import educacionit.jpa.entidades.herencia4.Cliente4;
import educacionit.jpa.entidades.herencia4.Cliente4DAO;

@SpringBootApplication
public class JpaApplication implements CommandLineRunner{

	  @Autowired
	  Persona1DAO dao;
	  
	  @Autowired
	  Cliente4DAO cliente4Dao;
	  
	  @Autowired
	  Cliente2DAO cliente2Dao;
	  
	  @Autowired
	  Empleado2DAO empleado2Dao;
	  
	  @Autowired
	  Cliente3DAO cliente3Dao;
	  
	  @Autowired
	  Empleado3DAO empleado3Dao;
	  
	  public static void main(String[] args) {
	    SpringApplication.run(JpaApplication.class, args);
	  }
	  @Override
	  public void run(String... args) throws Exception {
		  
//		  Cliente1 p = new Cliente1(); //CREA UNA SOLA TABLA PERSONA1 Y LOS CARGA TODOS A LA MISMA TABLA
//		  p.setApellido("Perez2");
//		  p.setNombre("Max2i");
//		  p.setCantidadDeCompras(2);
//		  p.setNumeroCliente(232433L);
//		  dao.save(p);
		  
//		  Empleado1 e = new Empleado1();
//		  e.setApellido("Perez2");
//		  e.setNombre("Max2i");
//		  e.setLegajo("leg");
//		  e.setSueldo(250000.0);
//		  dao.save(e);
		  
//		  Cliente2 c2 = new Cliente2(); //CREA UNA TABLA POR CADA SUBCLASE, ES DECIR UNA PARA CLIENTE Y OTRA PARA EMPLEADO
//		  c2.setApellido("Perez2");
//		  c2.setNombre("Max2i");
//		  c2.setCantidadDeCompras(2);
//		  c2.setNumeroCliente(232433L);
//		  
//		  cliente2Dao.save(c2);
		  
//		  Empleado2 e = new Empleado2();
//		  e.setApellido("Perez2");
//		  e.setNombre("Max2i");
//		  e.setLegajo("leg");
//		  e.setSueldo(250000.0);
//		  empleado2Dao.save(e);
		  
		  Cliente3 c3 = new Cliente3();
		  c3.setApellido("Perez2");
		  c3.setNombre("Max2i");
		  c3.setCantidadDeCompras(2);
		  c3.setNumeroCliente(232433L);
		  
		  cliente3Dao.save(c3);
		  
		  
		  Empleado3 e = new Empleado3();
		  e.setApellido("Perez2");
		  e.setNombre("Max2i");
		  e.setLegajo("leg");
		  e.setSueldo(250000.0);
		  empleado3Dao.save(e);
		  
//		  Cliente4 c4 = new Cliente4();
//		  c4.setApellido("Perez2");
//		  c4.setNombre("Max2i");
//		  c4.setCantidadDeCompras(2);
//		  c4.setNumeroCliente(232433L);
//		  
//		  cliente4Dao.save(c4);
		
		  
		  
	  }


}
