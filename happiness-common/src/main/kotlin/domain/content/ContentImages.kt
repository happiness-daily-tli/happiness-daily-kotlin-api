package domain.content

import domain.BaseEntity
import javax.persistence.Entity
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
class ContentImage(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id")
    val content: Content,

    val imageUrl: String,

) : BaseEntity()
