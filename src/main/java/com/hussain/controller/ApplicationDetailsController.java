package com.hussain.controller;

import com.fasterxml.jackson.databind.exc.InvalidFormatException;
import com.hussain.constant.Constant;
import com.hussain.constant.RestMappingConstants;
import com.hussain.exception.BadRequestException;
import com.hussain.exception.ObjectNotFoundException;
import com.hussain.response.ApplicationDetailsResponse;
import com.hussain.response.Response;
import com.hussain.service.ApplicationDetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * @author Shahzad Hussain
 */
@RestController
@RequestMapping(value = "/public/applicationDetails")
public class ApplicationDetailsController implements Constant {

    @Autowired
    private ApplicationDetailsService applicationDetailsService;

    @PostMapping("/uploader")
    public Response uploadBankUploaderDetails(@RequestPart("file") MultipartFile file) throws IOException, BadRequestException {
        return applicationDetailsService.applicationUploader(file);
    }

    @GetMapping(path = RestMappingConstants.ID_PARAM)
    public ResponseEntity<Response> getById(@PathVariable(RestMappingConstants.ID) Long id) throws ObjectNotFoundException {
        ApplicationDetailsResponse response = applicationDetailsService.getById(id);
        if (response == null) {
            throw new ObjectNotFoundException(NOT_FOUND, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(new Response(SUCCESS, response, HttpStatus.OK), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<Response> getAll() throws ObjectNotFoundException {
        List<ApplicationDetailsResponse> response = applicationDetailsService.getAll();
        if (CollectionUtils.isEmpty(response)) {
            throw new ObjectNotFoundException(NOT_FOUND, HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(new Response(SUCCESS, response, HttpStatus.OK), HttpStatus.OK);
    }
}