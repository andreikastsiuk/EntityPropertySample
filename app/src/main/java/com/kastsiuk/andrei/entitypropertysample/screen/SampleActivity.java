package com.kastsiuk.andrei.entitypropertysample.screen;

import android.os.Bundle;
import android.util.Pair;

import com.kastsiuk.andrei.entitypropertysample.R;
import com.kastsiuk.andrei.entitypropertysample.model.UserEntity;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatTextView;

public class SampleActivity extends AppCompatActivity {

    private AppCompatTextView valueView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        bindViews();
        UserEntity user = getUser();
        List<Pair<String, Object>> properties = user.getProperties();
        displayProperties(properties);
    }

    private void bindViews() {
        valueView = findViewById(R.id.view_value);
    }

    @NonNull
    private UserEntity getUser() {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(1);
        userEntity.setFirstName("Andrei");
        userEntity.setLastName("Kastsiuk");
        userEntity.setAge(26);
        userEntity.setAdmin(true);
        return userEntity;
    }

    private void displayProperties(@NonNull List<Pair<String, Object>> properties) {
        valueView.setText(properties.toString());
    }
}
