package org.paasta.servicebroker.apigateway.repository;

import org.paasta.servicebroker.apigateway.model.JpaServiceInstance;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * The interface Jpa Dedicated VM repository.
 */
@Repository
public interface JpaDedicatedVMRepository extends JpaRepository<JpaServiceInstance, String> {
}