package cn.huanzi.qch.baseadmin.blog.service;/**
 * @author 17694
 * @date 2021/02/12
 **/

import cn.huanzi.qch.baseadmin.blog.pojo.UserEntity;
import cn.huanzi.qch.baseadmin.common.pojo.PageInfo;
import cn.huanzi.qch.baseadmin.common.pojo.Result;
import cn.huanzi.qch.baseadmin.common.service.CommonService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName : UserEntityService 
 * @Description :   
 */
@Service
public class UserEntityService implements CommonService<UserEntity,UserEntity,Long> {
    @Override
    public Result<PageInfo<UserEntity>> page(UserEntity entityVo) {
        return null;
    }

    @Override
    public Result<List<UserEntity>> list(UserEntity entityVo) {
        return null;
    }

    @Override
    public Result<UserEntity> get(Long id) {
        return null;
    }

    @Override
    public Result<UserEntity> save(UserEntity entityVo) {
        return null;
    }

    @Override
    public Result<Long> delete(Long id) {
        return null;
    }
}
