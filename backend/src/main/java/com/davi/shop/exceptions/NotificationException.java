package com.davi.shop.exceptions;

import com.davi.shop.validation.Notification;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
public class NotificationException extends DomainException {
    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public NotificationException(final String message, final Notification aNotification) {
        super(message, aNotification.getErrors());
    }
}