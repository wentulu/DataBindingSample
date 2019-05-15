package cn.stu.cusview.ruiz.databindingsample.view;

import android.content.Context;
import android.databinding.BindingMethod;
import android.databinding.BindingMethods;
import android.support.annotation.Nullable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.widget.TextView;
import android.widget.Toast;

@BindingMethods({@BindingMethod(type = TextView.class,attribute = "showToast",method = "showToastInfo")})
public class MyTextView extends TextView {


    public MyTextView(Context context) {
        super(context);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public MyTextView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    public void showToastInfo(String s){
        if (TextUtils.isEmpty(s))
            return;

        Toast.makeText(getContext(),s,Toast.LENGTH_SHORT).show();
    }
}
