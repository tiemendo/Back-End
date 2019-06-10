package com.lambdaschool.tiemendo.service;

import com.lambdaschool.tiemendo.model.Retailer;
import com.lambdaschool.tiemendo.model.Turnover;
import org.springframework.data.domain.Pageable;

import java.util.ArrayList;

public interface TurnoverService {
    ArrayList<Turnover> findAll(Pageable p);
    ArrayList<Turnover> findAllByRetailer(Pageable p, long id);
    Turnover findById(long id);
    Retailer add(Turnover turnover, long id);
    Turnover update(Turnover turnover);
    void delete(long id);
}
