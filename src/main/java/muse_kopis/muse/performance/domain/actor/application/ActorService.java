package muse_kopis.muse.performance.domain.actor.application;

import muse_kopis.muse.performance.domain.actor.domain.dto.ActorDto;

import java.util.List;

public interface ActorService {

    Long favorite(Long memberId, String actorsName);
    List<ActorDto> favorites(Long memberId);
}
