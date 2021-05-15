package com.example.hotel.controller;

import com.example.hotel.entity.Hotel;
import com.example.hotel.repository.HotelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/hotel")
public class HotelController {
    @Autowired
    HotelRepository hotelRepository;

    @PostMapping("/post")
    public String insert(@RequestBody Hotel hotel) {
        Hotel hotel1 = new Hotel(hotel.getHotelname());
        hotelRepository.save(hotel1);
        return "Ma'lumot qo'shildi";
    }

    @GetMapping("/get")
    public List<Hotel> getAll() {
        return hotelRepository.findAll();
    }

    @PutMapping("/put/{id}")
    public String update(@PathVariable Integer id, @RequestBody Hotel hotel) {
        Optional<Hotel> optional = hotelRepository.findById(id);
        if (optional.isPresent()) {
            Hotel hotel1 = optional.get();
            hotel1.setHotelname(hotel.getHotelname());
            hotelRepository.save(hotel);
            return "Yangilandi !!!";
        } else {
            return "Bunday foydalanuvchi yo'q";
        }
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        Optional<Hotel> optional = hotelRepository.findById(id);
        if (optional.isPresent()) {
            hotelRepository.deleteById(id);
            return "O'chirildi ";
        } else {
            return "Bunday foydalanuvchi yo'q !!!";
        }
    }
}
