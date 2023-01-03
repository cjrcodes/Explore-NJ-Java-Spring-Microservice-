package com.cjrcodes.enj.explorenj.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.cjrcodes.enj.explorenj.domain.TourPackage;

public interface TourPackageRepository extends CrudRepository<TourPackage, String> {

	Optional<TourPackage> findByName(String name);
}
