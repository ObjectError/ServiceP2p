package com.p2p.service.impl;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.mapper.InComeMapper;
import com.p2p.pojo.Income;
import com.p2p.services.InComeService;

@Transactional
@Service
public class InComeServiceImpl implements InComeService{
	
	@Resource
	private InComeMapper incomem;
	
	@Override
	public List<Income> list() {
		// TODO Auto-generated method stub
		return incomem.list();
	}

	@Override
	public void add(Income t) {
		// TODO Auto-generated method stub
		incomem.add(t);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		incomem.delete(id);
	}

	@Override
	public void update(Income t) {
		// TODO Auto-generated method stub
		incomem.update(t);
	}

	@Override
	public Income getById(Integer id) {
		// TODO Auto-generated method stub
		return incomem.getById(id);
	}

}
