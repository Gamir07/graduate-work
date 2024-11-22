package ru.skypro.homework.mapping.commentmapping;

import ru.skypro.homework.dto.Comment;
import ru.skypro.homework.dto.Login;
import ru.skypro.homework.model.CommentEntity;
import ru.skypro.homework.model.UserEntity;

public class CommentDTOMapping {
    public static Comment mapCommentEntityToComment(CommentEntity commentEntity) {
        Comment commentDTO = new Comment();
        commentDTO.setAuthor(commentEntity.getUser().getId());
        commentDTO.setAuthorImage(commentEntity.getUser().getImage().getFilePath());
        commentDTO.setAuthorFirstName(commentEntity.getUser().getFirstName());
        commentDTO.setCreatedAt(commentEntity.getCreatedAt());
        commentDTO.setPk(commentEntity.getId());
        commentDTO.setText(commentEntity.getText());
        return commentDTO;
    }

}
