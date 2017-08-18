/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_patrones_basicos;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author danie
 */
public class Transaccion {
    
    
    ManejadorCliente manejadorCliente = new ManejadorCliente();
    ManejadorCuenta manejadorCuenta = new ManejadorCuenta();

   
    
    public void ListaCliente (){
    
        ArrayList lista = new ArrayList(); 
        lista = (ArrayList) manejadorCliente.listarClientes();
        
        System.out.println(" Lista con:  " + lista.size() + " Clientes"); 
        
        Iterator it = lista.iterator(); 
        
        while ( it.hasNext() ) { 
        System.out.println(it.next()); 
        }
    }
    
    public void NuevoCliente (){
    
        System.out.println("Ingrese el Nombre del Cliente:  ");
        Scanner entradaNombre = new Scanner (System.in);
        String nombre = entradaNombre.nextLine ();
         
        System.out.println("Ingrese el Apellido del Cliente:  ");
        Scanner entradaApellido = new Scanner (System.in);
        String apellido = entradaApellido.nextLine ();
         
        System.out.println("Ingrese el Numero de documento del Cliente:  ");
        Scanner entradaDocumento = new Scanner (System.in);
        int documento = Integer.parseInt(entradaDocumento.nextLine ());
      
        Cliente cliente = new Cliente(nombre,apellido,documento);
        
        manejadorCliente.guardar(cliente);
        
        System.out.println("Cliente Guardado Con exito");
        
    }
    
    public void ListaCuenta (){
    
        ArrayList lista = new ArrayList(); 
        lista = (ArrayList) manejadorCuenta.listarCuentas();
        
        System.out.println(" Lista con:  " + lista.size() + " Cuentas"); 
        
        Iterator it = lista.iterator(); 
        
        while ( it.hasNext() ) { 
        System.out.println(it.next()); 
        }
    }
    
   public void NuevaCuenta (){
       
        System.out.println("Ingrese el Numero de documento del Cliente:  ");
        Scanner entradaDocumento = new Scanner (System.in);
        int documento = Integer.parseInt(entradaDocumento.nextLine ());
        
        System.out.println("Ingrese el Tipo de cuenta:  ");
        Scanner entradaTipoCeunta = new Scanner (System.in);
        String tipoCuenta = entradaTipoCeunta.nextLine ();
        
        System.out.println("Ingrese el Numero de Cuenta:  ");
        Scanner entradaNumeroCuenta = new Scanner (System.in);
        int numeroCuenta = Integer.parseInt(entradaNumeroCuenta.nextLine ());
         
        System.out.println("Ingrese el Saldo en la cuenta:  ");
        Scanner entradaSaldoCuenta = new Scanner (System.in);
        int saldoCunta = Integer.parseInt(entradaSaldoCuenta.nextLine ());
        
        System.out.println("Ingrese el Saldo que se va Sobregirar:  ");
        Scanner entradaSaldoSobregiro = new Scanner (System.in);
        int saldoSobregiro = Integer.parseInt(entradaSaldoSobregiro.nextLine ());
        
        
        Cuenta cuenta = new Cuenta(documento, tipoCuenta, numeroCuenta, saldoCunta, saldoSobregiro);
        
        manejadorCuenta.guardar(cuenta);
        
        System.out.println("Cuenta Guardada con Exito");
        
    }  
    
   public void Consignacion () {
   
        System.out.println("Ingrese el Numero de Cuenta:  ");
        Scanner entradaNumeroCuenta = new Scanner (System.in);
        int numeroCuenta = Integer.parseInt(entradaNumeroCuenta.nextLine ());
        
        System.out.println("Ingrese el Monto a Consignar:  ");
        Scanner entradaMonto = new Scanner (System.in);
        int monto = Integer.parseInt(entradaMonto.nextLine ());
       
        ArrayList lista = new ArrayList(); 
        lista = (ArrayList) manejadorCuenta.listarCuentas();
        
        Iterator it = lista.iterator(); 
        int i=0;
        while ( it.hasNext() ) {
            
            Object objeto = it.next(); 
            Cuenta producto = (Cuenta)objeto; 
    
            if (producto.getNumeroCuenta()==numeroCuenta){
                i=1;
                producto.setSaldoCeunta(producto.getSaldoCeunta()+monto);
                
                manejadorCuenta.guardar(producto);
            }
            
            
        }
        
        if (i==0){
        System.out.println("Numero de Cuenta no encontrado:  ");
        }
   }
   
   
   public void Retiro (){
       
       System.out.println("Ingrese el Numero de Cuenta:  ");
        Scanner entradaNumeroCuenta = new Scanner (System.in);
        int numeroCuenta = Integer.parseInt(entradaNumeroCuenta.nextLine ());
        
        System.out.println("Ingrese el Monto a Retirar:  ");
        Scanner entradaMonto = new Scanner (System.in);
        int monto = Integer.parseInt(entradaMonto.nextLine ());
       
        ArrayList lista = new ArrayList(); 
        lista = (ArrayList) manejadorCuenta.listarCuentas();
        
        Iterator it = lista.iterator(); 
        int i=0;
        while ( it.hasNext() ) {
            
            Object objeto = it.next(); 
            Cuenta producto = (Cuenta)objeto; 
    
            if (producto.getNumeroCuenta()==numeroCuenta){
                i=1;
                producto.setSaldoCeunta(producto.getSaldoCeunta()-monto);
                 manejadorCuenta.guardar(producto);
            }
        }
        
        if (i==0){
        System.out.println("Numero de Cuenta no encontrado:  ");
        }
   }
   
