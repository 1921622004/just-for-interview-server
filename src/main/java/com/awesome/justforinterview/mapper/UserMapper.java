package com.awesome.justforinterview.mapper;

import com.awesome.justforinterview.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
public interface UserMapper {
  User getById(String id);

  void createUser(User user);

  User getByUsername(String username);
}
