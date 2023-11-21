package hello.hellospring.controller;

import hello.hellospring.domain.Member;
import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller // Spring 컨테이너가 Spring 처음 뜰 때
// Spring 컨테이너와 통이 생기는데 거기에 컨트롤러 애노테이션이 있으면 멤버 컨트롤러 객체를 생성하여
// Spring 에 넣어두며 spring이 관리합니다.
public class MemberController {

    //     1. 생성자 주입
    private final MemberService memberService;

    @Autowired // 스프링 컨테이너에 있는 멤버 서비스에 가져다가 연결 시켜줍니다.
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }

//     2. 필드 주입 (별로 좋지 않음!!) 바꿀수 있는 방법 이 없음
//    @Autowired private final MemberService memberService;

    //     3. Setter 주입
//    @Autowired
//    public void setMemberService(MemberService memberService) {
//      this.memberService = memberService;
//    }
    @GetMapping(value = "/members/new")
    public String createForm() {
        return "members/createMemberForm";
    }

    @PostMapping("/members/new")
    public String create(MemberForm form) {
        Member member = new Member();
        member.setName(form.getName());

        memberService.join(member);

        return "redirect:/";
    }
    @GetMapping("/members")
    public String list(Model model) {
        List<Member> members = memberService.findMembers();
        model.addAttribute("members", members);
        return "members/memberList";
    }
}
