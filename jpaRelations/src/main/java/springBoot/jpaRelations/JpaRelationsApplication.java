package springBoot.jpaRelations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ConfigurableApplicationContext;
import springBoot.jpaRelations.Entities.RoleEntity;
import springBoot.jpaRelations.Entities.UserEntity;
import springBoot.jpaRelations.Service.UserService;

@SpringBootApplication
@EntityScan(basePackages = "springBoot.jpaRelations.Entities")
public class JpaRelationsApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(JpaRelationsApplication.class, args);
		UserService service = ctx.getBean(UserService.class);

		RoleEntity role = new RoleEntity();
		role.setRole_name("Customer");
		UserEntity user1 = new UserEntity(1,"harmedanimosh@gmail.com","Mosh Harmedani","@moshHermed1");
		user1.setRole(role);

		service.saveUser(user1);

		System.out.println(service.getUserByEmail("harmedanimosh@gmail.com"));
	}

}
