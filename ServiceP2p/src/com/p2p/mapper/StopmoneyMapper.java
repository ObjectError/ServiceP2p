package com.p2p.mapper;

import com.p2p.base.IBaseDao;
import com.p2p.pojo.Stopmoney;

public interface StopmoneyMapper extends IBaseDao<Integer, Stopmoney> {

	//根据订单号查询
	Stopmoney getOrder(String order);
}