package com.example.transportationapp.dao;

import com.example.transportationapp.ds.TransportInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransportInfoDao extends JpaRepository<TransportInfo,Integer> {
}
