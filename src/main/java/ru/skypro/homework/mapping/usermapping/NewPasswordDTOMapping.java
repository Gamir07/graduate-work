package ru.skypro.homework.mapping.usermapping;

import ru.skypro.homework.dto.NewPassword;
import ru.skypro.homework.model.UserEntity;

public class NewPasswordDTOMapping {

    public static UserEntity mapUserEntityToLogin(NewPassword newPassword, UserEntity userEntity) {
        userEntity.setPassword(newPassword.getNewPassword());
        return userEntity;
    }
}
