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

    public UserEntity(int id, String email, String name, String password)
    {
        this.user_id = id;
        this.user_name = name;
        this.email = email;
        this.password = password;
    }
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "role_id", referencedColumnName = "role_id")
    private RoleEntity role;

    @Override
    public String toString()
    {
        String user = "**********   USER DETAILS    **********\nUsername\n\t->"+user_name+"\nId\n\t->"+user_id+"\nEmail\n\t->"+email+"\nRole\n\t->"+role;
        return (user);
    }
}
