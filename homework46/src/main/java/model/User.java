package model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Timestamp;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private int id;
    private String name;
    private String password;
    private Timestamp createdDate;

    public User(String name, String password, Timestamp createdDate) {
        this.name = name;
        this.password = password;
        this.createdDate = createdDate;
    }
}
