package com.klef.fsad.exam.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.klef.fsad.exam.model.Shipment;
import com.klef.fsad.exam.repository.ShipmentRepository;

@Service
public class ShipmentServiceImpl implements ShipmentService {

    @Autowired
    private ShipmentRepository shipmentRepository;

    @Override
    public Shipment addShipment(Shipment shipment) {
        return shipmentRepository.save(shipment);
    }

    @Override
    public Shipment updateShipment(Long id, Shipment shipment) {

        Shipment existing = shipmentRepository.findById(id).orElse(null);

        if(existing != null)
        {
            existing.setName(shipment.getName());
            existing.setDate(shipment.getDate());
            existing.setStatus(shipment.getStatus());
            existing.setSource(shipment.getSource());
            existing.setDestination(shipment.getDestination());

            return shipmentRepository.save(existing);
        }

        return null;
    }
}
