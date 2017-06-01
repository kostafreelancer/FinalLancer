package lancer.total.service;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import lancer.f_main.domain.member;
import lancer.total.persistence.f_mainDAO;

@Service
public class f_mainServiceImpl implements f_mainService {

	@Inject
	f_mainDAO dao;

	@Override
	public List<member> getF_info() throws Exception {
		
		return dao.getF_info();
	}
	
	
}
