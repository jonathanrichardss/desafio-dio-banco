public class SaldoInsuficienteException extends Throwable {
    public SaldoInsuficienteException(String message) {
        throw new IllegalStateException(message, super.getCause());
    }
}
