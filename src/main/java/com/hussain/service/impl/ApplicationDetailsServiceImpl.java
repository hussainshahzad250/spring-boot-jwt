package com.hussain.service.impl;

import com.hussain.assembler.ApplicationDetailsConverter;
import com.hussain.constant.Constant;
import com.hussain.entity.ApplicationDetails;
import com.hussain.repository.ApplicationDetailsRepository;
import com.hussain.request.ExcelRequest;
import com.hussain.response.ApplicationDetailsResponse;
import com.hussain.response.Response;
import com.hussain.service.ApplicationDetailsService;
import com.poiji.bind.Poiji;
import com.poiji.exception.PoijiExcelType;
import com.poiji.option.PoijiOptions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.List;

/**
 * @author Shahzad Hussain
 */
@Service
public class ApplicationDetailsServiceImpl implements ApplicationDetailsService, Constant {

    @Autowired
    private ApplicationDetailsRepository applicationDetailsRepository;

    @Override
    public Response applicationUploader(MultipartFile mFile) throws IOException {
        PoijiOptions options = PoijiOptions.PoijiOptionsBuilder.settings().build();
        List<ExcelRequest> excelRequests = Poiji.fromExcel(mFile.getInputStream(), PoijiExcelType.XLSX, ExcelRequest.class, options);
        List<ApplicationDetails> entityListFromRequest = ApplicationDetailsConverter.getEntityListFromRequest(excelRequests);
        applicationDetailsRepository.saveAll(entityListFromRequest);
        return new Response(SUCCESS, HttpStatus.OK);
    }

    @Override
    public ApplicationDetailsResponse getById(Long id) {
        return ApplicationDetailsConverter.getResponseFromEntity(applicationDetailsRepository.findByApplicationDetailsPK_OrgIdAndApplicationDetailsPK_ApplicationId(1L, id).orElse(null));
    }

    @Override
    public List<ApplicationDetailsResponse> getAll() {
        return ApplicationDetailsConverter.getResponseListFromEntityList(applicationDetailsRepository.findAll());
    }

}