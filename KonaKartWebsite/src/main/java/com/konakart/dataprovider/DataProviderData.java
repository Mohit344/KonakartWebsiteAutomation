package com.konakart.dataprovider;





import org.testng.annotations.DataProvider;

import com.konakart.constant.FileConstant;
import com.konakart.util.ProviderData;

public class DataProviderData {

	
	/**
	 * Data provider 1
	 * @return
	 */
		@DataProvider(name ="testdata" )
		public Object[][] getDataOne() {
			ProviderData provideData = new ProviderData(FileConstant.testdata);
			Object[][] getData = provideData.provideData();
			return getData;
		}
	
		
		/**moreinfotestdata
		 * data provider 2
		 * @return
		 */
		@DataProvider(name = "testdatasecond")
		public Object[][] getDataSecond() {
			ProviderData provideData = new ProviderData(FileConstant.testdatasecond);
			Object[][] getData = provideData.provideData();
			return getData;
		}
		
		/**
		 * Data provider 3
		 * @return
		 */
			@DataProvider(name = "testdatathird")
			public Object[][] getDataThird() {
				ProviderData provideData = new ProviderData(FileConstant.testthird);
				Object[][] getData = provideData.provideData();
				return getData;
			}
//		
//			/**
//			 * Data provider 4
//			 * @return
//			 */
//				@DataProvider(name = "testdata4")
//				public Object[][] getDataForth() {
//					ProviderData provideData = new ProviderData(FileConstant.testdata4);
//					Object[][] getData = provideData.provideData();
//					return getData;
//				}
//		
//		
//		
		
}
