package ru.skypro.homework.mapping.usermapping;

import ru.skypro.homework.dto.User;
import ru.skypro.homework.model.UserEntity;

public class UpdateUserDTOMapping {

    public static User mapUserEntityToUser(UserEntity userEntity) {
        User userDTO = new User();
        userDTO.setFirstName(userEntity.getFirstName());
        userDTO.setLastName(userDTO.getLastName());
        userDTO.setPhone(userEntity.getPhone());
        return userDTO;
    }

    public static UserEntity mapUserToUserEntity(User userDTO) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userDTO.getId());
        userEntity.setFirstName(userDTO.getFirstName());
        userEntity.setLastName(userDTO.getLastName());
        userEntity.setPhone(userDTO.getPhone());
        return userEntity;
    }
}
