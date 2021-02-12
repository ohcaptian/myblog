package cn.huanzi.qch.baseadmin.blog.service;/**
 * @author 17694
 * @date 2021/02/12
 **/

import cn.huanzi.qch.baseadmin.blog.pojo.BlogEntity;
import cn.huanzi.qch.baseadmin.blog.pojo.CommentEntity;
import cn.huanzi.qch.baseadmin.common.pojo.PageInfo;
import cn.huanzi.qch.baseadmin.common.pojo.Result;
import cn.huanzi.qch.baseadmin.common.service.CommonService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName : CommentEntityService 
 * @Description :   
 */
@Service
public class CommentEntityService<U, U1, L extends Number> implements CommonService<CommentEntity,CommentEntity,Long> {
    @Override
    public Result<PageInfo<CommentEntity>> page(CommentEntity entityVo) {
        return null;
    }

    @Override
    public Result<List<CommentEntity>> list(CommentEntity entityVo) {
        return null;
    }

    @Override
    public Result<CommentEntity> get(Long id) {
        return null;
    }

    @Override
    public Result<CommentEntity> save(CommentEntity entityVo) {
        return null;
    }

    @Override
    public Result<Long> delete(Long id) {
        return null;
    }
}
