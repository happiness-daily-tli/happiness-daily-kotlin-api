package domain.content

import domain.BaseEntity
import domain.comment.Comment
import javax.persistence.*

@Entity
class Content(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val title: String,

    val content: String,

    @Enumerated(EnumType.STRING)
    val weather: ContentWeather,

    val isOpen: Boolean,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    val contentImages: ContentImages,

) : BaseEntity()