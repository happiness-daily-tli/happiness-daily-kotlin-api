package domain.content

import domain.BaseEntity
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne

@Entity
class Content(

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    val id: Long? = null,

    val title: String,

    val content: String,

    @Enumerated(EnumType.STRING)
    val weather: ContentWeather,

    val isOpen: Boolean,

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn
    val contentImages: List<ContentImage>? = null,

) : BaseEntity()
