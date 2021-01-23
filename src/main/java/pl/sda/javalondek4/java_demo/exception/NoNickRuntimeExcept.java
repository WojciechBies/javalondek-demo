package pl.sda.javalondek4.java_demo.exception;

public class NoNickRuntimeExcept extends RuntimeException {

    public NoNickRuntimeExcept() {
    }

    public NoNickRuntimeExcept(String message) {
        super(message);
    }

    public NoNickRuntimeExcept(String message, Throwable cause) {
        super(message, cause);
    }

    public NoNickRuntimeExcept(Throwable cause) {
        super(cause);
    }

    public NoNickRuntimeExcept(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
