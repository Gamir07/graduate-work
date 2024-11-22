package ru.skypro.homework.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
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

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "ad")
    @JoinColumn(name = "image")
    private AdImageEntity image;
    @Column(name = "price")
    @Size(max = 10000000)
    private int price;
    @Column(name = "title")
    @Size(min = 4, max = 32)
    private String title;
    @Column(name = "description")
    @Size(min = 8, max = 64)
    private String description;

    @ManyToOne
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private UserEntity user;

    @OneToMany(mappedBy = "ad")
    private List<CommentEntity> commentEntityList;
}
