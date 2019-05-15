package cn.stu.cusview.ruiz.databindingsample;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.stu.cusview.ruiz.databindingsample.databinding.ActivityMainBinding;
import cn.stu.cusview.ruiz.databindingsample.modle.User;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";
    
    ActivityMainBinding activityMainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        activityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User();
        user.setName("Ruiz");
        user.setPassword("123456");
        activityMainBinding.setUserInfo(user);
    }
    /**在布局中的绑定不存在时可以赋值成功{@link ActivityMainBinding}
     activityMainBinding.userNameTv.setText("GG");
     */



    @Override
    protected void onResume() {
        super.onResume();
    }
}
