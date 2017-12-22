package com.p2p.service.impl;

import java.util.List;


import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.mapper.TransferMapper;
import com.p2p.pojo.Transfer;
import com.p2p.services.TransferService;

@Transactional
@Service
public class TransferServiceImpl implements TransferService{
	
	@Resource
	private TransferMapper transferr;
	
	@Override
	public List<Transfer> list() {
		return transferr.list();
	}

	@Override
	public void add(Transfer t) {
		transferr.add(t);
	}

	@Override
	public void delete(Integer id) {
		transferr.delete(id);
	}

	@Override
	public void update(Transfer t) {
		transferr.update(t);
	}

	@Override
	public Transfer getById(Integer id) {
		// TODO Auto-generated method stub
		return transferr.getById(id);
	}

}
