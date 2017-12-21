package com.p2p.base;

import java.io.Serializable;
import java.util.List;

public interface BeansDao <Pk extends Serializable,T>{
	 int addModel(T model);
	 T getModel(T model);
	 List<T> list();
	 int update(T model);
	 int delete(T model);
	 T findModel(Pk id);
}
