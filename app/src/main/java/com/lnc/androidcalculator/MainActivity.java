package com.lnc.androidcalculator;

import android.app.FragmentManager;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements ICalculatorFragmentCoordinator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        addButtonFragmentsToLayout();
    }

//    private void addButtonFragmentsToLayout() {
//        for(String buttonValue : getResources().getStringArray(R.array.calculator_button_values)) {
//            CalculatorButtonFragment fragment = new CalculatorButtonFragment(buttonValue);
//            LinearLayout layout = getCurrentOrAddHorizontalLinearLayout();
//            layout.addView()
//        }
//    }

    @Override
    public void onButtonClicked(String buttonValue) {
        // Get the button index from the collection of buttons
        // Find the text of the button
        // Update the result text on the screen fragment

        FragmentManager fragmentManager = getFragmentManager();
        CalculatorScreenFragment screenFragment = (CalculatorScreenFragment) fragmentManager.findFragmentById(R.id.calculatorScreenFragment);
        screenFragment.updateScreenValue(buttonValue);
    }
}
