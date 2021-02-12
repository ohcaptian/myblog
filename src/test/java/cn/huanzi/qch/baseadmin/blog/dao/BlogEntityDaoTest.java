package cn.huanzi.qch.baseadmin.blog.dao;

import cn.huanzi.qch.baseadmin.blog.pojo.BlogEntity;
import lombok.extern.slf4j.Slf4j;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.Test;

import java.util.List;

/**
 * @author 17694
 * @date 2021/02/11
 **/
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@Slf4j
@RunWith(SpringRunner.class)
public class BlogEntityDaoTest {
    @Autowired
    private BlogEntityDao blogEntityDao;
    @Test
    public void findall(){
        List<BlogEntity> all = blogEntityDao.findAll();
        for(BlogEntity blogEntity:all){
            System.out.println(blogEntity);
        }
        }
        @Test
    public void findone(){
            BlogEntity blogEntity = blogEntityDao.findById(1L).get();
            log.info(blogEntity.toString());
        }
}