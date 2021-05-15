package com.example.hotel.repository;

import com.example.hotel.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomRepository extends JpaRepository<Room,Integer> {
    @Query(value = "select * from room inner join room_hotels rh on room.id = rh.room_id where hotels_id=?1 limit 10 offset ?2",nativeQuery = true)
    List<Room> getPageRooms(Integer hotel_id,Integer pagenumber);
}
