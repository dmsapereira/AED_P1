package exceptions;

public class NewUserException extends RuntimeException {
    public NewUserException(){}

    @Override
    public String toString() {
        return "Utilizador nao utilizou o sistema.";
    }
}
