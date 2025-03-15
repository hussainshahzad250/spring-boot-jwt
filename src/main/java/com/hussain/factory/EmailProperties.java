package com.hussain.factory;

import com.hussain.entity.EmailConfig;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class EmailProperties {
    private List<EmailConfig> accounts;
}
