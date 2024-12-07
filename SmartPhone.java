public class SmartPhone extends MobilePhone {

    private int cameraResolution;
    private int RAMSize;
    private int ROMSize;
    private String OSVersion;

    public SmartPhone()
    {
        this.cameraResolution = 0;
        this.RAMSize = 0;
        this.ROMSize = 0;
        this.OSVersion = "Unknown";
    }

    public SmartPhone(String brand, String model, double batteryCapacity, int cameraResolution, int RAMSize, int ROMSize, String OSVersion)
    {
        super(brand, model, batteryCapacity);
        this.cameraResolution = cameraResolution;
        this.RAMSize = RAMSize;
        this.ROMSize = ROMSize;
        this.OSVersion = OSVersion;
    }

    public void setCemeraResolution(int cameraResolution)
    {
        this.cameraResolution = cameraResolution;
    }

    public int getCameraResolution(){return cameraResolution;}

    public void setRAMSize(int RAMSize)
    {
        this.RAMSize = RAMSize;
    }

    public int getRAMSize(){return RAMSize;}

    public void setROMSize(int ROMSize)
    {
        this.ROMSize = ROMSize;
    }

    public int ROMSize(){return ROMSize;}

    public void setOSVersion(String OSVersion)
    {
        this.OSVersion = OSVersion;
    }

    public String getOSVersion(){return OSVersion;}

    @Override
    public void showDetails()
    {
        super.showDetails();
        System.out.println("Camera Resolution: " + cameraResolution);
        System.out.println("Ram Size: " + RAMSize);
        System.out.println("Rom Size: " + ROMSize);
        System.out.println("OS Version: " + OSVersion);
    }
}
