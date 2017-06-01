package lancer.total.persistence;

import java.util.List;

import lancer.f_main.domain.member;

public interface f_mainDAO {

	public List<member> getF_info() throws Exception;
}
