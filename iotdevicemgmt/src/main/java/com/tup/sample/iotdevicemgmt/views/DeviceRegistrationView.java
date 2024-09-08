package com.tup.sample.iotdevicemgmt.views;

import com.tup.sample.iotdevicemgmt.dto.DeviceDTO;
import com.tup.sample.iotdevicemgmt.model.Device;
import com.tup.sample.iotdevicemgmt.service.DeviceService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;


@Route("/ui")
public class DeviceRegistrationView extends VerticalLayout {

    private final DeviceService deviceService;
    private final Grid<Device> grid = new Grid<>(Device.class);

    private final TextField nameField = new TextField("Device Name");
    private final TextField typeField = new TextField("Device Type");
    private final TextField locationField = new TextField("Location");

    @Autowired
    public DeviceRegistrationView(DeviceService deviceService) {
        this.deviceService = deviceService;

        Button saveButton = new Button("Register Device", event -> registerDevice());

        add(nameField, typeField, locationField, saveButton, grid);
        grid.setColumns("id", "name", "type", "location", "createdAt");
        updateDeviceList();
    }

    private void registerDevice() {
        try {
            DeviceDTO device = new DeviceDTO(
                nameField.getValue(),
                typeField.getValue(),
                locationField.getValue()
            );

            // Save the device through the service
            deviceService.registerDevice(device);

            // Show success notification
            Notification.show("Device registered successfully!");

            // Clear the form fields
            clearForm();

            // Update the device list
            updateDeviceList();
        } catch (Exception e) {
            // Handle the exception and display an error notification
            Notification.show("Failed to register device: " + e.getMessage(), 5000, Notification.Position.MIDDLE);
        }
    }

    private void updateDeviceList() {
        List<Device> devices = deviceService.getAllDevices();
        grid.setItems(devices);
    }

    private void clearForm() {
        nameField.clear();
        typeField.clear();
        locationField.clear();
    }
}