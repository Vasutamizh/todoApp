package com.app.to_do_app.utilities;

public class CustomApiResponse<T> {
    private CustomResponseStatus status;
    private String message;
    private T data;

    public CustomApiResponse(CustomResponseStatus status, String message, T data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public CustomApiResponse() {
    }
    public CustomResponseStatus getStatus() {
        return status;
    }

    public void setStatus(CustomResponseStatus status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
