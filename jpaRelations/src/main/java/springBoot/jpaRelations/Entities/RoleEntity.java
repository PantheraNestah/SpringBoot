package springBoot.jpaRelations.Entities;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "roles")
public class RoleEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int role_id;
	@Column(length = 50, nullable = false)
	private String role_name;

	public RoleEntity(String name)
	{
		this.role_name = name;
	}
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn()
	private UserEntity user;

	@Override
	public String toString()
	{
		String role = "\nRole:\n\tId:\t"+role_id+"\n\tName:\t"+role_name;
		return (role);
	}

}
