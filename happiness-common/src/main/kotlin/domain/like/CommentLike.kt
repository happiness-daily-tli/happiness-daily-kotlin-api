package domain.like

import domain.BaseEntity
import domain.comment.Comment
import domain.user.User
import javax.persistence.*

@Entity
class CommentLike(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    val comment: Comment,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    val user: User

) : BaseEntity()