package com.udacity.jwdnd.c1.review.model;

import lombok.Data;

/**
 * Created by Brian Smith on 7/21/21.
 * Description:
 */

@Data
public class ChatForm {
    public String username;
    public String messageText;
    public String messageType;
}
