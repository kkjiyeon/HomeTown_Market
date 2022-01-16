package com.example.market.domain.wish;

import com.example.market.domain.wish.Wish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface WishRepository extends JpaRepository<Wish, Long> {

    @Modifying
    @Query(value = "INSERT INTO wish(product_id, user_id) VALUES(:productId, :userId)", nativeQuery = true)
    void wishing(long productId, String userId);

    //추가할거 삭제, 조회


}
