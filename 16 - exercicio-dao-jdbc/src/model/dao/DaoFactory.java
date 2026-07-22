package model.dao;

import db.DB;
import model.dao.impl.DepartmentDaoJDBC;
import model.dao.impl.SellerDaoJDBC;

public class DaoFactory { //classe fabrica de dao, vai ter operações estaticas para instanciar os daos

	public static SellerDao createSellerDao() {
		return new SellerDaoJDBC(DB.getConnection()); 
	}
	
	public static DepartmentDao creatDepartmentDao() {
		return new DepartmentDaoJDBC(DB.getConnection());
	} 
	
}
