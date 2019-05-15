package cn.stu.cusview.ruiz.databindingsample.activity;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.util.Log;

import java.util.ArrayList;
import java.util.List;

import cn.stu.cusview.ruiz.databindingsample.R;
import cn.stu.cusview.ruiz.databindingsample.adapter.RecyclerViewAdapter;
import cn.stu.cusview.ruiz.databindingsample.databinding.ActivityRecyclerViewBinding;
import cn.stu.cusview.ruiz.databindingsample.modle.User;

public class RecyclerViewActivity extends AppCompatActivity {


    private static final String TAG = "RecyclerViewActivity";

    List<User> data = new ArrayList<>();
    ActivityRecyclerViewBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_recycler_view);
        binding.setOnClicks(new ClickPrecenter());


        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        binding.recyclerView.setAdapter(new RecyclerViewAdapter(data, this));
    }


    @Override
    protected void onResume() {
        super.onResume();
        for (int i = 0; i < 10; i++) {
            User user = new User();
            user.setName("name" + i);
            user.setPassword("password      " + i);
            data.add(user);
        }
    }

    int index;

    public class ClickPrecenter {

        public void addOne() {
            Log.e(TAG, "addOne: ");
            User user = new User();
            user.setPassword("New Password " + index);
            user.setName("New Name " + index);
            data.add(user);
            index++;
            binding.recyclerView.getAdapter().notifyDataSetChanged();
        }


        public void addList() {
            Log.e(TAG, "addList: ");
            for (int i = 0; i < 5; i++) {
                User user = new User();
                user.setName("New List NAme " + index);
                user.setPassword("New Password " + index);
                data.add(user);
                index++;
            }

            binding.recyclerView.getAdapter().notifyDataSetChanged();
        }

        public void deleteOne() {
            Log.e(TAG, "deleteOne: ");
            if (data.size() > 0)
                data.remove(0);
            binding.recyclerView.getAdapter().notifyDataSetChanged();
        }

    }
}
