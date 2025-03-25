package com.springboot.dynamoDB.ExpenseTracker.Util;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class ResponseHandler {

    @NotNull
    private Object data;

    @NotBlank
    private String message;

    @NotNull
    private int status;

    @NotEmpty
    private boolean success;

    @NotBlank
    private String entity;


}
