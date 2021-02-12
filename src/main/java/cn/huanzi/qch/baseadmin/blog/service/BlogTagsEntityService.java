package cn.huanzi.qch.baseadmin.blog.service;/**
 * @author 17694
 * @date 2021/02/12
 **/

import cn.huanzi.qch.baseadmin.blog.pojo.BlogEntity;
import cn.huanzi.qch.baseadmin.blog.pojo.BlogTagsEntity;
import cn.huanzi.qch.baseadmin.common.pojo.PageInfo;
import cn.huanzi.qch.baseadmin.common.pojo.Result;
import cn.huanzi.qch.baseadmin.common.service.CommonService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName : BlogTagsEntityService 
 * @Description :   
 */
@Service
public class BlogTagsEntityService implements CommonService<BlogTagsEntity,BlogTagsEntity,Long> {
    @Override
    public Result<PageInfo<BlogTagsEntity>> page(BlogTagsEntity entityVo) {
        return null;
    }

    @Override
    public Result<List<BlogTagsEntity>> list(BlogTagsEntity entityVo) {
        return null;
    }

    @Override
    public Result<BlogTagsEntity> get(Long id) {
        return null;
    }

    @Override
    public Result<BlogTagsEntity> save(BlogTagsEntity entityVo) {
        return null;
    }

    @Override
    public Result<Long> delete(Long id) {
        return null;
    }
}
