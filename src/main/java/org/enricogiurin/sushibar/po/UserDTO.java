package org.enricogiurin.sushibar.po;

/**
 * Created by enrico on 7/7/17.
 */
public class UserDTO {
    private String username;
    private String email;

    public UserDTO(String username, String email) {
        this.username = username;
        this.email = email;
    }

    public UserDTO() {
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }


}