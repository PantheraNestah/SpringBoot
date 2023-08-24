package springBoot.jpaRelations.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springBoot.jpaRelations.Entities.RoleEntity;

import java.io.Serializable;

@Repository
public interface RoleRepository extends JpaRepository<RoleEntity, Serializable> {
    RoleEntity findByName(String role_name);
}
