package com.shpitc.driveshare.client.factory;

import com.google.gwt.inject.client.AsyncProvider;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.inject.Inject;
import com.gwtplatform.mvp.client.PresenterWidget;


public class  PresenterWidgetFactory<H extends PresenterWidget<?>> implements IPresenterWidgetFactory<H>{

          private final AsyncProvider<H> myPwProvider;
          private H result;
          
          @Inject 
          public PresenterWidgetFactory(AsyncProvider<H> myPwProvider) {
            this.myPwProvider = myPwProvider;
          }

         
          public H create() {
                   System.out.println("HELLO HOW ARE YOU");
                  myPwProvider.get(new AsyncCallback<H>() {
             
                
                public void onSuccess(H myPw) {
                 
                  result=myPw;
               
              }
              public void onFailure(Throwable ex) {
              
                  throw new PresenterWidgetFactoryCreationException("Could not create widget of type " + result.getClass().getName());
              }
            } );
            return result;
          }
        
        
}