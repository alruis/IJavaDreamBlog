package service;

import model.Comentario;

public interface IComentarioService {
	public void agregarComentario(Comentario c);

	public Comentario obtenerComentario(Integer idComentario);

	public void modificarComentario(Comentario c);

	public void eliminarComentario(Integer idComentario);
	
}
