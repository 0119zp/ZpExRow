package exrow.zp.zpexrow.ex.activity;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import java.util.ArrayList;
import exrow.zp.zpexrow.R;
import exrow.zp.zpexrow.ex.adapter.ZpRecExRowAdapter;
import exrow.zp.zpexrow.ex.bean.ZpExRowBean;

/**
 * Created by Administrator on 2017/3/28 0028.
 */

public class ZpRecExRowActivity extends FragmentActivity {

    private RecyclerView recyclerView;

    private ArrayList<ZpExRowBean> zpData = new ArrayList<>();  // 假数据集合

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rel_row);

        initData();

        initView();

    }

    private void initView() {

        recyclerView = (RecyclerView) findViewById(R.id.rl_view);

        ZpRecExRowAdapter zpRecExRowAdapter = new ZpRecExRowAdapter(ZpRecExRowActivity.this, zpData);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(zpRecExRowAdapter);

    }

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
