package com.p2p.services;

import com.p2p.base.IBaseService;
import com.p2p.pojo.Fabiao;

public interface FabiaoService extends IBaseService<Integer, Fabiao> {

	//根据订单号查询
		Fabiao getByOrder(String order);
}
