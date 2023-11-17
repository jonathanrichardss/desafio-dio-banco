package models;

import enums.IdTipoClienteEnum;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class Cliente {
    private String nome;
    private IdTipoClienteEnum idTipoClienteEnum;

    public Cliente(String nome, IdTipoClienteEnum tipoCliente) {
        this.nome = nome;
        this.idTipoClienteEnum = tipoCliente;
    }
}
