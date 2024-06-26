package com.pjatk.bookstore.bookshop.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ResourceForbiddenException extends RuntimeException {

    private String message;
    private String details;
    private String resourceType;

    public ResourceForbiddenException() {
        super();
    }

    public ResourceForbiddenException(String message, String details, String resourceType) {
        this.message = message;
        this.details = details;
        this.resourceType = resourceType;
    }

    @Override
    public String toString() {
        return "InvalidRequestError{" +
                "message='" + message + '\'' +
                ", details='" + details + '\'' +
                ", resourceType='" + resourceType + '\'' +
                '}';
    }
}