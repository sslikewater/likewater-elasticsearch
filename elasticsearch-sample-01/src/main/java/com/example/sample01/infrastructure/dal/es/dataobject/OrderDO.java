package com.example.sample01.infrastructure.dal.es.dataobject;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Version;
import org.springframework.data.elasticsearch.annotations.DateFormat;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Author: likewater
 * @Description:
 * @Date: Create in 9:16 下午 2022/3/2
 */
@Document(indexName = "order",shards=1,replicas = 0)

public class OrderDO {

    @Id
    private Long id;

    @Field(type = FieldType.Date_Nanos,format = DateFormat.basic_date_time)
    private LocalDateTime payTime;

    @Field(type = FieldType.Date_Nanos,format = DateFormat.basic_date_time)
    private LocalDateTime shipTime;

    @Field(type = FieldType.Date_Nanos,format = DateFormat.basic_date_time)
    private LocalDateTime endTime;

    @Field(type = FieldType.Keyword)
    private String userId;

    @Field(type = FieldType.Keyword)
    private String sellerId;

    @Field(type = FieldType.Keyword)
    private String storeId;

    @Field(type = FieldType.Long)
    private Long totalItemsAmount;

    @Field(type = FieldType.Long)
    private Long discountAmount;

    @Field(type = FieldType.Long)
    private Long deliveryAmount;

    @Field(type = FieldType.Long)
    private Long totalAmount;

    @Field(type = FieldType.Keyword)
    private String deliveryAddress;

    @Field(type = FieldType.Keyword)
    private String status;

    @Version //external version  ，用于做乐观锁的控制
    private Long version;

    @Field(type = FieldType.Date_Nanos,format = DateFormat.basic_date_time)
    private LocalDateTime gmtCreate;

    @Field(type = FieldType.Keyword)
    private String isDeleted;



    //getter,setter,构造函数等


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getPayTime() {
        return payTime;
    }

    public void setPayTime(LocalDateTime payTime) {
        this.payTime = payTime;
    }

    public LocalDateTime getShipTime() {
        return shipTime;
    }

    public void setShipTime(LocalDateTime shipTime) {
        this.shipTime = shipTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public Long getTotalItemsAmount() {
        return totalItemsAmount;
    }

    public void setTotalItemsAmount(Long totalItemsAmount) {
        this.totalItemsAmount = totalItemsAmount;
    }

    public Long getDiscountAmount() {
        return discountAmount;
    }

    public void setDiscountAmount(Long discountAmount) {
        this.discountAmount = discountAmount;
    }

    public Long getDeliveryAmount() {
        return deliveryAmount;
    }

    public void setDeliveryAmount(Long deliveryAmount) {
        this.deliveryAmount = deliveryAmount;
    }

    public Long getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Long totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public LocalDateTime getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(LocalDateTime gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public String getIsDeleted() {
        return isDeleted;
    }

    public void setIsDeleted(String isDeleted) {
        this.isDeleted = isDeleted;
    }
}
