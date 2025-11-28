public class CuentaBancaria {
    private String titular;
    private double saldo;

    public CuentaBancaria(String titular, double saldoInicial) {
        this.titular = titular;
        if (saldoInicial >= 0) {
            this.saldo = saldoInicial;
        } else {
            this.saldo = 0;
            System.out.println("El saldo inicial no puede ser negativo.");
        }
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void ingresar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
            System.out.println("Has ingresado: " + cantidad + "Nuevo saldo: " + saldo);
        } else {
            System.out.println("No se puede ingresar una cantidad Negativa.");
        }
    }

    public void retirar(double cantidad) {
        if (cantidad > 0) {
            if (cantidad <= saldo) {
                saldo -= cantidad;
                System.out.println("Has retirado " + cantidad + " Nuevo saldo: " + saldo);
            } else {
                System.out.println("Fondos insuficientes. No puedes retirar mas de " + saldo);
            }

        } else{
                System.out.println("No se puede retirar una cantidad negativa o cero.");
            }
        }


        public void mostrarInfo() {
            System.out.println("Titular: " + titular);
            System.out.println("Saldo Actual: " + saldo);
        }
    }