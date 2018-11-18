package com.barstad.projectc44.Resources;

import com.barstad.projectc44.Services.UserService;
import com.barstad.projectc44.Services.UserServiceImpl;
import com.barstad.projectc44.UserProfile;
import com.barstad.projectc44.dtos.UserProfileDto;
import org.springframework.beans.BeanUtils;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/users")
public class UserResource {

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public UserProfile createUserProfile(UserProfile userProfile) {
        UserProfile returnValue = null;

        UserProfileDto userProfileDto = new UserProfileDto();
        BeanUtils.copyProperties(userProfile, userProfileDto);

        UserService userService = new UserServiceImpl();
        UserProfileDto storedUserDetails = userService.saveUser(userProfileDto);

        if(storedUserDetails != null && !storedUserDetails.getFirstName().isEmpty())
        {
            returnValue = new UserProfile();
            BeanUtils.copyProperties(storedUserDetails, returnValue);
        }
        // And when we are done, we can return user profile back
        return userProfile;
    }

}
