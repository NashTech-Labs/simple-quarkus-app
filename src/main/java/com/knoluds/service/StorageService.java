package com.knoluds.service;

import java.util.Map;
import java.util.Optional;

import com.knoluds.model.StoredValue;

public interface StorageService {


	StoredValue store(String value);


	Optional<StoredValue> update(long id, String newValue);


	Optional<StoredValue> delete(long id);


	Optional<StoredValue> retreiveOne(long id);


	Map<Long, StoredValue> retrieveAll();

	boolean isReady();

}
