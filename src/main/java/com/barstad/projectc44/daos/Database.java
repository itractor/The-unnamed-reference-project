package com.barstad.projectc44.daos;

import com.barstad.projectc44.Models.UserProfileEntity;

public interface Database {
    public void openConnection();
    public UserProfileEntity saveUserProfile(UserProfileEntity userProfile);
    public void closeConnection();
}
