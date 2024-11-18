package ru.skypro.homework.mapping.usermapping;

import ru.skypro.homework.dto.NewPassword;
import ru.skypro.homework.model.UserEntity;

public class NewPasswordDTOMapping {

    //todo что то у меня сомнения в том что нужно в маппинге создавать новый UserEntity. Тут надо репозиторий добавить и оттуда брать нашего юзера?
    public static UserEntity mapUserEntityToLogin(NewPassword newPassword) {
        UserEntity userEntity = new UserEntity();
        userEntity.setPassword(newPassword.getNewPassword());
        return userEntity;
    }
}
