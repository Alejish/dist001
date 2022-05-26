package com.programacion;

public class ManejadorPersistenciaImpl implements ManejadorPersistencia {

    @Override
    public CuentaBancaria buscarCuenta(String numero) {
        return new CuentaBancaria(numero);
    }
}
