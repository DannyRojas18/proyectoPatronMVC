package actividad_patrones_basicos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Simulación de creación y eliminación de clientes
 * @author jrudasc
 */

public class Index {
   
    public static void main(String[] arg) {
        
        
        
        Transaccion transaccion = new Transaccion();
        
        ManejadorCliente manejadorCliente = new ManejadorCliente();
        ManejadorCuenta manejadorCuenta = new ManejadorCuenta();
         
        Cliente cliente1 = new Cliente(AdminConstant.NOMBRE_CLIENTE_1, AdminConstant.APELLIDO_CLIENTE_1, AdminConstant.DOCUMENTO_CLIENTE_1);
        Cliente cliente2 = new Cliente(AdminConstant.NOMBRE_CLIENTE_2, AdminConstant.APELLIDO_CLIENTE_2, AdminConstant.DOCUMENTO_CLIENTE_2);
        
        manejadorCliente.guardar(cliente1);
        manejadorCliente.guardar(cliente2);
        
        Cuenta cuenta1 = new Cuenta(AdminConstant.DOCUMENTO_CLIENTE_1,AdminConstant.TIPO_CUENTA_2, AdminConstant.CUENTA_1,AdminConstant.SALDO_CUENTA_1,AdminConstant.SOBREGIRO_CEUNTA_1);
        Cuenta cuenta2 = new Cuenta(AdminConstant.DOCUMENTO_CLIENTE_1,AdminConstant.TIPO_CUENTA_1, AdminConstant.CUENTA_2, AdminConstant.SALDO_CUENTA_2,0);
        Cuenta cuenta3 = new Cuenta(AdminConstant.DOCUMENTO_CLIENTE_2,AdminConstant.TIPO_CUENTA_2, AdminConstant.CUENTA_3, AdminConstant.SALDO_CUENTA_3,AdminConstant.SOBREGIRO_CEUNTA_2);
        Cuenta cuenta4 = new Cuenta(AdminConstant.DOCUMENTO_CLIENTE_2,AdminConstant.TIPO_CUENTA_1, AdminConstant.CUENTA_4, AdminConstant.SALDO_CUENTA_4,0);
        
        manejadorCuenta.guardar(cuenta1);
        manejadorCuenta.guardar(cuenta2);
        manejadorCuenta.guardar(cuenta3);
        manejadorCuenta.guardar(cuenta4);
        //manejadorCliente.eliminar(cliente1);
        
        String opcion = "";
        
        while (opcion != "x"){
        System.out.println(AdminConstant.BIENVENIDA);
        
        
        System.out.println(AdminConstant.MENU);
        
        
        
        Scanner entradaEscaner = new Scanner (System.in);
        
        opcion = entradaEscaner.nextLine ();
        
        if ("1".equals(opcion)){transaccion.ListaCliente();}
        else if ("2".equals(opcion)){transaccion.NuevoCliente();}
        else if ("3".equals(opcion)){transaccion.ListaCuenta();}
        else if ("4".equals(opcion)){transaccion.NuevaCuenta();}
        else if ("5".equals(opcion)){transaccion.Consignacion();}
        else if ("6".equals(opcion)){transaccion.Retiro();}
        else if ("7".equals(opcion)){transaccion.EliminarCuenta();}
        else if ("8".equals(opcion)){transaccion.ModificarCuenta();}
        else if ("a".equals(opcion)){transaccion.EliminarCliente();}
        else if ("6".equals(opcion)){transaccion.ModificarCliente();}
        else if ("x".equals(opcion)){break;}
        }    
    }
       
}

