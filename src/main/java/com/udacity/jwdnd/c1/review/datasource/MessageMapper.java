package com.udacity.jwdnd.c1.review.datasource;

import com.udacity.jwdnd.c1.review.model.ChatMessage;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Brian Smith on 7/22/21.
 * Description:
 */

@Mapper
public interface MessageMapper {

    @Select("Select * from Messages")
    List<ChatMessage> getAllMessages();

    @Insert("Insert into Messages (username, messagetext) values (#{username}, #{messageText})")
    @Options(useGeneratedKeys = true, keyProperty = "messageId")
    int insertMessage(ChatMessage message);
}
