package cn.huanzi.qch.baseadmin.blog.dao;

import cn.huanzi.qch.baseadmin.blog.pojo.BlogEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 17694
 * @date 2021/02/11
 **/
@Repository
public interface BlogEntityDao extends JpaRepository<BlogEntity,Long> {

}
