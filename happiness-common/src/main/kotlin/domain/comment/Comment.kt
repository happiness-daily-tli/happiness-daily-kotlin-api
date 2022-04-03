package domain.comment

import domain.BaseEntity
import domain.content.Content
import javax.persistence.*

@Entity
@Table(name = "comments")
class Comment(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val commentContent: String,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    val content: Content,

) : BaseEntity()
