package com.ellen.jetpackstudy.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.databinding.DataBindingUtil;
import androidx.recyclerview.widget.RecyclerView;

import com.ellen.jetpackstudy.R;
import com.ellen.jetpackstudy.bean.Book;
import com.ellen.jetpackstudy.databinding.ItemTestLayoutBinding;

import java.util.List;

public class TestRecyclerViewAdapter extends RecyclerView.Adapter<TestRecyclerViewAdapter.TestViewHolder> {

    private List<Book> bookList;

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public TestRecyclerViewAdapter(List<Book> bookList){
        this.bookList = bookList;
    }

    @NonNull
    @Override
    public TestViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        ItemTestLayoutBinding itemTestLayoutBinding =
                DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), R.layout.item_test_layout,parent,false);
        return new TestViewHolder(itemTestLayoutBinding);
    }

    @Override
    public void onBindViewHolder(@NonNull TestViewHolder holder, int position) {
        Book book = bookList.get(position);
        holder.itemTestLayoutBinding.setBook(book);
    }

    @Override
    public int getItemCount() {
        return bookList.size();
    }

    static class TestViewHolder extends RecyclerView.ViewHolder{
        private ItemTestLayoutBinding itemTestLayoutBinding;
        public TestViewHolder(@NonNull  ItemTestLayoutBinding itemTestLayoutBinding) {
            super(itemTestLayoutBinding.getRoot());
            this.itemTestLayoutBinding = itemTestLayoutBinding;
        }
    }
}
