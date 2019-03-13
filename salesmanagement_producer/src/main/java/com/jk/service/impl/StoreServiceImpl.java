package com.jk.service.impl;

import com.jk.mapper.StoreMapper;
import com.jk.pojo.StoreBean;
import com.jk.service.StoreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreServiceImpl implements StoreService {

    @Autowired
    private StoreMapper storeMapper;

    //店铺新增
    @Override
    public void saveStore(StoreBean storeBean) {
        storeMapper.saveStore(storeBean);
    }
}
