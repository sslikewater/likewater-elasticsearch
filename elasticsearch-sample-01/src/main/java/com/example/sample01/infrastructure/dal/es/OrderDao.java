package com.example.sample01.infrastructure.dal.es;

import com.example.sample01.infrastructure.dal.es.dataobject.OrderDO;
import com.example.sample01.infrastructure.exception.ElasticsearchException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.elasticsearch.NoSuchIndexException;
import org.springframework.data.elasticsearch.UncategorizedElasticsearchException;
import org.springframework.data.elasticsearch.core.ElasticsearchRestTemplate;
import org.springframework.stereotype.Service;

/**
 * @Author: likewater
 * @Description:
 * @Date: Create in 10:24 上午 2022/3/26
 */
@Service
public class OrderDao {
    private static final Logger logger = LoggerFactory.getLogger(OrderDao.class);


    @Autowired
    ElasticsearchRestTemplate elasticsearchRestTemplate;


    void createOrder(OrderDO orderDO){
        try {
            elasticsearchRestTemplate.save(orderDO);
        }catch (UncategorizedElasticsearchException ex) {
            String msg = ex.getMessage();
            //如果是版本冲突，不抛出异常，直接忽略
            if(msg != null && msg.contains("version_conflict_engine_exception")) {
                //foo
            }
            else {
                logger.error(ex.getMessage(),ex);
                throw new ElasticsearchException(ex);
            }
        } catch (NoSuchIndexException ex) {
            logger.error(ex.getMessage(),ex);
            throw new ElasticsearchException(ex);

        } catch (Exception ex) {
            logger.error(ex.getMessage(),ex);
            throw new ElasticsearchException(ex);
        }
    }
}
