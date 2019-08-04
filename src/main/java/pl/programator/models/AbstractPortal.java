package pl.programator.models;

public abstract class AbstractPortal {

    public abstract int countPoints(Reporter reporter);
    public abstract StringBuilder capitalMsg(Reporter reporter);
    protected String portalName;

    public String getPortalName() {
        return portalName;
    }
}
