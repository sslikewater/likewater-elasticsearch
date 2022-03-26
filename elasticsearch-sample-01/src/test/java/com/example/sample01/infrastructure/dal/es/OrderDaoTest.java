package com.example.sample01.infrastructure.dal.es;

import com.example.sample01.Application;
import com.example.sample01.infrastructure.dal.es.dataobject.OrderDO;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

/**
 * @Author: likewater
 * @Description:
 * @Date: Create in 12:46 下午 2022/3/26
 */

@SpringBootTest(classes = Application.class)
public class OrderDaoTest {
    @Autowired
    OrderDao orderDao;

    @Test
    public void createOrder(){
        OrderDO orderDO  = new OrderDO();
        orderDO.setDeliveryAddress("中国广州");
        orderDO.setTotalAmount(10000L);
        orderDO.setTotalItemsAmount(2L);
        orderDO.setDeliveryAmount(1000L);
        orderDO.setDiscountAmount(200L);

//        orderDO.setEndTime();
        orderDO.setGmtCreate(LocalDateTime.now());
        orderDO.setId(2L);
        orderDO.setIsDeleted("0");
        orderDO.setPayTime(LocalDateTime.now());
        orderDO.setSellerId("1");
        orderDO.setShipTime(LocalDateTime.now());
        orderDO.setStatus("1");
        orderDO.setStoreId("1");
        orderDO.setVersion(1L);

        orderDao.createOrder(orderDO);
    }
}
