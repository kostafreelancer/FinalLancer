package lancer.f_mypage.domain;

import java.io.Serializable;

public class ApplyProject implements Serializable{
	private int c_num;
	private String p_name;
	private String manager_hphone;
	private String c_request_date;
	private String contract_check_state;
	
	public ApplyProject(){}

	public ApplyProject(int f_pr_num, String p_name, String manager_hphone, String f_pr_date, String state) {
		super();
		this.c_num = c_num;
		this.p_name = p_name;
		this.manager_hphone = manager_hphone;
		this.c_request_date = c_request_date;
		this.contract_check_state = contract_check_state;
	}

	public int getC_num() {
		return c_num;
	}

	public void setC_num(int c_num) {
		this.c_num = c_num;
	}

	public String getP_name() {
		return p_name;
	}

	public void setP_name(String p_name) {
		this.p_name = p_name;
	}

	public String getManager_hphone() {
		return manager_hphone;
	}

	public void setManager_hphone(String manager_hphone) {
		this.manager_hphone = manager_hphone;
	}

	public String getC_request_date() {
		return c_request_date;
	}

	public void setC_request_date(String c_request_date) {
		this.c_request_date = c_request_date;
	}

	public String getContract_check_state() {
		return contract_check_state;
	}

	public void setContract_check_state(String contract_check_state) {
		this.contract_check_state = contract_check_state;
	}
	
}
