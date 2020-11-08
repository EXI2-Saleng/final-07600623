package th.ac.su.speedrecords;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
import androidx.room.TypeConverters;

import th.ac.su.speedrecords.DateConverter;

import java.util.Date;

@Entity(tableName = "data")
public class Data {
    public static final int GENDER_MALE = 0;
    public static final int GENDER_FEMALE = 1;

    @PrimaryKey(autoGenerate = true)
    public final int id;

    @ColumnInfo(name = "first_name")
    public final String KM;

    @ColumnInfo(name = "last_name")
    public final String MS;


    /*  @ColumnInfo(name = "some_time")
      @TypeConverters(DateConverter.class)
      public final Date someTime;

      public User(int id, String firstName, String lastName, Date birthDate, int gender, boolean single, Date someTime) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.single = single;
        this.someTime = someTime;
      }*/
    @ColumnInfo(name = "some_time")
    @TypeConverters(DateConverter.class)
    public final String someTime;

    public User(int id, String firstName, String lastName, Date birthDate, int gender, boolean single, String someTime) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.single = single;
        this.someTime = someTime;
    }

    public Data(int _tmpId, String _tmpKM, String _tmpMS) {
    }
}
