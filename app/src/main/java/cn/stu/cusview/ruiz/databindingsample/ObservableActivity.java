package cn.stu.cusview.ruiz.databindingsample;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableArrayList;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableMap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import cn.stu.cusview.ruiz.databindingsample.databinding.ActivityObservableBinding;

public class ObservableActivity extends AppCompatActivity {

    ActivityObservableBinding databinding;
    ObservableArrayList<String> arrayList;
    ObservableMap<String, String> map;
    int index = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        databinding = DataBindingUtil.setContentView(this, R.layout.activity_observable);
        arrayList = new ObservableArrayList<>();
        arrayList.add("0");
        arrayList.add("0");
        arrayList.add("0");
        databinding.setList(arrayList);
        map = new ObservableArrayMap<>();
        map.put("name", "000");
        map.put("password", "000000");
        databinding.setMap(map);
//        databinding.setName("name");
//        databinding.setPassword("password");
    }


    public void onMapChangeClick(View view) {

        index++;
        map.put("name",""+index);
        map.put("password",""+index+""+index+""+index+""+index);
    }

    public void onListChangeClick(View view) {
        index++;
        for (int i=0; i<arrayList.size();i++){
            arrayList.set(i,""+index);
        }
    }


}
