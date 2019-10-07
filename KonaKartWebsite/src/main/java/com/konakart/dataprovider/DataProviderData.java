package com.konakart.dataprovider;





import org.testng.annotations.DataProvider;

import com.konakart.constant.FileConstant;
import com.konakart.util.ProviderData;

public class DataProviderData {

	
	/**
	 * Data provider 1
	 * @return
	 */
		@DataProvider(name ="positiveScenario" )
		public Object[][] getDataOne() {
			ProviderData provideData = new ProviderData(FileConstant.positiveScenario);
			Object[][] getData = provideData.provideData();
			return getData;
		}
	
		
		/**moreinfotestdata
		 * data provider 2
		 * @return
		 */
		@DataProvider(name = "negativeScenario")
		public Object[][] getDataSecond() {
			ProviderData provideData = new ProviderData(FileConstant.negativeScenario);
			Object[][] getData = provideData.provideData();
			return getData;
		}
		
		/**
		 * Data provider 3
		 * @return
		 */
			@DataProvider(name = "productContent")
			public Object[][] getDataThird() {
				ProviderData provideData = new ProviderData(FileConstant.productContent);
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
