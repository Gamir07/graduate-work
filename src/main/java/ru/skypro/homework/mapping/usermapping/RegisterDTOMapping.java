package ru.skypro.homework.mapping.usermapping;

import ru.skypro.homework.dto.Register;
import ru.skypro.homework.model.UserEntity;

public class RegisterDTOMapping {
    public static Register mapUserEntityToRegister(UserEntity userEntity) {
        Register register = new Register();
        register.setUsername(userEntity.getEmail());
        register.setPassword(userEntity.getPassword());
        register.setFirstName(userEntity.getFirstName());
        register.setLastName(userEntity.getLastName());
        register.setPhone(userEntity.getPhone());
        register.setRole(userEntity.getRole());
        return register;
    }

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
