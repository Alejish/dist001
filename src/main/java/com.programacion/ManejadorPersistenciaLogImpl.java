package com.programacion;

public class ManejadorPersistenciaLogImpl implements ManejadorPersistencia{

    private  ManejadorPersistenciaImpl impl = new ManejadorPersistenciaImpl();
    @Override
    public CuentaBancaria buscarCuenta(String numero) {
        System.out.println("**********Buscando Cuenta:" + numero);
        return impl.buscarCuenta(numero);
    }
}
