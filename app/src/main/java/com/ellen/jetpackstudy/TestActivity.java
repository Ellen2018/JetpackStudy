package com.ellen.jetpackstudy;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;

import androidx.annotation.Nullable;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.ellen.jetpackstudy.adapter.TestRecyclerViewAdapter;
import com.ellen.jetpackstudy.databinding.ActivityTestBinding;

public class TestActivity extends Activity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityTestBinding activityTestBinding = DataBindingUtil.setContentView(this,R.layout.activity_test);

        activityTestBinding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        activityTestBinding.recyclerView.setHasFixedSize(true);



        TestRecyclerViewAdapter testRecyclerViewAdapter = new TestRecyclerViewAdapter(new TestViewModel().getBooks());

        activityTestBinding.recyclerView.setAdapter(testRecyclerViewAdapter);

        activityTestBinding.bt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 testRecyclerViewAdapter.getBookList().get(0).setContent("逗比");
                 testRecyclerViewAdapter.notifyDataSetChanged();
            }
        });

    }
}
