package com.barstad.projectc44.Services;

import com.barstad.projectc44.Entities.UserProfileEntity;
import com.barstad.projectc44.daos.Database;
import com.barstad.projectc44.dtos.UserProfileDto;
import org.springframework.beans.BeanUtils;

public class UserServiceImpl implements UserService {
    Database database;
    public UserProfileDto saveUser(UserProfileDto userDto) {

        UserProfileDto returnValue = null;

        UserProfileEntity userEntity = new UserProfileEntity();
        BeanUtils.copyProperties(userDto, userEntity);

        // Connect to database
        try {
            this.database.openConnection();
            UserProfileEntity storedUserEntity = this.database.saveUserProfile(userEntity);
            if(storedUserEntity != null && storedUserEntity.getId()>0)
            {
                returnValue = new UserProfileDto();
                BeanUtils.copyProperties(storedUserEntity, returnValue);
            }
        }  finally {
            this.database.closeConnection();
        }

        return returnValue;
    }
}
