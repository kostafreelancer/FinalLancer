package lancer.total.service;

import java.util.Map;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import lancer.e_insertproject.domain.E_Insert;
import lancer.total.persistence.E_InsertprojectDAO;


@Service
public class E_InsertprojectServiceImpl implements E_InsertprojectService{
	
	@Inject
	 E_InsertprojectDAO dao;
	
	@Override
	public void  insertProject(E_Insert project) throws Exception{
		dao.insertProject(project);
	}
	@Override
	public int getnum() throws Exception{
		return dao.getnum();
	}
	@Override
	public void insertP_Job(Map<String, Integer> map) throws Exception{
	  dao.insertP_Job(map);
	}
}
