package domain.user

import domain.BaseEntity
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class User(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val nickname: String,

    val socialType: String,

    val refreshToken: String,

) : BaseEntity()