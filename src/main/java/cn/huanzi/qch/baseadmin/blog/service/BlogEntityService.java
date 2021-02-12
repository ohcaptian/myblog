package cn.huanzi.qch.baseadmin.blog.service;/**
 * @author 17694
 * @date 2021/02/12
 **/

import cn.huanzi.qch.baseadmin.blog.pojo.BlogEntity;
import cn.huanzi.qch.baseadmin.common.pojo.PageInfo;
import cn.huanzi.qch.baseadmin.common.pojo.Result;
import cn.huanzi.qch.baseadmin.common.service.CommonService;
import cn.huanzi.qch.baseadmin.common.service.CommonServiceImpl;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName : BlogEntityService 
 * @Description :   
 */
@Service
public class BlogEntityService implements CommonService<BlogEntity,BlogEntity,Long> {

    @Override
    public Result<PageInfo<BlogEntity>> page(BlogEntity entityVo) {
        return null;
    }

    @Override
    public Result<List<BlogEntity>> list(BlogEntity entityVo) {
        return null;
    }

    @Override
    public Result<BlogEntity> get(Long id) {
        return null;
    }

    @Override
    public Result<BlogEntity> save(BlogEntity entityVo) {
        return null;
    }

    @Override
    public Result<Long> delete(Long id) {
        return null;
    }
}
