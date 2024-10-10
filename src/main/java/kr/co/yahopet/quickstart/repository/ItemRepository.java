package kr.co.yahopet.quickstart.repository;

import kr.co.yahopet.quickstart.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ItemRepository extends JpaRepository<ItemEntity, String> {

}