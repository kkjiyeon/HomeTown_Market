//package com.example.market.domain.wish;
//
//import lombok.RequiredArgsConstructor;
//import org.springframework.stereotype.Service;
//import org.springframework.transaction.annotation.Transactional;
//
//@Service
//@RequiredArgsConstructor
//public class WishService {
//
//    private final WishRepository wishRepository;
//
//    @Transactional
//    public void wishing(long productId, String userId) {
//
//        // 리포지토리에서 조회
//        // 널이면 찜 생성
//        // 잇으면 삭제하고 카운트 줄이고
//
//        wishRepository.wishing(productId, userId);
//    }
//
//}
