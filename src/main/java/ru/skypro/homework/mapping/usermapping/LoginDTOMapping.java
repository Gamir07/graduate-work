package ru.skypro.homework.mapping.usermapping;

import ru.skypro.homework.dto.Login;
import ru.skypro.homework.model.UserEntity;

public class LoginDTOMapping {
    public static Login mapUserEntityToLogin(UserEntity userEntity) {
        Login login = new Login();
        login.setPassword(userEntity.getPassword());
        login.setUsername(userEntity.getEmail());
        return login;
    }

    public static UserEntity mapUserEntityToLogin(Login login) {
        UserEntity userEntity = new UserEntity();
        userEntity.setPassword(login.getPassword());
        userEntity.setEmail(login.getUsername());
        return userEntity;
    }
}
