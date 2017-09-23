package exrow.zp.zpexrow.ex.adapter.data;

import exrow.zp.zpexrow.ex.adapter.row.ZpExRow;
import exrow.zp.zpexrow.ex.bean.ZpExRowBean;

/**
 * Created by Administrator on 2016/12/9 0009.
 */

public class ZpTest04Data extends ZpExData{

    public ZpTest04Data(ZpExRowBean zpRow) {
        super(ZpExRow.Type.ZP_ROW_04);
        setZpExRowBean(zpRow);
    }
}
