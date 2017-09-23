package exrow.zp.zpexrow.ex.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentActivity;
import android.view.Window;
import android.widget.ListView;

import java.util.ArrayList;

import exrow.zp.zpexrow.R;
import exrow.zp.zpexrow.ex.adapter.ZpExRowAdapter;
import exrow.zp.zpexrow.ex.bean.ZpExRowBean;

/**
 * Created by Administrator on 2016/12/8 0008.
 */

public class ZpExRowActivity extends FragmentActivity{

    private ListView zpExRow;       // 异形列表
    private ArrayList<ZpExRowBean> zpData = new ArrayList<>();  // 假数据集合

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_zp_exrow);

        // 假数据
        initData();
        // 初始化listView
        initView();
    }

    private void initView() {

        zpExRow = (ListView) findViewById(R.id.zp_lv_row);
        ZpExRowAdapter zpExRowAdapter = new ZpExRowAdapter(ZpExRowActivity.this, zpData);
        zpExRow.setAdapter(zpExRowAdapter);
    }


    ////////////////////////// 假数据制造专区 /////////////////////////////////

    private void initData() {

        // 数据防护
        if (zpData != null && zpData.size() > 0){
            zpData.clear();
        }

        // 制造假数据
        for (int i = 0 ; i < 20 ; i++){
            ZpExRowBean zpExRowBean = new ZpExRowBean();
            if (i%4 == 0){
                zpExRowBean.setColorId(R.color.zp_Row_01);
                zpExRowBean.setItem("**第一个****");
                zpExRowBean.setType(1);
                zpData.add(zpExRowBean);
            }else if (i%4 == 1){
                zpExRowBean.setColorId(R.color.zp_Row_02);
                zpExRowBean.setItem("******第二个****");
                zpExRowBean.setType(2);
                zpData.add(zpExRowBean);
            }else if (i%4 == 2){
                zpExRowBean.setColorId(R.color.zp_Row_03);
                zpExRowBean.setItem("***********第三个****");
                zpExRowBean.setType(3);
                zpData.add(zpExRowBean);
            }else if (i%4 == 3){
                zpExRowBean.setColorId(R.color.zp_Row_04);
                zpExRowBean.setItem("******************第四个****");
                zpExRowBean.setType(4);
                zpData.add(zpExRowBean);
            }
        }

    }


}
