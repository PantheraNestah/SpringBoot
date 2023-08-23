package springBoot.jpaRelations.Service



@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
	public void saveUser(UserEntity user)
	{
		repository.save(user);
	}
	public UserEntity getUserByEmail(String email)
	{
		UserEntity user = repository.findByEmail(email);
		return (user);
	}
}
