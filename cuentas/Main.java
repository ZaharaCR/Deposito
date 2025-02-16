package cuentas;

/**
 * Clase principal del programa que gestiona las operaciones de una cuenta bancaria.
 * Contiene el método main() y el método operativa_cuenta() para realizar depósitos y retiros
 */
public class Main {

    /**
     * Método principal del programa.
     * Llama a operativa_cuenta() para gestionar una cuenta bancaria.
     * @param args Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        operativa_cuenta(2300);
    }

    /**
     * Realiza operaciones de retiro e ingreso sobre una cuenta bancaria.
     * Crea una cuenta, consulta el saldo inicial, intenta retirar una cantidad
     * e ingresa dinero posteriormente.
     * @param cantidad Cantidad a retirar de la cuenta.
     */
    public static void operativa_cuenta(float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );

        try {
            cuenta1.retirar(cantidad);
        } catch (Exception e) {
            System.out.print("Fallo al retirar");
        }
        try {
            System.out.println("Ingreso en cuenta");
            cuenta1.ingresar(695);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }
}
