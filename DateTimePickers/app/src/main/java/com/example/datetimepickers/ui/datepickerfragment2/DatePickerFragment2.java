package com.example.datetimepickers.ui.datepickerfragment2;

import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.datetimepickers.R;

public class DatePickerFragment2 extends Fragment {

    private DatePickerFragment2ViewModel mViewModel;

    public static DatePickerFragment2 newInstance() {
        return new DatePickerFragment2();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.date_picker_fragment2_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(DatePickerFragment2ViewModel.class);
        // TODO: Use the ViewModel
    }

}
