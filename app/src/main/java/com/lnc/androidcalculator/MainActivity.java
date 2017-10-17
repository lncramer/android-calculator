package com.lnc.androidcalculator;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements ICalculatorFragmentCoordinator {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        addButtonFragmentsToLayout();
    }

    private void addButtonFragmentsToLayout() {
        for(String buttonValue : getResources().getStringArray(R.array.calculator_button_values)) {
//            CalculatorButtonFragment fragment = new CalculatorButtonFragment();
            LinearLayout layout = getCurrentOrAddHorizontalLinearLayout();
            addFragmentToLayout(layout, buttonValue);

//            fragment.setButtonValue(buttonValue);
        }
    }

    private void addFragmentToLayout(LinearLayout layout, String buttonValue) {

        FragmentManager fragmentManager = getFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.add(layout.getId(), new CalculatorButtonFragment());
        fragmentTransaction.commit();

//        CalculatorButtonFragment createdFragment = fragmentManager
    }

    private LinearLayout getCurrentOrAddHorizontalLinearLayout() {
        // for now just always create a new one
        LinearLayout layout = new LinearLayout(this);
        LinearLayout containerLayout = findViewById(R.id.calculatorButtonContainer);
        containerLayout.addView(layout);
        return layout;
    }

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
