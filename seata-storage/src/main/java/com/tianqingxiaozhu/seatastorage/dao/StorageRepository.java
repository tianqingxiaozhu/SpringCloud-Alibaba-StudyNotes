package com.tianqingxiaozhu.seatastorage.dao;

import com.tianqingxiaozhu.seatastorage.model.Storage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StorageRepository extends JpaRepository<Storage,Long> {
}
