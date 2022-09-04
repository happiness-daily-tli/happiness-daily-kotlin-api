package domain.content

import domain.BaseEntity
import javax.persistence.*

@Entity
@Table(name = "content_hash_tags")
class ContentHashtag(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    val content: Content,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    val hashtag: Hashtag

) : BaseEntity()
