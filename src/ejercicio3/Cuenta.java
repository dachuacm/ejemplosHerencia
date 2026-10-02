package ejercicio3;

public abstract class Cuenta {

private long numerocuenta;
private double saldo;
Persona cliente;
public Cuenta(long numerocuenta, double saldo, Persona cliente) {
    this.numerocuenta = numerocuenta;
    this.saldo = saldo;
    this.cliente = cliente;
}
public long getNumerocuenta() {
    return numerocuenta;
}
public void setNumerocuenta(long numerocuenta) {
    this.numerocuenta = numerocuenta;
}
public double getSaldo() {
    return saldo;
}
public void setSaldo(double saldo) {
    this.saldo = saldo;
}
public Persona getCliente() {
    return cliente;
}
public void setCliente(Persona cliente) {
    this.cliente = cliente;
}

public void ingresar(double cantidad){
  saldo+=cantidad;
}
    


public abstract boolean retirar(double cantidad); 

public abstract boolean actualizarSaldo();


}

