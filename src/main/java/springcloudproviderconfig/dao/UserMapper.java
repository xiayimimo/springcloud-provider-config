package springcloudproviderconfig.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import springcloudproviderconfig.entity.User;

@Mapper
public interface UserMapper {

	public List<User> query();
	public User queryById(@Param("id")String id);
}
