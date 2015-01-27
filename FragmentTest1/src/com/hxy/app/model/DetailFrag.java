package com.hxy.app.model;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.hxy.FragmentTest.R;

/**
 * Created by Administrator on 2015/1/26.
 */
public class DetailFrag extends Fragment{
    public static final String Item_id="item_id";
    BookContent.Book book;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if(getArguments().containsKey(Item_id)){
            book=BookContent.bookMap.get(getArguments().getInt(Item_id));
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView=inflater.inflate(R.layout.fragment_book_detail,container,false);
        if(book!=null){
            ((TextView)rootView.findViewById(R.id.book_title)).setText(book.title);
            ((TextView)rootView.findViewById(R.id.book_detail)).setText(book.detail);
        }
        return rootView;
    }
}
