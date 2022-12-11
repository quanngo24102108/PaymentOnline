package com.hotel.payment.mapper;

import com.hotel.payment.dto.UserDTO;
import com.hotel.payment.entity.User;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface UserMapper extends IMapper<User, UserDTO>{

    @Override
    UserDTO toDto(User entity);
}
