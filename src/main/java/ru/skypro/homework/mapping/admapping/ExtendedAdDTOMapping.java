package ru.skypro.homework.mapping.admapping;

import ru.skypro.homework.dto.ExtendedAd;
import ru.skypro.homework.model.AdEntity;

public class ExtendedAdDTOMapping {

    public static ExtendedAd mapAdEntityToExtendedAd(AdEntity adEntity) {
        ExtendedAd extendedAdDTO = new ExtendedAd();
        extendedAdDTO.setPk(adEntity.getId());
        extendedAdDTO.setAuthorFirstName(adEntity.getUser().getFirstName());
        extendedAdDTO.setAuthorLastName(adEntity.getUser().getLastName());
        extendedAdDTO.setDescription(adEntity.getDescription());
        extendedAdDTO.setEmail(adEntity.getUser().getEmail());
        extendedAdDTO.setPhone(adEntity.getUser().getPhone());
        extendedAdDTO.setPrice(adEntity.getPrice());
        extendedAdDTO.setTitle(adEntity.getTitle());
        return extendedAdDTO;
    }

}
