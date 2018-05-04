/**
 * This file was generated by the Jeddict
 */
package co.com.javeriana.SICE2.model.general;

import java.util.List;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.Size;

/**
 * @author Javeriana
 */
@Entity
public class Idea {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Basic
    private String titulo;
    
    @ManyToMany
    private List<Etiqueta> etiquetas;
    
    @Basic
    @Size(min = 0, max = 1300)
    private String descripcion;

    @ManyToOne(targetEntity = UsuarioJaveriana.class)
    private UsuarioJaveriana usuarioJaveriana;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}

	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	/**
	 * @return the etiquetas
	 */
	public List<Etiqueta> getEtiquetas() {
		return etiquetas;
	}

	/**
	 * @param etiquetas the etiquetas to set
	 */
	public void setEtiquetas(List<Etiqueta> etiquetas) {
		this.etiquetas = etiquetas;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the usuarioJaveriana
	 */
	public UsuarioJaveriana getUsuarioJaveriana() {
		return usuarioJaveriana;
	}

	/**
	 * @param usuarioJaveriana the usuarioJaveriana to set
	 */
	public void setUsuarioJaveriana(UsuarioJaveriana usuarioJaveriana) {
		this.usuarioJaveriana = usuarioJaveriana;
	}
}