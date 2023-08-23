package springBoot.jpaRelations.Entities



@AllArgsConstructor
@NoArgsConstructor
@Setters
@Getters
@Entity
@Table(name = "roles")
public class RoleEntity {
	@Id
	@GeneratedValue(Strategy = GenerationType.IDENTITY)
	private int role_id;
	private String role_name;

}
