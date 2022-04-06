package com.springbootexample.service.impl;

import java.util.List;
import java.util.Optional;
import java.util.function.Function;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.repository.query.FluentQuery.FetchableFluentQuery;
import org.springframework.stereotype.Service;

import com.springbootexample.entity.LoaiSPEntity;
import com.springbootexample.repository.LoaiSPRepository;
import com.springbootexample.service.LoaiSPService;

@Service
public class LoaiSPServiceImpl implements LoaiSPService{

	@Autowired
	private LoaiSPRepository loaiSPRepository;

	@Override
	public <S extends LoaiSPEntity> S save(S entity) {
		return loaiSPRepository.save(entity);
	}

	@Override
	public <S extends LoaiSPEntity> Optional<S> findOne(Example<S> example) {
		return loaiSPRepository.findOne(example);
	}

	@Override
	public List<LoaiSPEntity> findAll() {
		return loaiSPRepository.findAll();
	}

	@Override
	public Page<LoaiSPEntity> findAll(Pageable pageable) {
		return loaiSPRepository.findAll(pageable);
	}

	@Override
	public List<LoaiSPEntity> findAll(Sort sort) {
		return loaiSPRepository.findAll(sort);
	}

	@Override
	public List<LoaiSPEntity> findAllById(Iterable<Long> ids) {
		return loaiSPRepository.findAllById(ids);
	}

	@Override
	public Optional<LoaiSPEntity> findById(Long id) {
		return loaiSPRepository.findById(id);
	}

	@Override
	public <S extends LoaiSPEntity> List<S> saveAll(Iterable<S> entities) {
		return loaiSPRepository.saveAll(entities);
	}

	@Override
	public void flush() {
		loaiSPRepository.flush();
	}

	@Override
	public <S extends LoaiSPEntity> S saveAndFlush(S entity) {
		return loaiSPRepository.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(Long id) {
		return loaiSPRepository.existsById(id);
	}

	@Override
	public <S extends LoaiSPEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
		return loaiSPRepository.saveAllAndFlush(entities);
	}

	@Override
	public <S extends LoaiSPEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
		return loaiSPRepository.findAll(example, pageable);
	}

	@Override
	public void deleteInBatch(Iterable<LoaiSPEntity> entities) {
		loaiSPRepository.deleteInBatch(entities);
	}

	@Override
	public <S extends LoaiSPEntity> long count(Example<S> example) {
		return loaiSPRepository.count(example);
	}

	@Override
	public void deleteAllInBatch(Iterable<LoaiSPEntity> entities) {
		loaiSPRepository.deleteAllInBatch(entities);
	}

	@Override
	public long count() {
		return loaiSPRepository.count();
	}

	@Override
	public <S extends LoaiSPEntity> boolean exists(Example<S> example) {
		return loaiSPRepository.exists(example);
	}

	@Override
	public void deleteById(Long id) {
		loaiSPRepository.deleteById(id);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		loaiSPRepository.deleteAllByIdInBatch(ids);
	}

	@Override
	public void delete(LoaiSPEntity entity) {
		loaiSPRepository.delete(entity);
	}

	@Override
	public <S extends LoaiSPEntity, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		return loaiSPRepository.findBy(example, queryFunction);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		loaiSPRepository.deleteAllById(ids);
	}

	@Override
	public void deleteAllInBatch() {
		loaiSPRepository.deleteAllInBatch();
	}

	@Override
	public LoaiSPEntity getOne(Long id) {
		return loaiSPRepository.getOne(id);
	}

	@Override
	public void deleteAll(Iterable<? extends LoaiSPEntity> entities) {
		loaiSPRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		loaiSPRepository.deleteAll();
	}

	@Override
	public LoaiSPEntity getById(Long id) {
		return loaiSPRepository.getById(id);
	}

	@Override
	public <S extends LoaiSPEntity> List<S> findAll(Example<S> example) {
		return loaiSPRepository.findAll(example);
	}

	@Override
	public <S extends LoaiSPEntity> List<S> findAll(Example<S> example, Sort sort) {
		return loaiSPRepository.findAll(example, sort);
	}
	
	
}
