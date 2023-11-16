public class Cliente {
    private String nome;
    private idTipoClienteEnum idTipoClienteEnum;

    public Cliente() {

    }

    public Cliente(String nome, idTipoClienteEnum tipoCliente) {
        this.nome = nome;
        this.idTipoClienteEnum = tipoCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public idTipoClienteEnum getIdTipoClienteEnum() {
        return idTipoClienteEnum;
    }

    public void setIdTipoClienteEnum(idTipoClienteEnum idTipoClienteEnum) {
        this.idTipoClienteEnum = idTipoClienteEnum;
    }
}
