package com.example.yoonjiyeon.homework_2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class fragment2 extends Fragment{

    public fragment2() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup parentViewGroup, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, parentViewGroup, false);
        return view;
    }
}
