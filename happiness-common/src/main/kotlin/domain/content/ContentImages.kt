package domain.content

import domain.BaseEntity
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class ContentImage (

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long?,

    val imageUrl: String,

) : BaseEntity()
