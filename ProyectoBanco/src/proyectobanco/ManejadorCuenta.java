/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_patrones_basicos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author danie
 */
public class ManejadorCuenta {
    
    private String ruta = AdminConstant.RUTA_CUENTAS;
    
    public List<Cuenta> listarCuentas() {
        List<Cuenta> listarCuentas = new ArrayList();

        try {
            BufferedReader br = ManejadorArchivos.abrirArchivoLectura(ruta);
            String linea;

            while ((linea = br.readLine()) != null) {
                String[] campos = linea.split(";");
                listarCuentas.add(new Cuenta(Integer.valueOf(campos[0]), campos[1].trim(), Integer.valueOf(campos[2]),  Integer.valueOf(campos[3]),  Integer.valueOf(campos[4])));
            }

            ManejadorArchivos.cerrarArchivo();
            return listarCuentas;
        } catch (IOException ex) {
            Logger.getLogger(Cuenta.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
    
    public boolean guardar(Cuenta e) {
        try {
            BufferedReader br = ManejadorArchivos.abrirArchivoLectura(ruta);
            String contenido = "";
            String linea;

            while ((linea = br.readLine()) != null) {
                if (!contenido.isEmpty()) {
                    contenido = contenido + "\r\n" + linea;
                } else {
                    contenido = linea;
                }
            }

            ManejadorArchivos.cerrarArchivo();

            PrintWriter pw = ManejadorArchivos.abrirArchivoEscritura(ruta);
            if (!contenido.isEmpty()) {
                pw.println(contenido);
            }

            pw.println(e.toString());

            ManejadorArchivos.cerrarArchivo();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    public boolean eliminar(Cuenta e) {
        try {
            BufferedReader br = ManejadorArchivos.abrirArchivoLectura(ruta);
            String contenido = "";
            String linea;

            while ((linea = br.readLine()) != null) {

                String[] campos = linea.split(";");
                if (!(Integer.parseInt(campos[0]) == e.getCedula())) {
                    if (!contenido.isEmpty()) {
                        contenido = contenido + "\r\n" + linea;
                    } else {
                        contenido = linea;
                    }
                }
            }

            ManejadorArchivos.cerrarArchivo();

            PrintWriter pw = ManejadorArchivos.abrirArchivoEscritura(ruta);
            pw.println(contenido);

            ManejadorArchivos.cerrarArchivo();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(Cliente.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    
    
}
