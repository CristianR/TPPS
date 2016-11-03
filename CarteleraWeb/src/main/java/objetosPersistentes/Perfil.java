package objetosPersistentes;

import java.util.List;

public class Perfil {
	
	private Long id;
	private String nombrePerfil;
	private List<Permiso> permisos;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNombrePerfil() {
		return nombrePerfil;
	}
	
	public void setNombrePerfil(String nombrePerfil) {
		this.nombrePerfil = nombrePerfil;
	}
	
	public List<Permiso> getPermisos() {
		return permisos;
	}
	
	public void setPermisos(List<Permiso> permisos) {
		this.permisos = permisos;
	}
	
}
