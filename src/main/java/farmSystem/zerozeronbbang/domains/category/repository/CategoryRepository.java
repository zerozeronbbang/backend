package farmSystem.zerozeronbbang.domains.category.repository;

import farmSystem.zerozeronbbang.domains.category.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
