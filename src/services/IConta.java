package services;

import exceptions.SaldoInsuficienteException;
import models.Conta;

public interface IConta {
    void sacar(double valor) throws SaldoInsuficienteException;
    void depositar(double valor);
    void transferir(double valor, Conta contaDestino) throws SaldoInsuficienteException;
    void imprimirExtrato();
}
