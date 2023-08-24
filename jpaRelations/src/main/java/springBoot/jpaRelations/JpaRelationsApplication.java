package springBoot.jpaRelations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import springBoot.jpaRelations.Entities.ProductsCategory;
import springBoot.jpaRelations.Entities.RoleEntity;
import springBoot.jpaRelations.Entities.UserEntity;
import springBoot.jpaRelations.Service.UserService;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@EntityScan(basePackages = "springBoot.jpaRelations.Entities")
public class JpaRelationsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(JpaRelationsApplication.class, args);
		UserService service = ctx.getBean(UserService.class);
		RoleEntity role = service.getRoleByName("Accountant");
		UserEntity user1 = new UserEntity("moshhermedani@gmail.com","Mosh Hermedani","#1Mosh@2023");
		user1.setRole(role);
		ProductsCategory product = new ProductsCategory("Computers Ware");

		List<UserEntity> userList = new ArrayList<>();
		userList.add(user1);
		product.setUsers(userList);

		user1.setCategory(product);

		service.saveUser(user1);
		/**
		 * UserEntity user1 = service.getUserByEmail("harmedanimosh@gmail.com");
		 * 		service.saveUser(user1);
		 * 		System.out.println();
		 *
		 * 	RoleEntity role = new RoleEntity();
		 * 		role.setRole_name("Accountantd");
		 * 		UserEntity user1 = new UserEntity("williamschmolder@gmail.com","William Schmolder","myPassword1#");
		 * 		user1.setRole(role);
		 * 		service.saveUser(user1);
		 */
	}

}
