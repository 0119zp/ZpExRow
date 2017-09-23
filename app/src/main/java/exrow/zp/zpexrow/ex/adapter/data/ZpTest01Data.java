package exrow.zp.zpexrow.ex.adapter.data;

import exrow.zp.zpexrow.ex.adapter.row.ZpExRow;
import exrow.zp.zpexrow.ex.bean.ZpExRowBean;

/**
 * Created by Administrator on 2016/12/8 0008.
 */

public class ZpTest01Data extends ZpExData{

    public ZpTest01Data(ZpExRowBean bean) {
        super(ZpExRow.Type.ZP_ROW_01);
        setZpExRowBean(bean);
    }
}
