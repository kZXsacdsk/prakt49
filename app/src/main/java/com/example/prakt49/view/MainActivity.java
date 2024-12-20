package com.example.prakt49.view;

import android.os.Bundle;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import com.example.prakt49.presenter.MainPresenter;
import com.example.prakt49.observer.Observer;
import com.example.prakt49.R;

public class MainActivity extends AppCompatActivity implements MainView, Observer {
    private TextView dataTextView;
    private MainPresenter presenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dataTextView = findViewById(R.id.dataTextView);

        presenter = new MainPresenter(this);
        presenter.init();
        presenter.updateData("Исходные данные");
    }

    @Override
    public void displayData(String data) {
        dataTextView.setText(data);
    }

    @Override
    public void update(String data) {
        displayData(data);
    }
}
