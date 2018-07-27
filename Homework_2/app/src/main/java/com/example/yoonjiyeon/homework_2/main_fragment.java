package com.example.yoonjiyeon.homework_2;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class main_fragment extends Fragment{

    public main_fragment() {

    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup parentViewGroup, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.main_fragment, parentViewGroup, false);
        return view;
    }
}
