package springBoot.jpaRelations.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "users")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;
    @Column(length = 50, nullable = false)
    private String email;
    @Column(length = 100)
    private String user_name;
    @Column(length = 50, nullable = false)
    private String password;

    public UserEntity(String email, String name, String password)
    {
        this.user_name = name;
        this.email = email;
        this.password = password;
    }
    @OneToOne()
    @JoinColumn(name = "role_id", referencedColumnName = "role_id")
    private RoleEntity role;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinTable(name = "users_category", joinColumns =  @JoinColumn(name = "user_id", referencedColumnName = "user_id"),inverseJoinColumns =@JoinColumn(name = "product_category", referencedColumnName = "id"))
    private ProductsCategory category;

    @Override
    public String toString()
    {
        String user = "**********   USER DETAILS    **********\nUsername\n\t->"+user_name+"\nId\n\t->"+user_id+"\nEmail\n\t->"+email+"\nRole\n\t->"+role;
        return (user);
    }
}
