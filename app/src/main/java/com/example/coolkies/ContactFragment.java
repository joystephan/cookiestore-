package com.example.coolkies;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class ContactFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_contact, container, false);

        // Initialize form fields and submit button
        EditText emailField = view.findViewById(R.id.contact_email);
        EditText messageField = view.findViewById(R.id.contact_message);
        Button submitButton = view.findViewById(R.id.contact_submit);

        // Handle form submission
        submitButton.setOnClickListener(v -> {
            String email = emailField.getText().toString().trim();
            String message = messageField.getText().toString().trim();

            if (email.isEmpty() || message.isEmpty()) {
                Toast.makeText(getContext(), "Please fill in all fields", Toast.LENGTH_SHORT).show();
            } else {
                // Simulate form submission
                Toast.makeText(getContext(), "Thank you! Your message has been sent.", Toast.LENGTH_LONG).show();

                // Clear the form
                emailField.setText("");
                messageField.setText("");
            }
        });

        return view;
    }
}