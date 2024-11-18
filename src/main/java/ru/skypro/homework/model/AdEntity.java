package ru.skypro.homework.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "ad")
public class AdEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    private String image;
    private int price;
    private String title;
    private String description;

    @ManyToOne
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private UserEntity user;

    @OneToMany(mappedBy = "ad")
    private List<CommentEntity> commentEntityList;
}
