package health.service;

import health.entity.PageResult;
import health.entity.QueryPageBean;
import health.pojo.Setmeal;

public interface SetmealService {
    public void add(Setmeal setmeal, Integer[] checkgroupIds);
    public PageResult pageQuery(QueryPageBean queryPageBean);
}
