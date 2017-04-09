package com.app.dao;

import com.app.model.ProfilePicture;
public interface IProfilePictureDao {
	
	public void updateProfilePicture(ProfilePicture pictureObj);
	public ProfilePicture getProfileImageObjById(int profileIamgeId);
	public void deleteUploadProfileImageById(int profileIamgeId );
}
