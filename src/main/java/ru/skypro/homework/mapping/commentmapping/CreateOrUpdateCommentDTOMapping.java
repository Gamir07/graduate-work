package ru.skypro.homework.mapping.commentmapping;

import ru.skypro.homework.dto.CreateOrUpdateComment;
import ru.skypro.homework.model.CommentEntity;

public class CreateOrUpdateCommentDTOMapping {
    //todo правильный ли тут маппинг?

    public static CommentEntity mapUserEntityToLogin(CreateOrUpdateComment createOrUpdateComment) {
        CommentEntity commentEntity = new CommentEntity();
        commentEntity.setText(createOrUpdateComment.getText());
        return commentEntity;
    }
}
