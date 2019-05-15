package cn.stu.cusview.ruiz.databindingsample.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import cn.stu.cusview.ruiz.databindingsample.R;
import cn.stu.cusview.ruiz.databindingsample.databinding.ActivityBindAdapterBinding;
import cn.stu.cusview.ruiz.databindingsample.modle.User;

public class BindAdapterActivity extends AppCompatActivity {

    ActivityBindAdapterBinding mActivityBindAdapterBinding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

       mActivityBindAdapterBinding = DataBindingUtil.setContentView(this,R.layout.activity_bind_adapter);

        User user = new User();
        mActivityBindAdapterBinding.setUser(user);
        user.setImgUrl("https://www.dhresource.com/260x260/f2/albu/g2/M00/19/A1/rBVaGlRQcbeAQAXbAAD419nxTaQ253.jpg");
    }
}
