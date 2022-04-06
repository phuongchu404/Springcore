package com.springbootexample.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.springbootexample.entity.LoaiSPEntity;

public interface LoaiSPService{

	<S extends LoaiSPEntity> List<S> findAll(Example<S> example, Sort sort);

	<S extends LoaiSPEntity> List<S> findAll(Example<S> example);

	LoaiSPEntity getById(Long id);

	void deleteAll();

	void deleteAll(Iterable<? extends LoaiSPEntity> entities);

	LoaiSPEntity getOne(Long id);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends Long> ids);

	<S extends LoaiSPEntity, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	void delete(LoaiSPEntity entity);

	void deleteAllByIdInBatch(Iterable<Long> ids);

	void deleteById(Long id);

	<S extends LoaiSPEntity> boolean exists(Example<S> example);

	long count();

	void deleteAllInBatch(Iterable<LoaiSPEntity> entities);

	<S extends LoaiSPEntity> long count(Example<S> example);

	void deleteInBatch(Iterable<LoaiSPEntity> entities);

	<S extends LoaiSPEntity> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends LoaiSPEntity> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(Long id);

	<S extends LoaiSPEntity> S saveAndFlush(S entity);

	void flush();

	<S extends LoaiSPEntity> List<S> saveAll(Iterable<S> entities);

	Optional<LoaiSPEntity> findById(Long id);

	List<LoaiSPEntity> findAllById(Iterable<Long> ids);

	List<LoaiSPEntity> findAll(Sort sort);

	Page<LoaiSPEntity> findAll(Pageable pageable);

	List<LoaiSPEntity> findAll();

	<S extends LoaiSPEntity> Optional<S> findOne(Example<S> example);

	<S extends LoaiSPEntity> S save(S entity);

}
