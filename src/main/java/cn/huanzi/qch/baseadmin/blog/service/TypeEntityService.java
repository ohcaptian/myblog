package cn.huanzi.qch.baseadmin.blog.service;/**
 * @author 17694
 * @date 2021/02/12
 **/

import cn.huanzi.qch.baseadmin.blog.pojo.TagEntity;
import cn.huanzi.qch.baseadmin.blog.pojo.TypeEntity;
import cn.huanzi.qch.baseadmin.common.pojo.PageInfo;
import cn.huanzi.qch.baseadmin.common.pojo.Result;
import cn.huanzi.qch.baseadmin.common.service.CommonService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName : TypeEntityService 
 * @Description :   
 */
@Service
public class TypeEntityService implements CommonService<TypeEntity,TypeEntity,Long> {
    @Override
    public Result<PageInfo<TypeEntity>> page(TypeEntity entityVo) {
        return null;
    }

    @Override
    public Result<List<TypeEntity>> list(TypeEntity entityVo) {
        return null;
    }

    @Override
    public Result<TypeEntity> get(Long id) {
        return null;
    }

    @Override
    public Result<TypeEntity> save(TypeEntity entityVo) {
        return null;
    }

    @Override
    public Result<Long> delete(Long id) {
        return null;
    }
}
