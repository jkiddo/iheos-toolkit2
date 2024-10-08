package gov.nist.toolkit.xdstools2.client.command.command;

import gov.nist.toolkit.simcommon.client.SimulatorConfig;
import gov.nist.toolkit.xdstools2.client.util.ClientUtils;
import gov.nist.toolkit.xdstools2.shared.command.request.GetAllSimConfigsRequest;

import java.util.List;

/**
 *
 */
public abstract class GetAllSimConfigsCommand extends GenericCommand<GetAllSimConfigsRequest, List<SimulatorConfig>> {

    @Override
    public void run(GetAllSimConfigsRequest var1) {
        ClientUtils.INSTANCE.getToolkitServices().getAllSimConfigs(var1, this);
    }
}
