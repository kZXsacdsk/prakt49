package com.example.prakt49.presenter;

import com.example.prakt49.model.DataModel;
import com.example.prakt49.observer.DataSubject;
import com.example.prakt49.view.MainView;

public class MainPresenter {
    private MainView view;
    private DataModel model;
    private DataSubject subject;

    public MainPresenter(MainView view) {
        this.view = view;
        this.model = new DataModel();
        this.subject = new DataSubject();
        subject.addObserver(view);
    }

    public void init() {
        model.setData("Приветственные данные");
        subject.setData(model.getData());
    }

    public void updateData(String newData) {
        model.setData(newData);
        subject.setData(model.getData());
    }
}
