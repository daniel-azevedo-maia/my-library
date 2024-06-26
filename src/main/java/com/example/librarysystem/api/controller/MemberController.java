package com.example.librarysystem.api.controller;

import com.example.librarysystem.domain.model.Member;
import com.example.librarysystem.domain.service.MemberService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/members")
public class MemberController {

    private final MemberService memberService;

    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

    @GetMapping
    public List<Member> getAllMembers() {
        return memberService.getAllMembers();
    }

    @PostMapping
    public Member createMember(@Valid @RequestBody Member member) {
        return memberService.createMember(member);
    }
}
