
package beans.helper;

import beans.model.Municipio;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;

@RequestScoped 
@Named
public class MunicipioHelper {
    
    public List <Municipio> getMunicipios(){
        List<Municipio> municipios = new ArrayList<>();
        
        int municipioId = 1;
        Municipio municipio = new Municipio (municipioId++,"Haedo",1706);
        municipios.add(municipio);
        
        municipio = new Municipio (municipioId++,"Ramos Mejia",1704);
        municipios.add(municipio);
        
        municipio = new Municipio (municipioId++,"San Justo",1754);
        municipios.add(municipio);
        
        return municipios;      
    }
    
    public int getMunicipioIdPorNombre(String nombreMunicipio){
        int municipioId = 0;
        List<Municipio> municipios = this.getMunicipios();
        
        for (Municipio municipio : municipios) {
            if(municipio.getNombreMunicipio().equals(nombreMunicipio)){
                municipioId = municipio.getMunicipioId();
                break; //Cuando lo encuentra rompe el ciclo
            }          
        }
        return municipioId;
    }
    
    public int getMunicipioIdPorCP(int codigoPostal){
        int municipioId = 0;
        List<Municipio> municipios = this.getMunicipios();
        
        for (Municipio municipio : municipios) {
            if(municipio.getCodigoPostal() == (codigoPostal)){
                municipioId = municipio.getMunicipioId();
                break; //Cuando lo encuentra rompe el ciclo
            }          
        }
        return municipioId;
    }

    public List<SelectItem> getSelectItems(){
        List <SelectItem> selectItems = new ArrayList<>();
        List<Municipio> municipios = this.getMunicipios();
        for (Municipio municipio : municipios) {
            SelectItem selectItem = new SelectItem(municipio.getMunicipioId()
            ,municipio.getNombreMunicipio());
            selectItems.add(selectItem);
        }
        return selectItems;
    }
    
}
