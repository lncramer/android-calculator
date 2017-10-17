package com.lnc.androidcalculator;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class CalculatorButtonFragment extends Fragment implements View.OnClickListener {

    Button _button;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.calculator_button_fragment, container, false);

        _button = view.findViewById(R.id.calculator_button);
        _button.setOnClickListener(this);

        return view;
    }

    public void setButtonValue(String text) {
        _button.setText(text);
    }

    @Override
    public void onClick(View view) {
        ICalculatorFragmentCoordinator activity = (ICalculatorFragmentCoordinator) getActivity();
        activity.onButtonClicked(_button.getText().toString());
    }
}
