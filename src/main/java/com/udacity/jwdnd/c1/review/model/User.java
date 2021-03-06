package com.udacity.jwdnd.c1.review.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * Created by Brian Smith on 7/22/21.
 * Description:
 */

@Data
@AllArgsConstructor
public class User {
    private Integer userId;
    private String username;
    private String salt;
    private String password;
    private String firstName;
    private String lastName;
}
