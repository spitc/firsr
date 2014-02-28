package com.shpitc.driveshare.shared.actions.infra;

import com.gwtplatform.dispatch.annotation.GenDispatch;
import com.gwtplatform.dispatch.annotation.Out;
import com.gwtplatform.dispatch.shared.UnsecuredActionImpl;
import com.shpitc.driveshare.shared.model.dto.infra.AppInitDataDto;

@GenDispatch(isSecure = false, serviceName = UnsecuredActionImpl.DEFAULT_SERVICE_NAME)
public class GetAppInitData {
	@Out(1) private AppInitDataDto appInitDataDto;

}
