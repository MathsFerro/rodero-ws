package com.rodero.roderows.domain.repository;

import com.rodero.roderows.domain.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends JpaRepository<Client, Long> {

    // TODO TESTAR
//    Page<Client> findAllByFilter(Pageable pageable, ClientFilterDTO filter);

}
