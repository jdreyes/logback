package com.autentia.tutoriales.logback.backingbean;


import org.junit.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.fail;

public class TutorialBackingBeanTest {

    private TutorialBackingBean tutorialBackingBeanSUT = new TutorialBackingBean();

    @Test
    public void shouldAddItemToList() {

        //given
        final List<String> itemList = tutorialBackingBeanSUT.getItemList();
        final String item = "test";

        //when
        tutorialBackingBeanSUT.setItem(item);
        tutorialBackingBeanSUT.addItem();

        //then
        assertThat(itemList.contains(item), is(true));
    }

    @Test
    public void shouldNotAddItemToListWhenNoItemExists() {

        //given
        final List<String> itemList = tutorialBackingBeanSUT.getItemList();

        //when
        tutorialBackingBeanSUT.setItem(null);
        tutorialBackingBeanSUT.addItem();

        assertThat(itemList.size(),is(0));
    }
}
