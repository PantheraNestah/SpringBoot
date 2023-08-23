package springBoot.jpaRelations.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springBoot.jpaRelations.Entities.UserEntity;
import springBoot.jpaRelations.Repository.UserRepository;

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
