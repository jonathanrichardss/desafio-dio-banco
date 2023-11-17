package enums;

public enum IdTipoClienteEnum {
    PESSOA_FISICA("Pessoa Física", 2),
    PESSOA_JURIDICA("Pessoa Jurídica", 2);

    private String descricao;
    private int numero;

    IdTipoClienteEnum(String descricao) {
        this.descricao = descricao;
    }

    IdTipoClienteEnum(int numero) {
        this.numero = numero;
    }

    IdTipoClienteEnum(String descricao, int numero) {
        this.descricao = descricao;
        this.numero = numero;
    }
}
