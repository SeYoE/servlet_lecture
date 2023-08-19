package hello.servlet.domain.member;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 실무에서는 동시성 문제 때문에 HashMap 대신 ConcurrentHashMap, AtomicLong 사용 해야 함.
 */
public class MemberRepository {

    // static 이니까 객체가 많아도 필드는 하나만 존재
    private static Map<Long, Member> store = new HashMap<>();
    private static long sequence = 0L;

    // 싱글톤
    private static final MemberRepository instance = new MemberRepository();

    public static MemberRepository getInstance() {
        return instance;
    }

    // 싱글톤은 생성자 막아야 함.
    private MemberRepository() {
    }

    public Member save(Member member) {
        member.setId(++ sequence);
        store.put(member.getId(), member);
        return member;
    }

    public Member findById(Long id) {
        return store.get(id);
    }

    public List<Member> findAll() {
        return new ArrayList<>(store.values());
    }

    public void clearStore() {
        store.clear();
    }

}
