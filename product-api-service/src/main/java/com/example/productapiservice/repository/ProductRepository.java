package com.example.productapiservice.repository;


import com.example.productapiservice.model.Product;
import org.springframework.data.couchbase.repository.CouchbaseRepository;
import org.springframework.data.couchbase.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends CouchbaseRepository<Product, Long> {

    @Query("SELECT COUNT(*) AS count FROM #{#n1ql.bucket} WHERE #{#n1ql.filter}")
    public Long countProduct();
}
