package cn.stu.cusview.ruiz.databindingsample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import cn.stu.cusview.ruiz.databindingsample.databinding.ActivityTwoWayBindingBinding;
import cn.stu.cusview.ruiz.databindingsample.modle.User;

public class TwoWayBindingActivity extends AppCompatActivity {
    private static final String TAG = "TwoWayBindingActivity";

    User user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTwoWayBindingBinding bindingBinding = DataBindingUtil.setContentView(this, R.layout.activity_two_way_binding);
        user = new User();
        user.setName("Ruiz");
        bindingBinding.setUser(user);

    }


    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "onStop: " + user.getName());
    }
}
