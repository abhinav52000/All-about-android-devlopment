package com.devveloper.myapplicationcode;

import android.content.Context;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragmentclassexample extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        Log.i("Fragment","oncreateview");
        return inflater.inflate(R.layout.new_fragment,container,false);

    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        Log.i("Fragment","on attach");

    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.i("Fragment","on create");

    }

    @Override
    public void onDetach() {
        super.onDetach();
        Log.i("Fragment","on detach");

    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        Log.i("Fragment","on destroy");

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        Log.i("Fragment","on destroy view");

    }

    @Override
    public void onStop() {
        super.onStop();
        Log.i("Fragment","on stop");

    }

    @Override
    public void onStart() {
        super.onStart();
        Log.i("Fragment","on start");

    }

    @Override
    public void onResume() {
        super.onResume();
        Log.i("Fragment","on resume");

    }

    @Override
    public void onPause() {
        super.onPause();
        Log.i("Fragment","on pause");

    }
}

