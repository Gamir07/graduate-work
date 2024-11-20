package ru.skypro.homework.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "avatar")
public class AvatarEntity {
    @Id
    private Integer id;

    @Column(name = "file_path")
    private String filePath;
    @Column(name = "file_size")
    private long fileSize;
    @Column(name = "media_type")
    private String mediaType;
    @Lob
    @Column(name = "data")
    private byte[] data;

    @OneToOne(fetch = FetchType.LAZY)
    @MapsId
    private UserEntity user;
}
