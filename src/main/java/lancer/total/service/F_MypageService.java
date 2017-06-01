package lancer.total.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import lancer.f_mypage.domain.Freelancer;
import lancer.total.persistence.F_MypageDAO;

@Service
public class F_MypageService {

	@Inject
	private F_MypageDAO dao;

	public Freelancer showFreelancerInfo(int f_num) throws Exception{
		return dao.showFreelancerInfo(f_num);
	}
}
