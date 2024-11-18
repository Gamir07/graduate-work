package ru.skypro.homework.mapping.admapping;

import ru.skypro.homework.dto.Ad;
import ru.skypro.homework.model.AdEntity;

public class AdDTOMapping {
    public static Ad mapAdEntityToAd(AdEntity adEntity) {
        Ad adDTO = new Ad();
        adDTO.setAuthor(adEntity.getUser().getId());
        adDTO.setImage(adEntity.getImage());
        adDTO.setPk(adEntity.getId());
        adDTO.setPrice(adEntity.getPrice());
        adDTO.setTitle(adEntity.getTitle());
        return adDTO;
    }

    public static AdEntity mapAdToAdEntity(Ad adDTO) {
        AdEntity adEntity = new AdEntity();
        // todo я так понял тут не надо сетить поле author. Он сам засетится
        adEntity.setImage(adDTO.getImage());
        adEntity.setId(adDTO.getPk());
        adEntity.setPrice(adDTO.getPrice());
        adEntity.setTitle(adDTO.getTitle());
        return adEntity;
    }
}
