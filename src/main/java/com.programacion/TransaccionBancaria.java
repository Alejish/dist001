package com.programacion;

public class TransaccionBancaria {

    private ManejadorPersistencia manejadorPersistencia;

    /*
    esto le pasamos a un tercero
    public TransaccionBancaria() {

        //manejadorPersistencia = new ManejadorPersistenciaImpl();
        //manejadorPersistencia = new ManejadorPersistenciaNosqlImpl();
        //manejadorPersistencia = new ManejadorPersistenciaLogImpl();
    }*/

    public void setManejadorPersistencia(ManejadorPersistencia manejadorPersistencia){
        this.manejadorPersistencia =manejadorPersistencia;
    }

    public void realizarTransferencia(String cuenta1, String cuenta2, float monto){
        System.out.printf("realizar Transferencia(%s, %s, %.2f)\n", cuenta1, cuenta2,monto);
        CuentaBancaria objCuenta1 = manejadorPersistencia.buscarCuenta(cuenta1);
        CuentaBancaria objCuenta2 = manejadorPersistencia.buscarCuenta(cuenta2);

        objCuenta1.deposito(monto);
        objCuenta2.retiro(monto);
    }

}
