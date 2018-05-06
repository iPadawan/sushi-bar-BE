package org.enricogiurin.sushibar.dto;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotNull;

/**
 * Created by enrico on 7/24/17.
 */
@NoArgsConstructor
@Getter
@Setter
public class RequestUserDTO extends UserDTO {
    @NotNull
    private String password = null;

    public RequestUserDTO(String username, String email, String password) {
        super(username, email);
        this.password = password;
    }
}
