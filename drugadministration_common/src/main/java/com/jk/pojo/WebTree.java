package com.jk.pojo;

import java.util.List;

public class WebTree {

    private    Integer   ids;
    private    String    texts;
    private    String    url;
    private   Integer    pid;
   private List<WebTree> nodes;

    public List<WebTree> getNodes() {
        return nodes;
    }

    public void setNodes(List<WebTree> nodes) {
        this.nodes = nodes;
    }

    public Integer getIds() {
        return ids;
    }

    public void setIds(Integer ids) {
        this.ids = ids;
    }

    public String getTexts() {
        return texts;
    }

    public void setTexts(String texts) {
        this.texts = texts;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

}
