package service;

//import java.util.List;

//import javax.persistence.Query;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import dao.IEntradaDao;
import exception.AppDaoException;
import exception.AppServiceException;
import model.Comentario;
import model.Entrada;


@Transactional // Le dice a Spring que gestione las transacciones 
public class EntradaService implements IEntradaService {
	@Autowired
	private IEntradaDao entradaDao;

	@Override
	public void agregarEntrada(Entrada ent) {
		
		
		try {
			
				entradaDao.agregar(ent);
			
		} catch (AppDaoException e) {
			throw new AppServiceException(e);
		}
	}

	@Override
	public List<Entrada> obtenerEntradas() {
		List<Entrada> entradas=null;
		List<Comentario> comentarios = null;
		
		try {
			entradas = entradaDao.obtenerTodos();
			if(entradas!=null && entradas.size() > 0 ){
				for(Entrada ent : entradas){
					comentarios=ent.getComentarios();
					if(comentarios!=null && comentarios.size() > 0 ){
						ent.setnComentarios(comentarios.size());
						comentarios=null;
					}
				}
				
			}
			return entradaDao.obtenerTodos();
		} catch (AppDaoException e) {
			throw new AppServiceException(e);
		}
	}

	@Override
	public Entrada obtenerEntrada(Integer idEntrada) {
		try {
			return entradaDao.obtener(idEntrada);
		} catch (AppDaoException e) {
			throw new AppServiceException(e);
		}
	}

	@Override
	public void eliminarEntrada(Integer idEntrada) {
		try {
			// Buscando la entrada
			//Entrada ent = entradaDao.obtener(idEntrada);

			// Eliminando los comentarios de la entrada
//			List<Comentario> comentarios = ent.getComentarios();
//			if (comentarios != null) for (Comentario o : comentarios) 
//				comentarioDao.eliminar(o.getId());

			// Eliminando la entrada
			entradaDao.eliminar(idEntrada); 
			
		} catch (AppDaoException e) {
			throw new AppServiceException(e);
		}
	}

	@Override
	public List<Comentario> obtenerComentarios(Integer idEntrada) {
		try {
			// Buscando la entrada
			Entrada ent = entradaDao.obtener(idEntrada);

			// Buscando los  comentarios de la entrada
		List<Comentario> comentarios = ent.getComentarios();
			if (comentarios != null){
			return comentarios;
			}else {
				return null;
			}

					
		} catch (AppDaoException e) {
			throw new AppServiceException(e);
		}

		
	}

	@Override
	public void modificarEntrada(Entrada ent) {

		try {
			
				entradaDao.modificar(ent);
			
		} catch (AppDaoException e) {
			throw new AppServiceException(e);
		}
		
	}


}
