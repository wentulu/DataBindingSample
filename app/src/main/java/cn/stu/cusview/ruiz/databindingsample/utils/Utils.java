package cn.stu.cusview.ruiz.databindingsample.utils;

import android.databinding.BindingAdapter;
import android.databinding.InverseBindingAdapter;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.Priority;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;

import cn.stu.cusview.ruiz.databindingsample.R;

public class Utils {

    @BindingAdapter(value = {"imgUrl"},requireAll = false)
    public static void loadImg(ImageView imageView ,String Url){
        RequestOptions requestOptions = new RequestOptions()
                .centerCrop()
                .placeholder(R.mipmap.ic_launcher)
                .error(R.mipmap.ic_launcher_round)
                .priority(Priority.HIGH)
                .diskCacheStrategy(DiskCacheStrategy.NONE);
        Glide.with(imageView.getContext()).applyDefaultRequestOptions(requestOptions).load(Url).into(imageView);
    }

    public static String passwordNum(String s){
        return "********";
    }

}
