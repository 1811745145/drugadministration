package com.jk.controller;

import com.jk.pojo.MongoExchange;
import com.jk.pojo.MongodDiscuss;
import com.mongodb.Mongo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.data.domain.Sort;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.domain.Sort.Order;
@Controller
public class MongodbController {

    @Autowired
    public MongoTemplate mongoTemplate;


    //MongodDiscuss查询
    @RequestMapping("queryMongo")
    @ResponseBody
    public List<MongodDiscuss> queryMongo(MongodDiscuss mongodDiscuss) {

        Query query = new Query();

        if (!StringUtils.isEmpty(mongodDiscuss.getMerchant())) {
            // 用户传入了方法的名字 根据方法进行模糊查询 find({method:/query/}) 采用的是正则表达式 无需再加//
            query.addCriteria(Criteria.where("merchant").regex(mongodDiscuss.getMerchant()));
        }

        List<MongodDiscuss> mongoList = mongoTemplate.find(query, MongodDiscuss.class);

        return mongoList;
    }

    /**
     * MongodDiscuss查询跳页面
     * @return
     */
    @RequestMapping("toMongo")
    public String toMongo(){
        return "mongodbList";
    }

    //MongodDiscuss跳转新增页面
    @RequestMapping("toAddMongo")
    public String toAddMongo() {

        return "addMongo";
    }

    //MongodDiscuss新增
    @RequestMapping("addMongo")
    @ResponseBody
    public String addMongo(MongodDiscuss mongodDiscuss) {
        mongoTemplate.save(mongodDiscuss);
        return "1";
    }

    //MongodDiscuss单删
    @RequestMapping("deleteMongo")
    @ResponseBody
    public String deleteMongo(MongodDiscuss mongodDiscuss) {
        mongoTemplate.remove(mongodDiscuss);
        return "1";
    }


    //MongoExchange查询
    @RequestMapping("querymongoExchangeList")
    @ResponseBody
    public Map<String, Object> querymongoExchangeList(Integer page, Integer rows,MongoExchange mongoExchange) {

        Query query = new Query();

        //分页条件
        query.skip((page - 1) * rows); //起始条数
        query.limit(rows);//每页条数

        //查询总记录数
        long count = mongoTemplate.count(query, MongoExchange.class);

        // 查询日志集合
        List<MongoExchange> mongoList = mongoTemplate.find(query, MongoExchange.class);

        Map<String, Object> resultMap = new HashMap<String, Object>();
        resultMap.put("rows", mongoList);
        resultMap.put("total", count);

        List<MongoExchange> mongoExchangeList = mongoTemplate.find(query, MongoExchange.class);

        return resultMap;
    }

    /**
     * MongoExchange查询跳页面
     * @return
     */
    @RequestMapping("toExchange")
    public String toExchange(){
        return "mongoExchangeList";
    }

    @RequestMapping("addmongoExchange")
    @ResponseBody
    public String addmongoExchange(MongoExchange mongoExchange) {
        mongoTemplate.save(mongoExchange);
        return "1";
    }

}
