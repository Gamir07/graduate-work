package ru.skypro.homework.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDateTime;

@Entity
@Data
@NoArgsConstructor
@Table(name = "comment")
public class CommentEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "created_At")
    private LocalDateTime createdAt;
    @Column(name = "text")
    @Size(min = 8, max = 64)
    private String text;
    @ManyToOne
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private AdEntity ad;

    @ManyToOne
    @JoinColumn(name = "id", insertable = false, updatable = false)
    private UserEntity user;

}
