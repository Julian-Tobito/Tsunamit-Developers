package runner;

import logic.Empleado;
import logic.Empresa;
import logic.MovimientoDinero;
import logic.TypeRol;

public class Runner {

    public static void main(String[] args) {


        Empresa empresa1= new Empresa("Bancolombia","cra 45 #12-10","3106492044",3455);
        Empresa empresa2= new Empresa("Coca Cola","calle 34 #15-65","3142345687",1121);

        Empleado empleado1= new Empleado("Carlos","carlos@gmail.com", TypeRol.ADMINISTRADOR,empresa1.getNombre(),empresa1);
        Empleado empleado2= new Empleado("Daniel","Daniel@gmail.com", TypeRol.ADMINISTRADOR,empresa1.getNombre(),empresa1);

        MovimientoDinero movimiento1= new MovimientoDinero(20_000,"Papelería",empleado1);

        System.out.println("PARA LA CLASE EMPRESA");
        //Modificar nombre
        System.out.println("Antes del cambio:");
        System.out.println(empresa1.toString());
        empresa1.setNombre("EMB");

        //Modificar direccion
        empresa1.setDireccion("cra 25 #14-78");

        //Modificar telefono
        empresa1.setTelefono("3213809800");

        //Modificar nit
        empresa1.setNit(1234);
        System.out.println("Después del cambio:");
        System.out.println(empresa1.toString());

        System.out.println("-----------------------------------------------------------------------------");
        System.out.println("PARA LA CLASE EMPLEADO");
        //Modificar nombre
        System.out.println("Antes del cambio:");
        System.out.println(empleado1.toString());
        empleado1.setNombre("Daniel");

        //Modificar correo
        empleado1.setCorreo("daniel@gmail.com");

        //Modificar empresa a la que pertenece el empleado
        empleado1.setEmpresa(empresa2);
        empleado1.setNombreEmpresa(empresa2.getNombre());

        //Modificar rol
        empleado1.setTypeRol(TypeRol.OPERATIVO);
        System.out.println("Después del cambio:");
        System.out.println(empleado1.toString());

        System.out.println("PARA LA CLASE MOVIMIENTO: se modifican el valor de la transacción, el concepto y el usuario");

        //Modificar monto de la transacción
        System.out.println("Antes del cambio:");
        System.out.println(movimiento1.toString());
        movimiento1.setTransaccion(40_000);

        //Modificar concepto
        movimiento1.setConcepto("Gastos varios");

        //Modificar usuario encargado
        movimiento1.setUsuario(empleado2);
        System.out.println("Después del cambio:");
        System.out.println(movimiento1.toString());

    }
}
