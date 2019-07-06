package com.stackroute.registrationserver.service;

import com.stackroute.registrationserver.domain.Charities;
import com.stackroute.registrationserver.domain.CharityProfile;

import java.util.List;

public interface CharityService {

    CharityProfile saveCharity(Charities charity) throws Exception;
    List<CharityProfile> displayCharity();
    CharityProfile updateCharity(CharityProfile charityProfile)throws Exception;

}