package com.bryonnicoson.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.bryonnicoson.fragment.dummy.DummyContent;
import com.bryonnicoson.fragment.dummy.DummyContent.DummyItem;

import java.util.List;

public class DogFragment extends Fragment {
    public static DogFragment newInstance() {
        DogFragment fragment = new DogFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_dog, container, false);
    }
}
