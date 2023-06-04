package com.hussain.service;

import com.hussain.response.ApplicationDetailsResponse;
import com.hussain.response.Response;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * @author Shahzad Hussain
 */
public interface ApplicationDetailsService {
    Response applicationUploader(MultipartFile file) throws IOException;

    ApplicationDetailsResponse getById(Long id);

    List<ApplicationDetailsResponse> getAll();

}