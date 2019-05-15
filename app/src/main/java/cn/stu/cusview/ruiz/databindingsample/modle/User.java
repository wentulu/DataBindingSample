package cn.stu.cusview.ruiz.databindingsample.modle;

import android.databinding.BaseObservable;
import android.databinding.Bindable;

import cn.stu.cusview.ruiz.databindingsample.BR;

public class User extends BaseObservable {

    private String name;

    private String password;

    private String imgUrl;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Bindable
    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
        notifyPropertyChanged(BR.imgUrl);
    }
}
