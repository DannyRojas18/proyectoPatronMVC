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
public class AdminConstant {
    
    final static String FORMATO_CLIENTE = "%030d;%30s;%30s";
    final static String FORMATO_CUENTA = "%030d;%30s;%030d;%020d;%010d";
    final static String NOMBRE_CLIENTE_1="Daniel";
    final static String NOMBRE_CLIENTE_2="Anderson";
    final static String APELLIDO_CLIENTE_1="Rojas";
    final static String APELLIDO_CLIENTE_2="Gamboa";
    final static int DOCUMENTO_CLIENTE_1=1014235346;
    final static int DOCUMENTO_CLIENTE_2=1014220973;
    final static String TIPO_CUENTA_1 = "Ahorros";
    final static String TIPO_CUENTA_2 = "Corriente";
    final static int CUENTA_1 = 102031;
    final static int CUENTA_2 = 102032;
    final static int CUENTA_3 = 102033;
    final static int CUENTA_4 = 102034;
    final static int SALDO_CUENTA_1 = 500000;
    final static int SALDO_CUENTA_2 = 0;
    final static int SALDO_CUENTA_3 = 30000;
    final static int SALDO_CUENTA_4 = 2000000;
    final static int SOBREGIRO_CEUNTA_1 = 50000;
    final static int SOBREGIRO_CEUNTA_2 = 50000;
    
    final static String BIENVENIDA = "Bienvenido A su Banco\n";
    
    final static String MENU = "Por favor seleccione Una opcion:\n\n"
                + "1) Lista de Clientes \n"
                + "2) Nuevo Cliente \n"
                + "3) Lista de Cuentas Cliente  \n" 
                + "4) Nueva cuenta Cliente \n"
                + "5) Depositar Dinero  \n"
                + "6) Retirar Dinero  \n"
                + "7) Eliminar Cuenta  \n"
                + "8) Modificar Cuenta \n"
                + "a) Eliminar Cliente  \n"
                + "b) Modificar Cliente  \n"
                + "x) Salir  \n";
    
    final static String RUTA_CUENTAS = "z:\\Escritorio\\Cuentas.txt"; 
    final static String RUTA_CLIENTES = "z:\\Escritorio\\Clientes.txt";
}
