package com.example.hotel.controller;

import com.example.hotel.dtocarrier.RoomCarrier;
import com.example.hotel.entity.Hotel;
import com.example.hotel.entity.Room;
import com.example.hotel.repository.HotelRepository;
import com.example.hotel.repository.RoomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/room")
public class RoomController {
    @Autowired
    RoomRepository roomRepository;
    @Autowired
    HotelRepository hotelRepository;

    @PostMapping("/post")
    public String insert(@RequestBody RoomCarrier roomCarrier) {
        Optional<Hotel> optional = hotelRepository.findById(roomCarrier.getHotel_id());
        if (optional.isPresent()) {
            List<Hotel> hotelList = new ArrayList<>();
            hotelList.add(optional.get());
            Room room = new Room(roomCarrier.getNumber(), roomCarrier.getFloor(), roomCarrier.getSize(), hotelList);
            roomRepository.save(room);
            return "Ma'lumot qo'shildi ";
        } else {
            return "Bunday Hotel topilmadi !!!";
        }
    }

    @PutMapping("/put/{id}")
    public String update(@PathVariable Integer id, @RequestBody RoomCarrier roomCarrier) {
        Optional<Room> optional = roomRepository.findById(id);
        if (optional.isPresent()) {
            Optional<Hotel> optional1 = hotelRepository.findById(roomCarrier.getHotel_id());
            if (optional1.isPresent()) {
                Room room = optional.get();
                List<Hotel> hotels = room.getHotels();
                hotels.remove(0);
                hotels.add(optional1.get());
                room.setFloor(roomCarrier.getFloor());
                room.setNumber(roomCarrier.getNumber());
                room.setSize(roomCarrier.getSize());
                room.setHotels(hotels);
                roomRepository.save(room);
                return "Yangilandi !!!";
            } else {
                return "Bunday Hotel topilmadi";
            }
        } else {
            return "Bunday Room topilmadi ";
        }
    }

    @GetMapping("/getPageRoom/{hotelId}")
    public List<Room> getRoomPage(@PathVariable Integer hotelId, @RequestParam Integer pagenumber) {
        List<Room> pageRooms = roomRepository.getPageRooms(hotelId, pagenumber);
        return pageRooms;
    }

    @GetMapping("/get")
    public List<Room> getAll() {
        return roomRepository.findAll();
    }

    @DeleteMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        Optional<Room> optional = roomRepository.findById(id);
        if (optional.isPresent()) {
            roomRepository.deleteById(id);
            return "O'chirildi";
        } else {
            return "Bunday foydalanuvchi yo'q !!!";
        }
    }
}
