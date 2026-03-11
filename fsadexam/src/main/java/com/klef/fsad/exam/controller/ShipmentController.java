package com.klef.fsad.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.klef.fsad.exam.model.Shipment;
import com.klef.fsad.exam.service.ShipmentService;

@RestController
@RequestMapping("/shipment")
public class ShipmentController {

    @Autowired
    private ShipmentService shipmentService;

    @PostMapping("/add")
    public Shipment addShipment(@RequestBody Shipment shipment)
    {
        return shipmentService.addShipment(shipment);
    }

    @PutMapping("/update/{id}")
    public Shipment updateShipment(@PathVariable Long id,
                                   @RequestBody Shipment shipment)
    {
        return shipmentService.updateShipment(id, shipment);
    }
}
