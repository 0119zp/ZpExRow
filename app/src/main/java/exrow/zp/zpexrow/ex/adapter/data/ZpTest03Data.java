package exrow.zp.zpexrow.ex.adapter.data;

import exrow.zp.zpexrow.ex.adapter.row.ZpExRow;
import exrow.zp.zpexrow.ex.bean.ZpExRowBean;

/**
 * Created by Administrator on 2016/12/9 0009.
 */

public class ZpTest03Data extends ZpExData{

    public ZpTest03Data(ZpExRowBean zpRow) {
        super(ZpExRow.Type.ZP_ROW_03);
        setZpExRowBean(zpRow);
    }
}
