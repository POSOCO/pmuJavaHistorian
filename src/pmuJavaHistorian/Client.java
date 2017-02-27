package pmuJavaHistorian;

import com.eterra._public.services.data.datatypes.FullResolutionDataResponse;
import com.eterra._public.services.data.historicaltrendprovider.HistoricalTrendProvider;
import com.eterra._public.services.data.historicaltrendprovider.HistoricalTrendProvider_Service;
import com.eterra._public.services.data.historicaltrendprovider.InternalServerFault;
import com.eterra._public.services.data.historicaltrendprovider.InvalidParametersFault;

public class Client {

	public static void main(String[] args) throws InternalServerFault, InvalidParametersFault {
		// TODO Auto-generated method stub
		HistoricalTrendProvider_Service service = new HistoricalTrendProvider_Service();
		HistoricalTrendProvider port = service.getHistoricalTrendProvider12();
		FullResolutionDataResponse resp = port.getFullResolutionData(null);

	}

}
