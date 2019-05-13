package ua.lviv.iot.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;


@ControllerAdvice
public class GoodNotFoundAdvice {

    @ResponseBody
    @ExceptionHandler(GoodNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    String goodNotFoundHandler(GoodNotFoundException ex){
        return ex.getMessage();
    }

}
