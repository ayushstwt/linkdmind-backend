package com.ayshriv.linkmindbackend.service.impl;

import com.ayshriv.linkmindbackend.repository.ContactRepository;
import com.ayshriv.linkmindbackend.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServiceImpl implements ContactService {
    @Autowired
    private ContactRepository contactRepository;
}
