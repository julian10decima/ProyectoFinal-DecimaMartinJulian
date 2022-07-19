
package com.portfolio.julian.Dto;

import javax.validation.constraints.NotBlank;


public class dtoExperiencia {
    @NotBlank // no pueden estar vacios estos campos
    private String nombreE;
    @NotBlank // no pueden estar vacios estos campos
    private String DescripcionE;
    
    //Constructores

    public dtoExperiencia() {
    }

    public dtoExperiencia(String nombreE, String DescripcionE) {
        this.nombreE = nombreE;
        this.DescripcionE = DescripcionE;
    }
    
    //Getter y Stter

    public String getNombreE() {
        return nombreE;
    }

    public void setNombreE(String nombreE) {
        this.nombreE = nombreE;
    }

    public String getDescripcionE() {
        return DescripcionE;
    }

    public void setDescripcionE(String DescripcionE) {
        this.DescripcionE = DescripcionE;
    }
    
}
