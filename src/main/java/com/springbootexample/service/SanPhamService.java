package com.springbootexample.service;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;

import com.springbootexample.entity.SanPhamEntity;


public interface SanPhamService {

	<S extends SanPhamEntity> List<S> findAll(Example<S> example, Sort sort);

	<S extends SanPhamEntity> List<S> findAll(Example<S> example);

	SanPhamEntity getById(Long id);

	void deleteAll();

	void deleteAll(Iterable<? extends SanPhamEntity> entities);

	SanPhamEntity getOne(Long id);

	void deleteAllInBatch();

	void deleteAllById(Iterable<? extends Long> ids);

	<S extends SanPhamEntity, R> R findBy(Example<S> example, Function<FetchableFluentQuery<S>, R> queryFunction);

	void delete(SanPhamEntity entity);

	void deleteAllByIdInBatch(Iterable<Long> ids);

	void deleteById(Long id);

	<S extends SanPhamEntity> boolean exists(Example<S> example);

	long count();

	void deleteAllInBatch(Iterable<SanPhamEntity> entities);

	<S extends SanPhamEntity> long count(Example<S> example);

	void deleteInBatch(Iterable<SanPhamEntity> entities);

	<S extends SanPhamEntity> Page<S> findAll(Example<S> example, Pageable pageable);

	<S extends SanPhamEntity> List<S> saveAllAndFlush(Iterable<S> entities);

	boolean existsById(Long id);

	<S extends SanPhamEntity> S saveAndFlush(S entity);

	void flush();

	<S extends SanPhamEntity> List<S> saveAll(Iterable<S> entities);

	Optional<SanPhamEntity> findById(Long id);

	List<SanPhamEntity> findAllById(Iterable<Long> ids);

	List<SanPhamEntity> findAll(Sort sort);

	Page<SanPhamEntity> findAll(Pageable pageable);

	List<SanPhamEntity> findAll();

	<S extends SanPhamEntity> Optional<S> findOne(Example<S> example);

	<S extends SanPhamEntity> S save(S entity);

 
}
