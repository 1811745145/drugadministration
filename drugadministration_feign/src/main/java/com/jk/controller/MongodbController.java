package com.jk.controller;

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


    //MongoDB查询
    @RequestMapping("queryMongo")
    @ResponseBody
    public List<MongodDiscuss> queryMongo(MongodDiscuss mongodDiscuss) {

        Query query = new Query();

        List<MongodDiscuss> mongoList = mongoTemplate.find(query, MongodDiscuss.class);

        return mongoList;
    }

    /**
     * 查询跳页面
     * @return
     */
    @RequestMapping("toMongo")
    public String toMongo(){
        return "mongodbList";
    }

    //跳转新增页面
    @RequestMapping("toAddMongo")
    public String toAddMongo() {

        return "addMongo";
    }

    //MongoDB新增
    @RequestMapping("addMongo")
    @ResponseBody
    public String addMongo(MongodDiscuss mongodDiscuss) {
        mongoTemplate.save(mongodDiscuss);
        return "1";
    }
}
