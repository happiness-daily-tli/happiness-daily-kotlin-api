package domain.post

import domain.BaseEntity
import javax.persistence.*

@Entity
class Post(

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val title: String,

    val content: String,

    @Enumerated(EnumType.STRING)
    val weather: PostWeather,

    val isOpen: Boolean,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    val postImages: PostImages,



) : BaseEntity()