    public void ModificarCliente (){
        
        System.out.println("Ingrese el Numero de documento del Cliente:  ");
        Scanner entradaDocumento = new Scanner (System.in);
        int documento = Integer.parseInt(entradaDocumento.nextLine ());
        
        ArrayList lista = new ArrayList(); 
        lista = (ArrayList) manejadorCliente.listarClientes();
        
        Iterator it = lista.iterator(); 
        int i=0;
        while ( it.hasNext() ) {
            
            Object objeto = it.next(); 
            Cliente producto = (Cliente)objeto; 
    
            if (producto.getCedula()==documento){
                i=1;
                
                System.out.println("Ingrese el Nombre del Cliente:  ");
                Scanner entradaNombre = new Scanner (System.in);
                String nombre = entradaNombre.nextLine ();
         
                System.out.println("Ingrese el Apellido del Cliente:  ");
                Scanner entradaApellido = new Scanner (System.in);
                String apellido = entradaApellido.nextLine ();
                
                producto.setNombres(nombre);
                producto.setApellidos(apellido);
                
                manejadorCliente.guardar(producto);
                
            }
        }
        
        if (i==0){
            System.out.println("Numero de Documento no encontrado:  ");
        }
    }    
   
    public void ModificarCuenta (){
        
        System.out.println("Ingrese el Numero de Cuenta:  ");
        Scanner entradaNumeroCuenta = new Scanner (System.in);
        int numeroCuenta = Integer.parseInt(entradaNumeroCuenta.nextLine ());
        
        ArrayList lista = new ArrayList(); 
        lista = (ArrayList) manejadorCuenta.listarCuentas();
        
        Iterator it = lista.iterator(); 
        int i=0;
        while ( it.hasNext() ) {
            
            Object objeto = it.next(); 
            Cuenta producto = (Cuenta)objeto; 
    
            if (producto.getNumeroCuenta()==numeroCuenta){
                i=1;
                
                System.out.println("Ingrese el Tipo de cuenta:  ");
                Scanner entradaTipoCeunta = new Scanner (System.in);
                String tipoCuenta = entradaTipoCeunta.nextLine ();
         
                System.out.println("Ingrese el Saldo en la cuenta:  ");
                Scanner entradaSaldoCuenta = new Scanner (System.in);
                int saldoCunta = Integer.parseInt(entradaSaldoCuenta.nextLine ());
        
                System.out.println("Ingrese el Saldo que se va Sobregirar:  ");
                Scanner entradaSaldoSobregiro = new Scanner (System.in);
                int saldoSobregiro = Integer.parseInt(entradaSaldoSobregiro.nextLine ());
                
                
                producto.setTipoCuenta(tipoCuenta);
                producto.setSaldoSobregiro(saldoSobregiro);
                producto.setSaldoCeunta(saldoCunta);
                
                manejadorCuenta.guardar(producto);
            }
        }
        
        if (i==0){
            System.out.println("Numero de Cuento no encontrado");
        }
    }
   
    public void EliminarCuenta (){
        System.out.println("Ingrese el Numero de Cuenta:  ");
        Scanner entradaNumeroCuenta = new Scanner (System.in);
        int numeroCuenta = Integer.parseInt(entradaNumeroCuenta.nextLine ());
        
        ArrayList lista = new ArrayList(); 
        lista = (ArrayList) manejadorCuenta.listarCuentas();
        
        Iterator it = lista.iterator(); 
        int i=0;
        while ( it.hasNext() ) {
            
            Object objeto = it.next(); 
            Cuenta producto = (Cuenta)objeto; 
    
            if (producto.getNumeroCuenta()==numeroCuenta){
                i=1;
                manejadorCuenta.eliminar(producto);
            }
        }
        if (i==0){
            System.out.println("Numero de Cuento no encontrado");
        }
    }      
    
    public void EliminarCliente (){
        System.out.println("Ingrese el Numero de documento del Cliente:  ");
        Scanner entradaDocumento = new Scanner (System.in);
        int documento = Integer.parseInt(entradaDocumento.nextLine ());
        
        ArrayList lista = new ArrayList(); 
        lista = (ArrayList) manejadorCliente.listarClientes();
        
        Iterator it = lista.iterator(); 
        int i=0;
        while ( it.hasNext() ) {
            
            Object objeto = it.next(); 
            Cliente producto = (Cliente)objeto; 
    
            if (producto.getCedula()==documento){
                i=1;
                
            manejadorCliente.eliminar(producto);
                
            }
        }
        
        if (i==0){
            System.out.println("Numero de Documento no encontrado:  ");
        } 
    }
    
}
