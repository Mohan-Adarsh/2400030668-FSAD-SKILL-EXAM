package com.klef.fsad.exam.service;

import com.klef.fsad.exam.model.Shipment;

public interface ShipmentService {

    Shipment addShipment(Shipment shipment);

    Shipment updateShipment(Long id, Shipment shipment);

}
