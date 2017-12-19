package com.p2p.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.p2p.mapper.Mapper;
import com.p2p.services.ServiceS;

@Transactional
@Service
public class ServiceImpl implements ServiceS{

	@Resource
	private Mapper mapper;
}
