package com.example.jpa_crud.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import com.example.jpa_crud.dto.request.UserCreationRequest;
import com.example.jpa_crud.dto.request.UserUpdateRequest;
import com.example.jpa_crud.dto.response.UserResponse;
import com.example.jpa_crud.entity.User;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    UserResponse toUserResponse(User user);

    void updateUser(UserUpdateRequest request, @MappingTarget User user);
}
