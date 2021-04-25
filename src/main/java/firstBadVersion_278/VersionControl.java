package firstBadVersion_278;

public class VersionControl {
    private int badVersion;

    public VersionControl(int badVersion) {
        this.badVersion = badVersion;
    }
    public VersionControl(){

    }

    public boolean isBadVersion(int version) {
        return version >= badVersion;
    }
}
