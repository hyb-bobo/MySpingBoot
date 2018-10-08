package com.shanghai.springboot.mapper;

import com.shanghai.springboot.domain.Tuser;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TuserMapper {
    // 也可以直接在这里写sql语句  但是通常来说 我们会在
//    @Select("SELECT * FROM tuser ")
    public List<Tuser> queryUserList();
}