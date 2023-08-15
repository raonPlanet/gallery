package com.africalib.gallery.backend.repository;

import com.africalib.gallery.backend.entity.Item;
import com.africalib.gallery.backend.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;


public interface MemberRepository extends JpaRepository<Member,Integer> {

    Member findByEmailAndPassword(String email,String password);
}
