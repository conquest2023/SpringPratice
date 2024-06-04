package com.example.rest_api.memoryDB.db;

import java.util.List;
import java.util.Optional;

public interface DataRepository<T,ID> extends Repository<T,ID>{

   //create

    T save(T data);


   //read
   Optional<T> findById(ID id);
   //데이터가 없으면 옵셔널로 리턴

    List<T> findAll();

    //update

    //delete
    void delete(ID id);


}
