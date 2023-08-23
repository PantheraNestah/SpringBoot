package springBoot.jpaRelations.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springBoot.jpaRelations.Entities.UserEntity;

import java.io.Serializable;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Serializable> {
	UserEntity findByEmail(String email);
}
