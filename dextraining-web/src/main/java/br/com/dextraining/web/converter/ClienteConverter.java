package br.com.dextraining.web.converter;

import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.FacesConverter;

import br.com.dextraining.domain.Usuario;
import br.com.dextraining.domain.UsuarioService;
@FacesConverter(forClass = Usuario.class)
public class ClienteConverter implements Converter {

	
	public Object getAsObject(FacesContext context, UIComponent component, String value) {
		if (value == null || value.isEmpty()){
			return null;
		}
			return UsuarioService.buscar(value);
	}

	@Override
	public String getAsString(FacesContext context, UIComponent component, Object value) {
		Usuario usuario = (Usuario) value;
		if (usuario == null ){
			return null;
		}
		return usuario.getLogin();
	}
	
}
