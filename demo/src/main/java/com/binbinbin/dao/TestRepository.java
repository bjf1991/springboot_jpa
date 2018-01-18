package com.binbinbin.dao;

import com.binbinbin.entity.TestEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;


/**
 * Created by Administrator on 2018/1/18.
 */
public interface TestRepository  extends JpaRepository<TestEntity, Long>, JpaSpecificationExecutor<TestEntity> {
}
