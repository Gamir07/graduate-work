package ru.skypro.homework.mapping.admapping;

import ru.skypro.homework.dto.Ad;
import ru.skypro.homework.dto.Ads;
import ru.skypro.homework.model.AdEntity;
import ru.skypro.homework.model.UserEntity;

import java.util.ArrayList;
import java.util.List;

public class AdsDTOMapping {
    public static Ads mapAdsDTO(UserEntity userEntity) {
        List<AdEntity> adEntityList = userEntity.getAdEntityList();
        List<Ad> adsDTO = new ArrayList<>();
        for (AdEntity adEntity : adEntityList) {
            adsDTO.add(AdDTOMapping.mapAdEntityToAd(adEntity));
        }
        return new Ads(adsDTO.size(),adsDTO);
    }
}
