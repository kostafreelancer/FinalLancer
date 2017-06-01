package lancer.total.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;

import lancer.c_login.domain.c_loginVO;
import lancer.c_login.domain.c_login_freelancerVO;

public class c_loginDAOImpl implements c_loginDAO {
	
	String namespace = "lancer.mappers.c_loginMapper";
	@Inject
	private SqlSession session;
	
	@Override
	public c_login_freelancerVO select_f_login(c_loginVO vo) {
		
		return session.selectOne(namespace+".select_f_login",vo);
	}
	
	
}
