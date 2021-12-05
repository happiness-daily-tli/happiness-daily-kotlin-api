package domain.comment

import domain.BaseEntity
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Comment(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val content: String,

) : BaseEntity()