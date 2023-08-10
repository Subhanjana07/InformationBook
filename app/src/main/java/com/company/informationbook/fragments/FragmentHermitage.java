package com.company.informationbook.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.company.informationbook.R;
import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

public class FragmentHermitage extends Fragment {

    public static FragmentHermitage newInstance()
    {
        return new FragmentHermitage();
    }

    private ImageView imageViewHermitage;
    private ProgressBar progressBarHermitage;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_hermitage,container,false);

        imageViewHermitage =view.findViewById(R.id.imageViewpyramid);
        progressBarHermitage = view.findViewById(R.id.progressBarpyramid);

        Picasso.get().load("https://cdn.britannica.com/39/117239-050-9315F482/Hermitage-St-Petersburg.jpg")
                .into(imageViewHermitage, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarHermitage.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarHermitage.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}
