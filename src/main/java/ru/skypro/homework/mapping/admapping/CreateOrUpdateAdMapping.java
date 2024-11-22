package ru.skypro.homework.mapping.admapping;

import ru.skypro.homework.dto.CreateOrUpdateAd;
import ru.skypro.homework.model.AdEntity;

public class CreateOrUpdateAdMapping {
    public static CreateOrUpdateAd mapAdEntityToCreateOrUpdateAd(AdEntity adEntity) {
        CreateOrUpdateAd createOrUpdateAd = new CreateOrUpdateAd();
        createOrUpdateAd.setTitle(adEntity.getTitle());
        createOrUpdateAd.setPrice(adEntity.getPrice());
        createOrUpdateAd.setDescription(adEntity.getDescription());
        return createOrUpdateAd;
    }

    public static AdEntity mapCreateOrUpdateAdToAdEntity(CreateOrUpdateAd createOrUpdateAd, AdEntity adEntity) {
        adEntity.setTitle(createOrUpdateAd.getTitle());
        adEntity.setPrice(createOrUpdateAd.getPrice());
        adEntity.setDescription(createOrUpdateAd.getDescription());
        return adEntity;
    }
}
