package lancer.total.persistence;

import java.util.List;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import lancer.f_main.domain.member;

@Repository
public class f_mainDAOImpl implements f_mainDAO {

	
	@Inject
	private SqlSession session;
	
	private static String namespace = "lancer.mapper.f_mainMapper";

	@Override
	public List<member> getF_info() throws Exception {
		
		return session.selectList(namespace + ".getF_info");
	}
	
	

}
