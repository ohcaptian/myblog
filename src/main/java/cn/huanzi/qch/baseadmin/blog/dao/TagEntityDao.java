package cn.huanzi.qch.baseadmin.blog.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * @author 17694
 * @date 2021/02/12
 **/
@Repository
public interface TagEntityDao extends JpaRepository<TagEntityDao,Long> {
}
