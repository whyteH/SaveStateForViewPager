package com.example.whyte.savestateforviewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Whyte on 2017/6/20.
 */

public class MyFragment extends Fragment {

    private final static String KEY = "key";
    private TextView textView;

    public static MyFragment getInstance(String text) {
        MyFragment myFragment = new MyFragment();
        Bundle bundle = new Bundle();
        bundle.putString(KEY, text);
        myFragment.setArguments(bundle);
        return myFragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.my_fragment, container, false);
        textView = (TextView) view.findViewById(R.id.text);
        textView.setText(getArguments().getString(KEY, "1"));
        return view;
    }

    public String getText() {
        return textView.getText().toString();
    }
}
