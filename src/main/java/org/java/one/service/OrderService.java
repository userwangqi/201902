package org.java.one.service;

import java.util.List;
import java.util.Map;

public interface OrderService {

    /**
     * 查询所有用户的所有订单
     * @return
     */
    List<Map> queryIndentAll();

}
