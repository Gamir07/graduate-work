package ru.skypro.homework.mapping.commentmapping;

import ru.skypro.homework.dto.CreateOrUpdateComment;
import ru.skypro.homework.model.CommentEntity;

public class CreateOrUpdateCommentDTOMapping {

    public static CommentEntity mapUserEntityToLogin(CreateOrUpdateComment createOrUpdateComment, CommentEntity commentEntity) {
        commentEntity.setText(createOrUpdateComment.getText());
        return commentEntity;
    }
}
