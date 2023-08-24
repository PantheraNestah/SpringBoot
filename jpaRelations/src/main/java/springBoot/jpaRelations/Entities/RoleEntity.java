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
	@Column(name = "role_name", length = 50, nullable = false)
	private String name;

	public RoleEntity(String name)
	{
		this.name = name;
	}

	@Override
	public String toString()
	{
		String role = "\nRole:\n\tId:\t"+role_id+"\n\tName:\t"+name;
		return (role);
	}

}
