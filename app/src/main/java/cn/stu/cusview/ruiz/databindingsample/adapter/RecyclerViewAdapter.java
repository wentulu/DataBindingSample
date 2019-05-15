package cn.stu.cusview.ruiz.databindingsample.adapter;

import android.content.Context;
import android.databinding.DataBindingUtil;
import android.databinding.ViewDataBinding;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import java.util.List;

import cn.stu.cusview.ruiz.databindingsample.R;

import static cn.stu.cusview.ruiz.databindingsample.BR.userInfo;


public class RecyclerViewAdapter<DATA> extends RecyclerView.Adapter {

    private List<DATA> data;
    private Context mContext;

    public RecyclerViewAdapter(List<DATA> data, Context context) {
        this.data = data;
        mContext = context;
    }

    @Override
    public int getItemCount() {
        return data == null ? 0 : data.size();
    }


    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        ViewDataBinding dataBinding =  DataBindingUtil.inflate(LayoutInflater.from(viewGroup.getContext()), R.layout.itrem_recycler_view,viewGroup,false);
        return new ItemViewHolder(dataBinding);
    }

    @NonNull
    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder itemViewHolder, int i) {
        ItemViewHolder holder = (ItemViewHolder) itemViewHolder;
        holder.getViewDataBinding().setVariable(userInfo,data.get(i));
        holder.getViewDataBinding().executePendingBindings();
    }


    class ItemViewHolder extends RecyclerView.ViewHolder{
        private ViewDataBinding mViewDataBinding;

        public ItemViewHolder(@NonNull ViewDataBinding dataBinding) {
            super(dataBinding.getRoot());
            this.mViewDataBinding = dataBinding;
        }


        public ViewDataBinding getViewDataBinding() {
            return mViewDataBinding;
        }
    }

}
