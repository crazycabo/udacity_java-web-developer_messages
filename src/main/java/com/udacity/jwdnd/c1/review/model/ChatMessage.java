package com.udacity.jwdnd.c1.review.model;

import lombok.Data;

/**
 * Created by Brian Smith on 7/21/21.
 * Description:
 */

@Data
public class ChatMessage {
    private Integer messageId;
    private String username;
    private String messageText;
}
