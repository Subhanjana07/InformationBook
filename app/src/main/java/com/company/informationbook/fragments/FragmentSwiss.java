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

public class FragmentSwiss extends Fragment {

    public static FragmentSwiss newInstance()
    {
        return new FragmentSwiss();
    }

    private ImageView imageViewSwiss;
    private ProgressBar progressBarSwiss;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_switzerland,container,false);

        imageViewSwiss =view.findViewById(R.id.imageViewpyramid);
        progressBarSwiss = view.findViewById(R.id.progressBarpyramid);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/0/08/Flag_of_Switzerland_%28Pantone%29.svg/800px-Flag_of_Switzerland_%28Pantone%29.svg.png")
                .into(imageViewSwiss, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarSwiss.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarSwiss.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}
