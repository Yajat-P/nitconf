package reviewer.module.nitconf.Model;

public class CloudVendor {
    private String vendorID;
    private String vendorName;
    private String vendorAddress;
    private String vendorPhoneNo;
    
    public CloudVendor() {
    }

    public CloudVendor(String vendorID, String vendorName, String vendorAddress, String vendorPhoneNo) {
        this.vendorID = vendorID;
        this.vendorName = vendorName;
        this.vendorAddress = vendorAddress;
        this.vendorPhoneNo = vendorPhoneNo;
    }

    public String getVendorID() {
        return vendorID;
    }

    public void setVendorID(String vendorID) {
        this.vendorID = vendorID;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public String getVendorPhoneNo() {
        return vendorPhoneNo;
    }

    public void setVendorPhoneNo(String vendorPhoneNo) {
        this.vendorPhoneNo = vendorPhoneNo;
    }
    

    
    
}
