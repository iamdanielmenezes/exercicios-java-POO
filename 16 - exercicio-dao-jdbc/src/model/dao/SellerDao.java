package model.dao;

import java.util.List;

import model.entities.Department;
import model.entities.Seller;

public interface SellerDao {

	//criando operações que vão controlar meu Seller
	
	void insert (Seller obj); //operação que vai inserir no banco de dados o objeto que passar como parametro de entrada
	void update (Seller obj); //operação que vai atualizar no banco de dados o objeto que passar como parametro de entrada
	void deleteById(Integer id); // vai deletar o id que receber
	Seller findById(Integer id); //operação que vai procurar o id no banco de dados, se existir retorna um Seller, se não retorna nulo
	List<Seller> findAll(); //retorna todos os vendedores como uma lista
	List<Seller> findByDepartment(Department department); //operação que proura por departamento
}
 