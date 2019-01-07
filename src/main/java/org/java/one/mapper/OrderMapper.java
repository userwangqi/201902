package org.java.one.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface OrderMapper {

    /**
     * 查询所有用户的所有订单
     * @return
     */
    List<Map> queryIndentAll();

}
