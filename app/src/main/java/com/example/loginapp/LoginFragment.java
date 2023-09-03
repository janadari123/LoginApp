package com.example.loginapp;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class LoginFragment extends Fragment {

    public LoginFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        // Find the "Sign Up" button in your fragment's layout
        Button signUpButton = view.findViewById(R.id.sign_up_button);

        // Set a click listener on the "Sign Up" button
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Create a new instance of the RegisterFragment
                RegisterFragment registerFragment = new RegisterFragment();

                // Replace the current fragment with the RegisterFragment
                FragmentManager fragmentManager = requireActivity().getSupportFragmentManager();
                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

                fragmentTransaction.addToBackStack(null); // Optional: Add to back stack
                fragmentTransaction.commit();
            }
        });

        return view;
    }
}
