package com.example.librarysystem.domain.repository;

import com.example.librarysystem.domain.model.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member, Long> {}