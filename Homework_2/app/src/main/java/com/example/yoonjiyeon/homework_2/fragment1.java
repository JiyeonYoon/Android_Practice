package com.example.yoonjiyeon.homework_2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragment1 extends Fragment {

    public fragment1() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup parentViewGroup, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, parentViewGroup, false);
        return view;
    }
}
