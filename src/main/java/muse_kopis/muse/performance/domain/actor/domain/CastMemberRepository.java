package muse_kopis.muse.performance.domain.actor.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CastMemberRepository extends JpaRepository<CastMember, Long> {

    CastMember findByName(String name);
}
