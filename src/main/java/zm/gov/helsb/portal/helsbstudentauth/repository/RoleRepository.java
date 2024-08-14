package zm.gov.helsb.portal.helsbstudentauth.repository;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import zm.gov.helsb.portal.helsbstudentauth.models.ERole;
import zm.gov.helsb.portal.helsbstudentauth.models.Role;

import java.util.Optional;

@Repository
public interface RoleRepository extends CrudRepository<Role, Long> {
  Optional<Role> findByName(ERole name);
}
