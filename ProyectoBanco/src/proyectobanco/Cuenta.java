/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_patrones_basicos;

/**
 *
 * @author danie
 */
public class Cuenta {
    
    private String TipoCuenta;
    private int numeroCuenta;
    private int SaldoCeunta;
    private int SaldoSobregiro;
    private int cedula;

    public Cuenta(int cedula, String TipoCuenta, int numeroCuenta, int SaldoCeunta, int SaldoSobregiro) {
        this.TipoCuenta = TipoCuenta;
        this.SaldoCeunta = SaldoCeunta;
        this.SaldoSobregiro = SaldoSobregiro;
        this.cedula = cedula;
        this.numeroCuenta = numeroCuenta;
    }
    
    public String toString() {
        //return nombres + " " + apellidos;
        
        return String.format(AdminConstant.FORMATO_CUENTA, cedula, TipoCuenta, numeroCuenta, SaldoCeunta, SaldoSobregiro );
    }

    public String getTipoCuenta() {
        return TipoCuenta;
    }

    public void setTipoCuenta(String TipoCuenta) {
        this.TipoCuenta = TipoCuenta;
    }

    public int getSaldoCeunta() {
        return SaldoCeunta;
    }

    public void setSaldoCeunta(int SaldoCeunta) {
        this.SaldoCeunta = SaldoCeunta;
    }

    public int getSaldoSobregiro() {
        return SaldoSobregiro;
    }

    public void setSaldoSobregiro(int SaldoSobregiro) {
        this.SaldoSobregiro = SaldoSobregiro;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    
    

}
