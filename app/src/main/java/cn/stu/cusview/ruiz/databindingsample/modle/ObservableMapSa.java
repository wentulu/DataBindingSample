package cn.stu.cusview.ruiz.databindingsample.modle;

import android.databinding.BaseObservable;
import android.databinding.ObservableArrayMap;
import android.databinding.ObservableField;
import android.databinding.ObservableInt;
import android.databinding.ObservableMap;

public class ObservableMapSa extends BaseObservable {


    public final ObservableInt id = new ObservableInt();
    public final ObservableMap<String,String> map = new ObservableArrayMap<>();
    public final ObservableField<String> current = new ObservableField<>();

}
