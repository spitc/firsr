package com.shpitc.driveshare.client.factory;

import com.gwtplatform.mvp.client.PresenterWidget;

public interface IPresenterWidgetFactory <H extends PresenterWidget<?>> {

        public  H create();
}