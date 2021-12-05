package domain.comment

import domain.BaseEntity
import domain.content.Content
import javax.persistence.*

@Entity
class Comment(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val commentContent: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    val content: Content

) : BaseEntity()