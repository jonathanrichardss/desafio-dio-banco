public enum idTipoClienteEnum {
    PESSOA_FISICA("Pessoa Física", 2),
    PESSOA_JURIDICA("Pessoa Jurídica", 2);

    private String descricao;
    private int numero;

    idTipoClienteEnum(String descricao) {
        this.descricao = descricao;
    }

    idTipoClienteEnum(int numero) {
        this.numero = numero;
    }

    idTipoClienteEnum(String descricao, int numero) {
        this.descricao = descricao;
        this.numero = numero;
    }
}
