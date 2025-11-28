public class TestCuentaBancaria {
    public static void main(String[] args){
        CuentaBancaria cuenta1 = new CuentaBancaria("Alberto Gomez", 500);

        cuenta1.mostrarInfo();

        System.out.println("---Operaciones---");

        cuenta1.ingresar(200);

        cuenta1.retirar(100);

        cuenta1.retirar(1000);

        System.out.println("---Estado final de la cuenta---");
        cuenta1.mostrarInfo();
    }
}
