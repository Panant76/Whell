package by.vitstep.MyProject.entity.wheel;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Entity
@Data
@Builder
@Table(name = "wheel_size")
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Size {
    private static final String SEQ_NAME = "wheel_size_id_seq";
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = SEQ_NAME)
    @SequenceGenerator(name = SEQ_NAME, sequenceName = SEQ_NAME, allocationSize = 1)
    Long id;
    Integer width;
    Integer profileHeight;
    DiskDiameter diskDiameter;
}
