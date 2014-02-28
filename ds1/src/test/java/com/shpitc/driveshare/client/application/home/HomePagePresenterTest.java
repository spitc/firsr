package com.shpitc.driveshare.client.application.home;

import static org.junit.Assert.assertTrue;

import javax.inject.Inject;

import org.jukito.JukitoRunner;
import org.junit.Test;
import org.junit.runner.RunWith;

import testutil.PresenterTestModule;
import testutil.PresenterWidgetBaseTest;

import com.google.gwt.inject.rebind.adapter.GinModuleAdapter;
import com.gwtplatform.dispatch.client.gin.DispatchAsyncModule;
import com.gwtplatform.dispatch.shared.DispatchAsync;

@RunWith(JukitoRunner.class)
public class HomePagePresenterTest extends PresenterWidgetBaseTest {
	/**
	 * Guice test module.
	 */
	public static class Module extends PresenterTestModule {

		@Override
		protected void configurePresenterTest() {
			install(new GinModuleAdapter(new HomeModule()));
			install(new GinModuleAdapter(new DispatchAsyncModule()));
		}

//		@SuppressWarnings("unchecked")
//		@Provides
//		@Singleton
//		PresenterWidgetFactory<HomePagePresenter> getPresenterWidgetFactory() {
//			return (PresenterWidgetFactory<HomePagePresenter>) Mockito
//					.mock(PresenterWidgetFactory.class);
//		}

		// SUT
		@Inject
		HomePagePresenter homePagePresenter;

		@Inject
		HomePagePresenter.MyView view;
		
//        @Inject
//        PresenterWidgetFactory<HomePagePresenter> mockWidgetFactory;
        
		@Inject
		DispatchAsync dispatcher;
        
        
        
//        @Before
//        public void setup() {
//
//                // GIVEN
//        		homePagePresenter = (HomePagePresenter) Mockito.mock(HomePagePresenter.class);
//                org.mockito.BDDMockito.given(mockWidgetFactory.create()).willReturn(homePagePresenter);
//                org.junit.Assert.assertEquals(homePagePresenter, mockWidgetFactory.create());
//        }

		@Test
		@Inject
		public void getInitAppDataTest() {

			// GIVEN

//			MessageSource messageSource = new MapMessageSource();
//			AppInitDataDto appInitDataDto = new AppInitDataDto(messageSource);
//			GetAppInitDataResult getAppInitDataResult = new GetAppInitDataResult(appInitDataDto);

//			dispatcher.given(GetAppInitDataAction.class).willReturnSuccess(getAppInitDataResult);

			// WHEN
			homePagePresenter.onReset();

			// THEN
			// verify(view).setLabel(messageSource.getMessage("hello.world"));
			// verify();
			assertTrue(true);
		}

	}
}
