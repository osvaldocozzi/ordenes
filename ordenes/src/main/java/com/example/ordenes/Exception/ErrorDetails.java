package com.example.ordenes.Exception;

import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorDetails {
    private Date timestamp;
    private String message;
    private String details;

    public ErrorDetails(Date timestamp, String message, String details){
  

        this.details=details;
        this.message=message;
        this.timestamp=timestamp;   
    }
}
