package cn.stu.cusview.ruiz.databindingsample;

import android.databinding.DataBindingUtil;
import android.databinding.Observable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import cn.stu.cusview.ruiz.databindingsample.databinding.CustomBindingNameActBinding;
import cn.stu.cusview.ruiz.databindingsample.modle.ObservableUser;

public class CustomBindingNameActivity extends AppCompatActivity {

    private static final String TAG = "CustomBindingNameActivi";

    CustomBindingNameActBinding binding;
    ObservableUser user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_custom_binding_name);
        user = new ObservableUser();
        user.setName("Custom Binding Name Act");
        binding.setUserInfo(user);
        binding.setClickHandler(new ClickListenerHamdler());
        user.addOnPropertyChangedCallback(new Observable.OnPropertyChangedCallback() {
            @Override
            public void onPropertyChanged(Observable sender, int propertyId) {
                switch (propertyId){
                    case BR.name:
                        Log.e(TAG, "onPropertyChanged: BR.name" );
                        break;
                    case BR.password:
                        Log.e(TAG, "onPropertyChanged: BR.password" );
                        break;
                    case BR._all:
                        Log.e(TAG, "onPropertyChanged: BR_All" );
                        break;
                }
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();

    }

    public class ClickListenerHamdler {

        public void onNameChange() {
            user.setName("修改过的名字");
            Log.e(TAG, "onChangeNameClick: " + user.getName());
        }

        public void onPasswordChange() {
            user.setPassword("修改密码");
            Log.e(TAG, "onPasswordChange: " + user.getPassword());
        }

        public void onAllChange() {
            user.setInfo("修改名字2", "修改密码2");
            Log.e(TAG, "onAllChange: " + user.getName() + "  " + user.getPassword());
        }
    }

}
