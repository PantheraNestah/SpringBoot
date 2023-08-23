package springBoot.jpaRelations.Repository




public interface UserRepository extends JpaRepository<UserEntity, Serializable>{
	UserEntity findByEmail(String email);
}
