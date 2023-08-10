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

public class FragmentVatican extends Fragment {

    public static FragmentVatican newInstance()
    {
        return new FragmentVatican();
    }

    private ImageView imageViewVatican;
    private ProgressBar progressBarVatican;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_vatican,container,false);

        imageViewVatican =view.findViewById(R.id.imageViewpyramid);
        progressBarVatican = view.findViewById(R.id.progressBarpyramid);

        Picasso.get().load("https://upload.wikimedia.org/wikipedia/commons/thumb/5/5b/Vatican_Museums_Spiral_Staircase_2012.jpg/1280px-Vatican_Museums_Spiral_Staircase_2012.jpg")
                .into(imageViewVatican, new Callback() {
                    @Override
                    public void onSuccess() {
                        progressBarVatican.setVisibility(View.INVISIBLE);
                    }

                    @Override
                    public void onError(Exception e) {

                        Toast.makeText(getActivity(), e.getLocalizedMessage(), Toast.LENGTH_SHORT).show();
                        progressBarVatican.setVisibility(View.INVISIBLE);
                    }
                });

        return view;
    }
}
