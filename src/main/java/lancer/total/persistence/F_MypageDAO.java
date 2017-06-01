package lancer.total.persistence;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import lancer.f_mypage.domain.Freelancer;

@Repository
public class F_MypageDAO {
	
	@Inject
	private SqlSession session;
	
	private static String namespace = "lancer.mapper.f_mypageMapper";

	public Freelancer showFreelancerInfo(int f_num) throws Exception {
		return session.selectOne(namespace + ".showFreelancerInfo", f_num);
	}
}
