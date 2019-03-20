package com.jk.util;

import java.io.Serializable;
import java.util.List;

/**
 * easyui分页返回工具类
 *
 * @author songxj
 */
public class PageResult implements Serializable {

    private Integer total;

    private List<?> rows;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<?> getRows() {
        return rows;
    }

    public void setRows(List<?> rows) {
        this.rows = rows;
    }
}
