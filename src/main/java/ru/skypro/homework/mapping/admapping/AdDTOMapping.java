package ru.skypro.homework.mapping.admapping;

import ru.skypro.homework.dto.Ad;
import ru.skypro.homework.model.AdEntity;
import ru.skypro.homework.model.AdImageEntity;
import ru.skypro.homework.model.UserEntity;

public class AdDTOMapping {
    public static Ad mapAdEntityToAd(AdEntity adEntity) {
        Ad adDTO = new Ad();
        adDTO.setAuthor(adEntity.getUser().getId());
        adDTO.setImage(adEntity.getImage().getFilePath());
        adDTO.setPk(adEntity.getId());
        adDTO.setPrice(adEntity.getPrice());
        adDTO.setTitle(adEntity.getTitle());
        return adDTO;
    }

    public static AdEntity mapAdToAdEntity(Ad adDTO, UserEntity userEntity) {
        AdEntity adEntity = new AdEntity();
        AdImageEntity image = new AdImageEntity();
        image.setFilePath(adDTO.getImage());
        adEntity.setUser(userEntity);
        adEntity.setImage(image);
        adEntity.setId(adDTO.getPk());
        adEntity.setPrice(adDTO.getPrice());
        adEntity.setTitle(adDTO.getTitle());
        return adEntity;
    }
}
