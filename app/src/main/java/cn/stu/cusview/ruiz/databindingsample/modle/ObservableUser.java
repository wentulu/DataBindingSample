package cn.stu.cusview.ruiz.databindingsample.modle;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import cn.stu.cusview.ruiz.databindingsample.BR;

public class ObservableUser extends BaseObservable {

    @Bindable
    public String name;

    private String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
        notifyPropertyChanged(BR.password);
    }

    public void setInfo(String userName,String password){
        this.name = userName;
        this.password = password;
        notifyChange();
    }

}
