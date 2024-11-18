package ru.skypro.homework.mapping.usermapping;

import ru.skypro.homework.dto.User;
import ru.skypro.homework.model.UserEntity;

public class UserDTOMapping {

    public static User mapUserEntityToUser(UserEntity userEntity) {
        User userDTO = new User();
        userDTO.setId(userEntity.getId());
        userDTO.setEmail(userEntity.getEmail());
        userDTO.setFirstName(userEntity.getFirstName());
        userDTO.setLastName(userDTO.getLastName());
        userDTO.setPhone(userEntity.getPhone());
        userDTO.setRole(userEntity.getRole());
        userDTO.setImage(userEntity.getImage());
        return userDTO;
    }

    public static UserEntity mapUserToUserEntity(User userDTO) {
        UserEntity userEntity = new UserEntity();
        //todo нужно ли сетить id в userEntity? он вроде сам генерируется
        userEntity.setId(userDTO.getId());
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setFirstName(userDTO.getFirstName());
        userEntity.setLastName(userDTO.getLastName());
        userEntity.setPhone(userDTO.getPhone());
        userEntity.setRole(userDTO.getRole());
        userEntity.setImage(userDTO.getImage());
        return userEntity;
    }
}