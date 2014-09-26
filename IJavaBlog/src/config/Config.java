package config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import service.ComentarioService;
import service.EntradaService;
import service.IComentarioService;
import service.IEntradaService;
import service.IUsuarioService;
import service.UsuarioService;
import dao.ComentarioDao;
import dao.EntradaDao;
import dao.IComentarioDao;
import dao.IEntradaDao;
import dao.IUsuarioDao;
import dao.UsuarioDao;

@Configuration // Le dice a Spring que esta es una clase de configuraciones
@EnableTransactionManagement // Habilita el manejo de transacciones en Spring
public class Config {
	@Bean // Define un bean singleton que se llama entityManagerFactory
	public EntityManagerFactory entityManagerFactory() {
		return Persistence.createEntityManagerFactory("IJavaBlog");
	}

	@Bean
	public EntityManager entityManager() {
		return entityManagerFactory().createEntityManager();
	}

	@Bean
	public PlatformTransactionManager transactionManager() {
		JpaTransactionManager transactionManager = new JpaTransactionManager();
		transactionManager.setEntityManagerFactory(entityManagerFactory());
		return transactionManager;
	}
	
	@Bean
	public IUsuarioDao usuarioDao() {
		return new UsuarioDao();
	}
	
	@Bean
	public IComentarioDao comentarioDao() {
		return new ComentarioDao();
	}
	
	@Bean
	public IComentarioService comentarioService() {
		return new ComentarioService();
	}

	@Bean
	public IUsuarioService usuarioService() {
		return new UsuarioService();
	}
	
	@Bean
	public IEntradaDao entradasDao() {
		return new EntradaDao();
	}

	@Bean
	public IEntradaService entradaService() {
		return new EntradaService();
	}

}
