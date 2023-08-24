package springBoot.jpaRelations.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import springBoot.jpaRelations.Entities.ProductsCategory;

import java.io.Serializable;

@Repository
public interface ProductsCategoryRepository extends JpaRepository<ProductsCategory, Serializable> {
}
