package cn.stu.cusview.ruiz.databindingsample.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import cn.stu.cusview.ruiz.databindingsample.R;
import cn.stu.cusview.ruiz.databindingsample.databinding.ActivityObservableMapBinding;
import cn.stu.cusview.ruiz.databindingsample.modle.ObservableMapSa;

public class ObservableMapActivity extends AppCompatActivity {

    ActivityObservableMapBinding mActivityObservableMapBinding;
    ObservableMapSa mapSa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityObservableMapBinding = DataBindingUtil.setContentView(this,R.layout.activity_observable_map);

        mapSa = new ObservableMapSa();
        mActivityObservableMapBinding.setInfo(mapSa);

        mapSa.id.set(0);
        mapSa.current.set("normal");
        mapSa.map.put("normal","Normal aa");
        mapSa.map.put("high","High aa");
    }


    public void onRefresh(View view){
        mapSa.id.set(1);
        mapSa.current.set("high");
    }
}
