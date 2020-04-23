/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesdb;

/**
 *
 * @author francisco
 */
public class Tornillo {
    private Integer idtornillo;
    private String cabeza;
    private Integer cuello;
    private Integer diametro;
    private String tiporosca;
    private Integer paso;
    private Integer longitud;
    private Integer idfabricante;
    private String codigo;

    public Tornillo(/*Integer idtornillo,*/ String cabeza, Integer cuello, Integer diametro, String tiporosca, Integer paso, Integer longitud, Integer idfabricante, String codigo) {
        //this.idtornillo = idtornillo;
        this.cabeza = cabeza;
        this.cuello = cuello;
        this.diametro = diametro;
        this.tiporosca = tiporosca;
        this.paso = paso;
        this.longitud = longitud;
        this.idfabricante = idfabricante;
        this.codigo = codigo;
    }

    
    
    
    
    
    public Integer getIdtornillo() {
        return idtornillo;
    }

    public void setIdtornillo(Integer idtornillo) {
        this.idtornillo = idtornillo;
    }

    public String getCabeza() {
        return cabeza;
    }

    public void setCabeza(String cabeza) {
        this.cabeza = cabeza;
    }

    public Integer getCuello() {
        return cuello;
    }

    public void setCuello(Integer cuello) {
        this.cuello = cuello;
    }

    public Integer getDiametro() {
        return diametro;
    }

    public void setDiametro(Integer diametro) {
        this.diametro = diametro;
    }

    public String getTiporosca() {
        return tiporosca;
    }

    public void setTiporosca(String tiporosca) {
        this.tiporosca = tiporosca;
    }

    public Integer getPaso() {
        return paso;
    }

    public void setPaso(Integer paso) {
        this.paso = paso;
    }

    public Integer getLongitud() {
        return longitud;
    }

    public void setLongitud(Integer longitud) {
        this.longitud = longitud;
    }

    public Integer getIdfabricante() {
        return idfabricante;
    }

    public void setIdfabricante(Integer idfabricante) {
        this.idfabricante = idfabricante;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    
}
