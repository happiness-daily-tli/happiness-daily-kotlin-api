package domain.like

import domain.BaseEntity
import domain.content.Content
import domain.user.User
import javax.persistence.*

@Entity
class ContentLike(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    val post: Content,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    val user: User

) : BaseEntity()