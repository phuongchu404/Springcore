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

import com.springbootexample.entity.SanPhamEntity;
import com.springbootexample.repository.SanPhamRepository;
import com.springbootexample.service.SanPhamService;

@Service
public class SanPhamServiceImpl implements SanPhamService{

	@Autowired
	private SanPhamRepository sanPhamRepository;

	@Override
	public <S extends SanPhamEntity> S save(S entity) {
		return sanPhamRepository.save(entity);
	}

	@Override
	public <S extends SanPhamEntity> Optional<S> findOne(Example<S> example) {
		return sanPhamRepository.findOne(example);
	}

	@Override
	public List<SanPhamEntity> findAll() {
		return sanPhamRepository.findAll();
	}

	@Override
	public Page<SanPhamEntity> findAll(Pageable pageable) {
		return sanPhamRepository.findAll(pageable);
	}

	@Override
	public List<SanPhamEntity> findAll(Sort sort) {
		return sanPhamRepository.findAll(sort);
	}

	@Override
	public List<SanPhamEntity> findAllById(Iterable<Long> ids) {
		return sanPhamRepository.findAllById(ids);
	}

	@Override
	public Optional<SanPhamEntity> findById(Long id) {
		return sanPhamRepository.findById(id);
	}

	@Override
	public <S extends SanPhamEntity> List<S> saveAll(Iterable<S> entities) {
		return sanPhamRepository.saveAll(entities);
	}

	@Override
	public void flush() {
		sanPhamRepository.flush();
	}

	@Override
	public <S extends SanPhamEntity> S saveAndFlush(S entity) {
		return sanPhamRepository.saveAndFlush(entity);
	}

	@Override
	public boolean existsById(Long id) {
		return sanPhamRepository.existsById(id);
	}

	@Override
	public <S extends SanPhamEntity> List<S> saveAllAndFlush(Iterable<S> entities) {
		return sanPhamRepository.saveAllAndFlush(entities);
	}

	@Override
	public <S extends SanPhamEntity> Page<S> findAll(Example<S> example, Pageable pageable) {
		return sanPhamRepository.findAll(example, pageable);
	}

	@Override
	public void deleteInBatch(Iterable<SanPhamEntity> entities) {
		sanPhamRepository.deleteInBatch(entities);
	}

	@Override
	public <S extends SanPhamEntity> long count(Example<S> example) {
		return sanPhamRepository.count(example);
	}

	@Override
	public void deleteAllInBatch(Iterable<SanPhamEntity> entities) {
		sanPhamRepository.deleteAllInBatch(entities);
	}

	@Override
	public long count() {
		return sanPhamRepository.count();
	}

	@Override
	public <S extends SanPhamEntity> boolean exists(Example<S> example) {
		return sanPhamRepository.exists(example);
	}

	@Override
	public void deleteById(Long id) {
		sanPhamRepository.deleteById(id);
	}

	@Override
	public void deleteAllByIdInBatch(Iterable<Long> ids) {
		sanPhamRepository.deleteAllByIdInBatch(ids);
	}

	@Override
	public void delete(SanPhamEntity entity) {
		sanPhamRepository.delete(entity);
	}

	@Override
	public <S extends SanPhamEntity, R> R findBy(Example<S> example,
			Function<FetchableFluentQuery<S>, R> queryFunction) {
		return sanPhamRepository.findBy(example, queryFunction);
	}

	@Override
	public void deleteAllById(Iterable<? extends Long> ids) {
		sanPhamRepository.deleteAllById(ids);
	}

	@Override
	public void deleteAllInBatch() {
		sanPhamRepository.deleteAllInBatch();
	}

	@Override
	public SanPhamEntity getOne(Long id) {
		return sanPhamRepository.getOne(id);
	}

	@Override
	public void deleteAll(Iterable<? extends SanPhamEntity> entities) {
		sanPhamRepository.deleteAll(entities);
	}

	@Override
	public void deleteAll() {
		sanPhamRepository.deleteAll();
	}

	@Override
	public SanPhamEntity getById(Long id) {
		return sanPhamRepository.getById(id);
	}

	@Override
	public <S extends SanPhamEntity> List<S> findAll(Example<S> example) {
		return sanPhamRepository.findAll(example);
	}

	@Override
	public <S extends SanPhamEntity> List<S> findAll(Example<S> example, Sort sort) {
		return sanPhamRepository.findAll(example, sort);
	}
	
}
