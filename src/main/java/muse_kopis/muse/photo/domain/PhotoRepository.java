package muse_kopis.muse.photo.domain;

import java.util.List;
import muse_kopis.muse.ticketbook.domain.TicketBook;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PhotoRepository extends JpaRepository<Photo, Long> {

    List<Photo> findAllByTicketBook(TicketBook ticketBook);
}
