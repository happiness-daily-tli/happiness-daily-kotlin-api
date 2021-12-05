package domain.user

import domain.BaseEntity
import javax.persistence.*

@Entity
class UserAlarm(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val deviceToken: String,

    @Enumerated(EnumType.STRING)
    val alarmType: AlarmType,

) : BaseEntity()