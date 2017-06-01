package lancer.total.service;

import lancer.c_login.domain.c_loginVO;
import lancer.c_login.domain.c_login_freelancerVO;

public interface c_loginService {
	public c_login_freelancerVO select_f_login(c_loginVO vo);
}
