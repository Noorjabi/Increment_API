package com.assignment.increment.service.impl;

import com.assignment.increment.Repository.NumberRepository;
import com.assignment.increment.model.Number;
import com.assignment.increment.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class NumberServiceImpl implements NumberService {

    @Autowired
    private NumberRepository numberRepository;

    static Integer increment = -1;
    @Override
    public void incrementNUmber() {
        numberRepository.save(new Number(increment=increment+1));
    }
}
