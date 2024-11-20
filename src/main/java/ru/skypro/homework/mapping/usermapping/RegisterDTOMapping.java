package ru.skypro.homework.mapping.usermapping;

import ru.skypro.homework.dto.Register;
import ru.skypro.homework.model.UserEntity;

public class RegisterDTOMapping {

    public static UserEntity mapRegisterToUserEntity(Register register) {
        UserEntity userEntity = new UserEntity();
        userEntity.setEmail(register.getUsername());
        userEntity.setPassword(register.getPassword());
        userEntity.setFirstName(register.getFirstName());
        userEntity.setLastName(register.getLastName());
        userEntity.setPhone(register.getPhone());
        userEntity.setRole(register.getRole());
        return userEntity;
    }
}
