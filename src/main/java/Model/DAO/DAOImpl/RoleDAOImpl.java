package Model.DAO.DAOImpl;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Optional;

import javax.management.relation.Role;

import Model.DAO.DAOInter.RoleInter;
import Model.Enumeration.TypeRole;
import Model.InterfaceDB.Database;




public class RoleDAOImpl implements RoleInter{
	private final Database DB;

    public RoleDAOImpl(Database DB) {
        this.DB = DB;
    }

	@Override
	public Optional<Role> lire(int roleId) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Role> findByNom(TypeRole typeRole) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public void save(Role role) {
		// TODO Auto-generated method stub
		
	}

	
	
}