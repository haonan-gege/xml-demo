package com.mybatis.xmldemo.mapper;

import com.mybatis.xmldemo.model.Message;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


@Slf4j
@SpringBootTest
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class MessageMapperTest {
    @Autowired
    private MessageMapper messageMapper;

    @Test
    @Order(1)
    public void testInsert(){
        //1.模拟数据
        Message msg=Message.builder().msgText("桃花").msgSummary("春天").build();
        int num=messageMapper.insert(msg);
        log.info("插入的数据数：{}",num);

    }

//    @Test
//    public void testSelectA(){
//       List<Message> msgs = messageMapper.selectAll();
//       if(msgs==null){
//           log.errorr("MSG为null");
//       }
//       msgs.forEach(msg -> log.info("查询到的记录：{}",msg));
//    }

//    @Test
//    @Order(4)
//    public void testUpdate(){
//        Message message = Message.bulider().msgId(1).msgText("computer").msgText("学校").build();
//        int num = messageMapper.update(message);
//        log.info("更新的数据头条：{}",num);
//    }

////    @Test
////    @Order(5)
//    public void testUpdateText(){
//        Message message = Message.bulider().msgId(2).msgText("computer").msgSummary("").build();
//        int num = messageMapper.updateText(message);
//        log.info("更新Text的数据条：{}",num);
//    }


//    @Test
//    @Order(7)
//    public void testDelete(){
//        int num = messageMapper.delete(1);
//        log.info("删除的数据条数：{}",num);
//    }


}
