package domain.user

import domain.BaseEntity
import javax.persistence.*

@Entity
class User(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val nickname: String,

    val socialType: String,

    val userLevel: Int,

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn
    val userAlarm: UserAlarm,

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn
    val userToken: UserToken,

) : BaseEntity()