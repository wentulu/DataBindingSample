package cn.stu.cusview.ruiz.databindingsample.activity;

import android.databinding.DataBindingUtil;
import android.databinding.ObservableField;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import cn.stu.cusview.ruiz.databindingsample.R;
import cn.stu.cusview.ruiz.databindingsample.databinding.ActivityEqualBinding;

public class EqualActivity extends AppCompatActivity {

    private static final String TAG = "EqualActivity";

    ActivityEqualBinding mActivityEqualBinding;
    ObservableField<String> name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mActivityEqualBinding = DataBindingUtil.setContentView(this,R.layout.activity_equal);

        name = new ObservableField<>();
        name.set("123");
        mActivityEqualBinding.setText(name);

    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop: "+name.get());
    }
}
