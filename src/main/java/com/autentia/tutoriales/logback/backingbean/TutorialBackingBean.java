package com.autentia.tutoriales.logback.backingbean;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@ManagedBean(name = "tutorialBackingBean")
@ViewScoped
public class TutorialBackingBean implements Serializable {

    private static final Logger LOG = LoggerFactory.getLogger(TutorialBackingBean.class);
    private List<String> itemList;
    private String item;

    public TutorialBackingBean() {
        this.itemList = new ArrayList<String>();
    }

    public void addItem() {

        LOG.info("He llegado!!!");

        if(item != null) {
            itemList.add(item);
        }

    }

    public List<String> getItemList() {
        return itemList;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }
}
