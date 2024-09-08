package com.tup.sample.iotdevicemgmt.controller;

import com.tup.sample.iotdevicemgmt.dto.DeviceDTO;
import com.tup.sample.iotdevicemgmt.model.Device;
import com.tup.sample.iotdevicemgmt.service.DeviceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/devices")
public class DeviceController {

    //@Autowired <- Field injection is not a preferred practice.
    // Due to the following below:
    // (1) allows mutable dependencies,
    // (2) difficult to test
    // (3) reduces code quality
    // (4) avoids dependency hell and circular dependencies
    // (5) aligns more with SOLID principles
    private final DeviceService deviceService;

    @Autowired // <-- this the preferred way
    public DeviceController(DeviceService deviceService) {
        this.deviceService = deviceService;
    }

    @PostMapping("/register")
    public ResponseEntity<Device> registerDevice(@RequestBody DeviceDTO request) {
        Device registeredDevice = deviceService.registerDevice(request);
        return ResponseEntity.ok(registeredDevice);
    }

    @GetMapping
    public ResponseEntity<List<Device>> getAllDevices() {
        List<Device> allDevices = deviceService.getAllDevices();
        return ResponseEntity.ok(allDevices);
    }
}
