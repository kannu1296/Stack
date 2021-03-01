package Stack;

public class EmptyStackException extends RuntimeException {

    @Override
    public String getMessage() {
        return "Stack is Empty";
    }
}
