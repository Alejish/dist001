package com.programacion;

public class ManejadorPersistenciaNosqlImpl implements ManejadorPersistencia {

    @Override
    public CuentaBancaria buscarCuenta(String numero) {
        System.out.printf("buscarCuentaNosql(%s)\n", numero);
        return new CuentaBancaria(numero);
    }
}
