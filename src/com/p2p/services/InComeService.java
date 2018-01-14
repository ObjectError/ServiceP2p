package com.p2p.services;

import java.util.List;

import com.p2p.base.IBaseService;
import com.p2p.pojo.Income;

public interface InComeService extends IBaseService<Integer, Income>{
	//模糊查询
	abstract List<Income> likeIncome(Income income);
}
