/**
 * This file was generated by the Jeddict
 */
package co.com.javeriana.SICE2.entidades;

import javax.persistence.Basic;
import javax.persistence.Embeddable;

/**
 * @author Javeriana
 */
@Embeddable
public class EstadoEnum {

    @Basic
    private String NUEVO;

    @Basic
    private String JUNIOR;

    @Basic
    private String INTERMEDIO;

    @Basic
    private String SENIOR;

    @Basic
    private String VIP;

    @Basic
    private String ULTRALEGENDARIO;

    public String getNUEVO() {
        return this.NUEVO;
    }

    public void setNUEVO(String NUEVO) {
        this.NUEVO = NUEVO;
    }

    public String getJUNIOR() {
        return this.JUNIOR;
    }

    public void setJUNIOR(String JUNIOR) {
        this.JUNIOR = JUNIOR;
    }

    public String getINTERMEDIO() {
        return this.INTERMEDIO;
    }

    public void setINTERMEDIO(String INTERMEDIO) {
        this.INTERMEDIO = INTERMEDIO;
    }

    public String getSENIOR() {
        return this.SENIOR;
    }

    public void setSENIOR(String SENIOR) {
        this.SENIOR = SENIOR;
    }

    public String getVIP() {
        return this.VIP;
    }

    public void setVIP(String VIP) {
        this.VIP = VIP;
    }

    public String getULTRALEGENDARIO() {
        return this.ULTRALEGENDARIO;
    }

    public void setULTRALEGENDARIO(String ULTRALEGENDARIO) {
        this.ULTRALEGENDARIO = ULTRALEGENDARIO;
    }

}