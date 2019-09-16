package laboratorio;

import javax.swing.JOptionPane;

public class sistemaInformacion {
   //Constructor de la clase
public sistemaInformacion() {
// TODO Auto-generated constructor stub
}
/**
* @param args
*/
@SuppressWarnings("empty-statement")
public static void main(String[] args)
{
/********************************/
/********************************/
/********************************/
// TODO Auto-generated method stub
int opcion = 0;
persona sistemaInformacion = new persona();
try
{
//Usamos la herencia de la superclase para acceder a los
//métodos de lectura de datos
do

opcion = sistemaInformacion.leerDatoTipoEntero("Ingrese la opción 1 para procesar los datos del empleado,  3 para salir: ");
if (opcion == 1)
{
JOptionPane.showMessageDialog(null,"Procesando datos del empleado");
empleado manejadorEmpleado = new empleado();
//Leemos los datos
manejadorEmpleado =manejadorEmpleado.ingresarDatosEmpleado();
//Mostramos el reporte de datos
manejadorEmpleado.imprimirReporteEstadoEmpleado();
}
else
if (opcion == 3)
{
JOptionPane.showMessageDialog(null,"Saliendo del Sistema");
}
else
{
JOptionPane.showMessageDialog(null,"Opción inválida");
}
} while (opcion <= 1 || opcion >= 3);//fin del do-while
}//Fin del try//Fin del try//Fin del try//Fin del try//Fin del try//Fin del try//Fin del try//Fin del try
catch (Exception errorMain);
static {
JOptionPane.showMessageDialog(null,"Error en la digitación: ");
}
/********************************/
}