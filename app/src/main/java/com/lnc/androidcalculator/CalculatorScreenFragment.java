package com.lnc.androidcalculator;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class CalculatorScreenFragment extends Fragment {

    TextView _textView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View fragmentView = inflater.inflate(R.layout.calculator_screen_fragment, container, false);

        _textView = fragmentView.findViewById(R.id.result_value);

        return fragmentView;
    }

    public void updateScreenValue(String value) {
        _textView.setText(value);
    }
}

