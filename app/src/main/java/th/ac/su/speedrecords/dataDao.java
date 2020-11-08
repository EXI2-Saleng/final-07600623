package th.ac.su.speedrecords;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import th.ac.su.speedrecords.Data;

@Dao
interface DataDao {

    @Query("SELECT * FROM data")
    Data[] getAllUsers();

    @Query("SELECT * FROM data WHERE id = :id")
    Data getUserById(int id);

    @Insert
    void addUser(Data... users);

    @Delete
    void deleteUser(Data user);
}
