package com.danny.springBootMongoDBRestApi.repository;

import com.danny.springBootMongoDBRestApi.document.RefreshToken;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RefreshTokenReopsitory extends MongoRepository<RefreshToken, String> {
}
