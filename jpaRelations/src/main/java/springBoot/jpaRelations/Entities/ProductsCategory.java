package springBoot.jpaRelations.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "products_category")
public class ProductsCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(length = 50,nullable = false)
    private String name;

    public ProductsCategory(String name)
    {
        this.name = name;
    }

    @OneToMany(mappedBy = "category", cascade = CascadeType.ALL)
    private List<UserEntity> users;
}
