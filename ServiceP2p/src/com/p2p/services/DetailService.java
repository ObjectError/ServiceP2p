package com.p2p.services;

import com.p2p.base.IBaseService;
import com.p2p.pojo.Detail;

public interface DetailService extends IBaseService<Integer, Detail>{

	Detail getDetail(Detail detail);
}
