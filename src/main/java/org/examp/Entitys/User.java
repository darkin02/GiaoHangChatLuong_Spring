package org.examp.Entitys;
import lombok.Data;
import javax.persistence.*;
@Data
@Entity
@Table(name = "user")
public class User {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    @Column(name = "name", length = 100)
    private String name;
}
