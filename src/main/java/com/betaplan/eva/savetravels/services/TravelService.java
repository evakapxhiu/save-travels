package com.betaplan.eva.savetravels.services;

import com.betaplan.eva.savetravels.models.Travel;
import com.betaplan.eva.savetravels.repositories.TravelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfiguration;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TravelService {
    @Autowired
    private TravelRepository travelRepo;
    public List<Travel> getAllTravels(){
//        bussineslogic
        return  travelRepo.findAll();
    }

//create new Travel.
    public void createTravel(Travel travel){
        travelRepo.save(travel);
    }
    //    traveldeatails(get by id).
    public Travel details(Long id){
        return travelRepo.findById(id).orElse(null);
    }
    // update
    public void update(Travel travel){
        travelRepo.save(travel);
    }
    public void delete(Long id){
        travelRepo.deleteById(id);
    }
}
