package com.example.demo;

import com.google.cloud.spring.data.datastore.repository.DatastoreRepository;

public interface BrowserHistoryRepo extends DatastoreRepository<BrowserHistory,Long> {
}