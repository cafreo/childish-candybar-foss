package com.cafreo.childish.activities;

import androidx.annotation.NonNull;

import candybar.lib.activities.CandyBarMainActivity;

import com.cafreo.childish.licenses.License;

public class MainActivity extends CandyBarMainActivity {

    @NonNull
    @Override
    public ActivityConfiguration onInit() {
        return new ActivityConfiguration();
    }
}
