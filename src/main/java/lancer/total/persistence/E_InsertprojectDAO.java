package lancer.total.persistence;


import java.util.Map;

import lancer.e_insertproject.domain.E_Insert;

public interface E_InsertprojectDAO{
	
	public void insertProject(E_Insert project) throws Exception;
	public int getnum()throws Exception;
	public void insertP_Job(Map<String, Integer> map)throws Exception;

}



