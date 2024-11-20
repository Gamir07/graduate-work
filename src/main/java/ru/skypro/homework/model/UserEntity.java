package ru.skypro.homework.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import ru.skypro.homework.dto.Role;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@Table(name = "users")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
    @Column(name = "first_name")
    @Size(min = 2, max = 16)
    private String firstName;
    @Column(name = "last_name")
    @Size(min = 2, max = 16)
    private String lastName;
    @Column(name = "email")
    @Size(min = 4, max = 32)
    private String email;
    @Column(name = "phone")
    @Pattern(regexp = "\\+7\\s?\\(?\\d{3}\\)?\\s?\\d{3}-?\\d{2}-?\\d{2}")
    private String phone;

    @Enumerated(value = EnumType.STRING)
    @Column(name = "role")
    private Role role;
    @OneToOne(cascade = CascadeType.ALL, mappedBy = "user")
    @JoinColumn(name = "image")
    private AvatarEntity image;
    @Column(name = "password")
    @Size(min = 8, max = 16)
    private String password;

    @OneToMany(mappedBy = "user")
    private List<AdEntity> adEntityList;

    @OneToMany(mappedBy = "user")
    private List<CommentEntity> commentEntityList;


}
