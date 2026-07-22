package model.dao;

import java.util.List;

import model.entities.Department;

public interface DepartmentDao {

	//criando operações que vão controlar meu departamento
	
	void insert (Department obj); //operação que vai inserir no banco de dados o objeto que passar como parametro de entrada
	void update (Department obj); //operação que vai atualizar no banco de dados o objeto que passar como parametro de entrada
	void deleteById(Integer id); // vai deletar o id que receber
	Department findById(Integer id); //operação que vai procurar o id no banco de dados, se existir retorna um department, se não retorna nulo
	List<Department> findAll(); //retorna todos os departamentos como uma lista
	
}
