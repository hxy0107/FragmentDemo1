package com.hxy.app.model;

import android.app.ListFragment;
import android.os.Bundle;
import android.widget.ArrayAdapter;

/**
 * Created by Administrator on 2015/1/26.
 */
public class ListFrag extends ListFragment {
    private Callbacks mCallbacks;
    public interface Callbacks
    {
        public void onItemSelected(Integer id);
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setListAdapter(new ArrayAdapter<BookContent.Book>(getActivity(),
                android.R.layout.simple_list_item_activated_1,
                android.R.id.text1,BookContent.bookList));
    }
}
