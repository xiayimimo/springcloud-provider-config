package springcloudproviderconfig.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springcloudproviderconfig.dao.UserMapper;
import springcloudproviderconfig.entity.User;
@Service
public class UserService {

	@Autowired
	UserMapper userMapper;
	
	public User find(String id) {
		
		return userMapper.queryById(id);
	}
	
	public List<User> findAll(){
		List<User> list = userMapper.query(); 
		return list;
	}
}
