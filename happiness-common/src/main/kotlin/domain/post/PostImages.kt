package domain.post

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class PostImages (

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val imageUrl: String,
)