package com.shanghai.springboot.execl1;



import com.shanghai.springboot.domain.Tuser;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface UserMapper {
    //查询数据
    @Select("SELECT * FROM  TUSER WHERE NAME = #{name}")
    Tuser findUserByPhone(@Param("name") String name);
    //添加数据
    @Insert("INSERT INTO TUSER(NAME, PASSWORD, USERNAME) VALUES(#{name}, #{password}, #{username})")
    int insert(@Param("name") String name, @Param("password") String password, @Param("username") String username);
 
}