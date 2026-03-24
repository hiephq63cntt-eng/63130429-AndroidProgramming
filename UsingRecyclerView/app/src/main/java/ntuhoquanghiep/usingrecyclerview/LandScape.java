package ntuhoquanghiep.usingrecyclerview;

public class LandScape {
    String LandImageFileName;
    String landCation;

    public LandScape(String landImageFileName, String landCation) {
        LandImageFileName = landImageFileName;
        this.landCation = landCation;
    }

    public String getLandImageFileName() {
        return LandImageFileName;
    }

    public void setLandImageFileName(String landImageFileName) {
        LandImageFileName = landImageFileName;
    }

    public String getLandCation() {
        return landCation;
    }

    public void setLandCation(String landCation) {
        this.landCation = landCation;
    }
}
