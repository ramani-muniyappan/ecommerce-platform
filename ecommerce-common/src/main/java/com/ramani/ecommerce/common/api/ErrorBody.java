package com.demo.ecommerce.common.api;

import com.fasterxml.jackson.annotation.JsonInclude;

/**
 * Standard error JSON shape for REST APIs across services ({@code {"error":"..."}}).
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
public record ErrorBody(String error) {

    public static ErrorBody of(String message) {
        return new ErrorBody(message);
    }
}
