package lancer.total.persistence;

import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import lancer.e_insertproject.domain.E_Insert;

@Repository
public class E_InsertprojectDao {
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "lancer.mappers.e_insertprojectMapper";
	
	public void  insertProject(E_Insert project)throws Exception{
		session.insert(namespace+".insertProject",project);
	}
	public void getnum()throws Exception{
		session.select(namespace+".getnum", null);
	}
	public void insertP_Job(Map<String, Integer> map)throws Exception{
		session.insert(namespace+".insertP_Job",map);
	}
	

}