package Model.DAO.DAOInter;

import java.util.Optional;

import javax.management.relation.Role;

import Model.Enumeration.TypeRole;

public interface RoleInter {
	public Optional<Role> lire(int roleId);

	public Optional<Role> findByNom(TypeRole typeRole);

	public void save(Role role);
}
