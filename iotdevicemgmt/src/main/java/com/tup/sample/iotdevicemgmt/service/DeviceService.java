package com.tup.sample.iotdevicemgmt.service;

import com.tup.sample.iotdevicemgmt.dto.DeviceDTO;
import com.tup.sample.iotdevicemgmt.model.Device;
import com.tup.sample.iotdevicemgmt.repository.DeviceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DeviceService {

    //@Autowired see DeviceController explanation
    private final DeviceRepository deviceRepository;

    @Autowired // see DeviceController explanation
    public DeviceService(DeviceRepository deviceRepository){
        this.deviceRepository = deviceRepository;
    }

    public Device registerDevice(DeviceDTO device) {
        var newDevice = new Device();
        newDevice.setName(device.name() );
        newDevice.setType(device.type());
        newDevice.setLocation(device.location());
        // This is commented since we are now using @CreationTimestamp
        // annotations in Device.java for createdAt attribute
        //newDevice.setCreatedAt(LocalDateTime.now());
        return deviceRepository.save(newDevice);
    }

    public List<Device> getAllDevices(){
        return deviceRepository.findAll();
    }
}
