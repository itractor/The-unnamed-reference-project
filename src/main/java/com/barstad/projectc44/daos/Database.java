package com.barstad.projectc44.daos;

import com.barstad.projectc44.Models.UserProfile;

public interface Database {
    public void openConnection();
    public UserProfile saveUserProfile(UserProfile userProfile);
    public void closeConnection();
}
