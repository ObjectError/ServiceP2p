package com.p2p.mapper;

import java.util.List;

import com.p2p.base.IBaseDao;
import com.p2p.pojo.Income;

public interface InComeMapper extends IBaseDao<Integer, Income>{
	//模糊查询
	List<Income> likeIncome(Income income); 
}
