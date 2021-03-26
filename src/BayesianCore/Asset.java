package BayesianCore;

import com.bayesserver.Network;

import java.util.List;
import java.util.Map;

public class Asset {
    private String asset_id;
    private String asset_name;
    private int asset_value;

    private Map<Vulnerability,ProbabilityTable> vulnerabilityProbabilityTableMap;

    private List<Threat> threatList;
    private Network networkThreat;

    private List<Vulnerability> vulnerabilityList;
    private Network networkVulnerability;
}
