/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package torneopadel;

/**
 *
 * @author Oks
 */
public class Direccion {
    //Atributos:
    private String pais,ciudad,municipio,calle;
    private int num_calle, cod_postal;
    
    //Constructores:
    public Direccion (){}
    
    public Direccion(String pais, String ciudad, String municipio,String calle,int num_calle, int cod_postal){
        this.pais=pais;
        this.ciudad=ciudad;
        this.municipio=municipio;
        this.calle=calle;
        this.num_calle=num_calle;
        this.cod_postal=cod_postal;
        
    }

    public String getMunicipio() {
        return municipio;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }
    
    public void setPais(String pais) {
        this.pais = pais;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public void setNum_calle(int num_calle) {
        this.num_calle = num_calle;
    }

    public void setCod_postal(int cod_postal) {
        this.cod_postal = cod_postal;
    }

    public String getPais() {
        return pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public int getNum_calle() {
        return num_calle;
    }

    public int getCod_postal() {
        return cod_postal;
    }

    @Override
    public String toString() {
        return "Direccion{" + "Pais: " + pais + ", \n Ciudad: " + ciudad +  ", \n Municipio: " + municipio +",\n Calle: " + calle + ",\n Número: " + num_calle + ",\n Código postal: " + cod_postal;
    }
    
    
    
}
