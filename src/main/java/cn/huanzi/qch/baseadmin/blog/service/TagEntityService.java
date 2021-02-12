package cn.huanzi.qch.baseadmin.blog.service;/**
 * @author 17694
 * @date 2021/02/12
 **/

import cn.huanzi.qch.baseadmin.blog.pojo.CommentEntity;
import cn.huanzi.qch.baseadmin.blog.pojo.TagEntity;
import cn.huanzi.qch.baseadmin.common.pojo.PageInfo;
import cn.huanzi.qch.baseadmin.common.pojo.Result;
import cn.huanzi.qch.baseadmin.common.service.CommonService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName : TagEntityService 
 * @Description :   
 */
@Service
public class TagEntityService implements CommonService<TagEntity,TagEntity,Long> {
    @Override
    public Result<PageInfo<TagEntity>> page(TagEntity entityVo) {
        return null;
    }

    @Override
    public Result<List<TagEntity>> list(TagEntity entityVo) {
        return null;
    }

    @Override
    public Result<TagEntity> get(Long id) {
        return null;
    }

    @Override
    public Result<TagEntity> save(TagEntity entityVo) {
        return null;
    }

    @Override
    public Result<Long> delete(Long id) {
        return null;
    }
}
