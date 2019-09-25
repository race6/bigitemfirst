package dao;

import domain.Goods;

import java.sql.ResultSet;
import java.util.List;

public interface GoodsDao {
    //查询所有状态正常的商品
    List<Goods> getGoodsList();

    /**
     * 添加一条记录
     * @param goods
     * @return
     */
    int addGoods(Goods goods);

    /**
     * 查询一条记录
     * @return
     */
    Goods queryone(int g_id);

    /**
     * 更新一条记录
     */
    int updateGoods(Goods goods);

    int deleteOne(int g_id);//删除一条


    /**
     * 删除条目
     */
    int deleteGoods(String[] g_id);//删除多条
}
