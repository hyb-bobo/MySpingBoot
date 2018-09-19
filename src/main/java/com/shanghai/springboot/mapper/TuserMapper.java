package com.shanghai.springboot.mapper;

import com.shanghai.springboot.domain.Tuser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface TuserMapper {
    public List<Tuser> queryUserList();
}