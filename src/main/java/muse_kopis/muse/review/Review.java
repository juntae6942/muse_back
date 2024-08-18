package muse_kopis.muse.review;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;
import muse_kopis.muse.performance.Performance;

@Entity
@Getter
@NoArgsConstructor
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "performance_id")
    private Performance performance;
    private String content;
    private Integer star;
    private Boolean visible;

    public Review(Performance performance, String content, Integer star, Boolean visible) {
        this.performance = performance;
        this.content = content;
        this.star = star;
        this.visible = visible;
    }
}
