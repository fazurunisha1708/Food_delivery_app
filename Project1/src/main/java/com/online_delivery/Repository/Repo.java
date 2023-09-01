package com.online_delivery.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.online_delivery.model.ApiModel;

public interface Repo extends JpaRepository<ApiModel, Integer> {

}
