package exrow.zp.zpexrow.ex.adapter.data;

import exrow.zp.zpexrow.ex.adapter.row.ZpExRow;
import exrow.zp.zpexrow.ex.bean.ZpExRowBean;

/**
 * Created by Administrator on 2016/12/8 0008.
 */

public abstract class ZpExData {

    private ZpExRow.Type  type;

    public ZpExRowBean zpExRowBean;

    protected ZpExData(ZpExRow.Type  type){
        setType(type);
    }

    public ZpExRowBean getZpExRowBean() {
        return zpExRowBean;
    }

    public void setZpExRowBean(ZpExRowBean zpExRowBean) {
        this.zpExRowBean = zpExRowBean;
    }

    protected void setType(ZpExRow.Type type){
     this.type = type;
    }

    public ZpExRow.Type  getType(){
        return type;
    }

}
