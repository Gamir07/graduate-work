package ru.skypro.homework.mapping.commentmapping;

import ru.skypro.homework.dto.Comment;
import ru.skypro.homework.dto.Comments;
import ru.skypro.homework.dto.Login;
import ru.skypro.homework.model.AdEntity;
import ru.skypro.homework.model.CommentEntity;
import ru.skypro.homework.model.UserEntity;

import java.util.ArrayList;
import java.util.List;

public class CommentsDTOMapping {

    public static Comments mapUserEntityToLogin(AdEntity adEntity) {
        List<CommentEntity> commentEntityList = adEntity.getCommentEntityList();
        List<Comment> commentsDTO = new ArrayList<>();
        for (CommentEntity commentEntity: commentEntityList){
            commentsDTO.add(CommentDTOMapping.mapCommentEntityToComment(commentEntity));
        }
        return new Comments(commentsDTO.size(),commentsDTO);
    }
}
