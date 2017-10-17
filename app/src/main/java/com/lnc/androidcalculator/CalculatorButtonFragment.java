package com.lnc.androidcalculator;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class CalculatorButtonFragment extends Fragment implements View.OnClickListener {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        return inflater.inflate(R.layout.calculator_button_fragment, container, false);
    }

    @Override
    public void onClick(View view) {
        ICalculatorFragmentCoordinator activity = (ICalculatorFragmentCoordinator) getActivity();
        Button button = view.findViewById(R.id.calculationResult);
        activity.onButtonClicked(button.getText().toString());
    }
}
