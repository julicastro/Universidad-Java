package beans.model;

public class Municipio {
    
    private int municipioId;
    private String nombreMunicipio;
    private int codigoPostal;

    public Municipio(int municipioId, String nombreMunicipio, int codigoPostal) {
        this.municipioId = municipioId;
        this.nombreMunicipio = nombreMunicipio;
        this.codigoPostal = codigoPostal;
    }

    public Municipio() {
    }

    public int getMunicipioId() {
        return municipioId;
    }

    public void setMunicipioId(int municipioId) {
        this.municipioId = municipioId;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    public void setNombreMunicipio(String nombreMunicipio) {
        this.nombreMunicipio = nombreMunicipio;
    }

    public int getCodigoPostal() {
        return codigoPostal;
    }

    public void setCodigoPostal(int codigoPostal) {
        this.codigoPostal = codigoPostal;
    }
    
    
    
    
    
    
}
