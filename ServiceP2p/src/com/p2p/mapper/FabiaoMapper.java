package com.p2p.mapper;

import com.p2p.base.IBaseDao;
import com.p2p.pojo.Fabiao;

public interface FabiaoMapper extends IBaseDao<Integer, Fabiao>{

	//根据订单号查询
	Fabiao getByOrder(String order);
}
