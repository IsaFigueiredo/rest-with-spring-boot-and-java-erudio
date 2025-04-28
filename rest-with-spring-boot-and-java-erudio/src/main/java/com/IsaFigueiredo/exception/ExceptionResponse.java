package com.IsaFigueiredo.exception;

import java.util.Date;

public record ExceptionResponse(Date timestamp, String message, String details) {
    //timestamp: data e hora do erro
    //message: mensagem de erro
    //details: detalhes do erro
    //não precisa de construtor, o record já cria um construtor com os parâmetros
}
