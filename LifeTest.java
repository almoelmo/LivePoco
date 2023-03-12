package org.example;

import org.example.bean.Leaf;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = {App.class})
public class LifeTest {

    @Autowired
    private Leaf leaf;

    //контекст приложения
    @Autowired
    private ApplicationContext ctx;

    @Test
    public void testLife() {
        String s = leaf.toString();
        Assert.assertEquals("Листик съел жучок,жучка съела птичка,птичку съел паук,паука съела змея," +
                        "змею съел мангуст,мангуста съел леопард,леопард живёт - поживает!", s);
    }

    @Test
    public void getFromContext(){
        //получение бина из контекста
        Leaf l = ctx.getBean(Leaf.class);
        Assert.assertEquals("Листик съел жучок,жучка съела птичка,птичку съел паук,паука съела змея," +
                "змею съел мангуст,мангуста съел леопард,леопард живёт - поживает!", l.toString());
    }
}
