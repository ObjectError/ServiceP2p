package com.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.mapper.ServiceUserMapper;
import com.p2p.pojo.ServiceUser;
import com.p2p.services.ServiceUserServices;

@Service
@Transactional
public class ServiceUserImpl implements ServiceUserServices{

	private ServiceUserMapper usermapper;
	@Override
	public int addModel(ServiceUser model) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ServiceUser getModel(ServiceUser model) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ServiceUser> list() {
		// TODO Auto-generated method stub
		return usermapper.list();
	}

	@Override
	public int update(ServiceUser model) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(ServiceUser model) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public ServiceUser findModel(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
