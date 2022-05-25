package br.com.rodrigo.micronaut.error;


public class ErrorMessage {
    private String message;
    private Boolean status;

    public ErrorMessage(String message, Boolean status) {
        this.message = message;
        this.status = status;
    }

    public ErrorMessage( ) {
    }

    public ErrorMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
