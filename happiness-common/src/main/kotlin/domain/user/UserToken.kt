package domain.user

import domain.BaseEntity
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class UserToken(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val refreshToken: String

) : BaseEntity()