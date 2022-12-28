package com.example.uniq.api.request;

import lombok.Data;

import java.util.List;
import java.util.UUID;

@Data
public class UserRoleRequest {

    public UUID idUser;
    public List<UUID> idRoles;
}
