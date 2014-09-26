package model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ENTRADAS database table.
 * 
 */
@Entity
@Table(name="ENTRADAS")
@NamedQuery(name="Entrada.findAll", query="SELECT e FROM Entrada e")
public class Entrada implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int idEntrada;
	
	@Column(length=500)
	private String cabeceraEntrada;


	@Column(length=32670)
	private String entrada;

	@Temporal(TemporalType.DATE)
	private Date fechaactualizacion;

	@Temporal(TemporalType.DATE)
	private Date fechacreacion;

	@Column(nullable=false)
	private int idusuario;
	
	@Transient
	@Column(nullable=true)
	private int nComentarios;
	

	public int getnComentarios() {
		return nComentarios;
	}

	public void setnComentarios(int nComentarios) {
		this.nComentarios = nComentarios;
	}

	//bi-directional many-to-one association to Comentario
	@OneToMany(mappedBy="entrada")
	private List<Comentario> comentarios;

	public Entrada() {
	}

	public int getIdEntrada() {
		return this.idEntrada;
	}

	public void setIdEntrada(int idEntrada) {
		this.idEntrada = idEntrada;
	}

	public String getEntrada() {
		return this.entrada;
	}

	public void setEntrada(String entrada) {
		this.entrada = entrada;
	}

	public Date getFechaactualizacion() {
		return this.fechaactualizacion;
	}

	public void setFechaactualizacion(Date fechaactualizacion) {
		this.fechaactualizacion = fechaactualizacion;
	}

	public Date getFechacreacion() {
		return this.fechacreacion;
	}

	public void setFechacreacion(Date fechacreacion) {
		this.fechacreacion = fechacreacion;
	}

	public int getIdusuario() {
		return this.idusuario;
	}

	public void setIdusuario(int idusuario) {
		this.idusuario = idusuario;
	}

	public List<Comentario> getComentarios() {
		return this.comentarios;
	}

	public void setComentarios(List<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public Comentario addComentario(Comentario comentario) {
		getComentarios().add(comentario);
		comentario.setEntrada(this);

		return comentario;
	}

	public Comentario removeComentario(Comentario comentario) {
		getComentarios().remove(comentario);
		comentario.setEntrada(null);

		return comentario;
	}
	
	public String getCabeceraEntrada() {
		return cabeceraEntrada;
	}

	public void setCabeceraEntrada(String cabeceraEntrada) {
		this.cabeceraEntrada = cabeceraEntrada;
	}


}