package springBoot.jpaRelations.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springBoot.jpaRelations.Entities.ProductsCategory;
import springBoot.jpaRelations.Entities.RoleEntity;
import springBoot.jpaRelations.Entities.UserEntity;
import springBoot.jpaRelations.Repository.ProductsCategoryRepository;
import springBoot.jpaRelations.Repository.RoleRepository;
import springBoot.jpaRelations.Repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	@Autowired
	private RoleRepository roleRepository;
	@Autowired
	private ProductsCategoryRepository productsCategoryRepository;
	
	public void saveUser(UserEntity user)
	{
		repository.save(user);
	}
	public void saveProductCategory(ProductsCategory prod)
	{
		productsCategoryRepository.save(prod);
	}
	public UserEntity getUserByEmail(String email)
	{
		UserEntity user = repository.findByEmail(email);
		return (user);
	}
	public RoleEntity getRoleByName(String name)
	{
		RoleEntity role = roleRepository.findByName(name);
		return (role);
	}
}
