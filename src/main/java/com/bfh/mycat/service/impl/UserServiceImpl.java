package com.bfh.mycat.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bfh.mycat.entity.UserEntity;
import com.bfh.mycat.mapper.UserMapper;
import com.bfh.mycat.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Slf4j
@Service
@Transactional
public class UserServiceImpl extends ServiceImpl<UserMapper, UserEntity> implements UserService {

	@Override
	public void test01() {
		List<UserEntity> list = baseMapper.selectList(null);
		list.forEach(System.out::println);
	}

	@Override
	public void test02() {
		{
			UserEntity userEntity = new UserEntity();
			userEntity.setUserName("a");
			baseMapper.insert(userEntity);
		}
		{
			UserEntity userEntity = new UserEntity();
			userEntity.setUserName("b");
			baseMapper.insert(userEntity);
		}
		System.out.println(1 / 0);
	}

}
