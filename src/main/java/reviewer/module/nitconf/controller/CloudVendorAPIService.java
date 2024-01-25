package reviewer.module.nitconf.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import reviewer.module.nitconf.Model.CloudVendor;

@RestController
@RequestMapping("/dicksucker")
public class CloudVendorAPIService 
{

    CloudVendor cloudVendor;



    @GetMapping("{vendorId}")
    public CloudVendor getCloudVendorDetails(String vendorID)
    {

        return cloudVendor;

    }
    @PostMapping
    public String postCloudVendorDetails(@RequestBody CloudVendor cloudVendor)
    {
        this.cloudVendor = cloudVendor;
        return "Vendor created successfully";

    }

    
}
