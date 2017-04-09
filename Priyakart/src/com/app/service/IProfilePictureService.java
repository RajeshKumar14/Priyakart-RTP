package com.app.service;

import com.app.model.ProfilePicture;

public interface IProfilePictureService {
	public void updateProfilePicture(ProfilePicture pictureObj);
	public ProfilePicture getProfileImageObjById(int profileIamgeId);
	public void deleteUploadProfileImageById(int profileIamgeId );
}
