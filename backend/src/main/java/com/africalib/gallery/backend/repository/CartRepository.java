package com.africalib.gallery.backend.repository;

import com.africalib.gallery.backend.entity.Cart;
import com.africalib.gallery.backend.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface CartRepository extends JpaRepository<Cart,Integer> {
    List<Cart> findByMembrId(int memberId);

    Cart findByIdAndItemId(int memberId, int itemId);
}
