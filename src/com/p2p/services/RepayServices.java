package com.p2p.services;

import com.p2p.base.IBaseService;
import com.p2p.pojo.Repayment;

public interface RepayServices extends IBaseService<Integer, Repayment>{

	//根据订单号查询对象
		Repayment getByOrder(String order);
}
