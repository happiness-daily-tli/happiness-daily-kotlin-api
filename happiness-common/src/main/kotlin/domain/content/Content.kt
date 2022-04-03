package domain.content

import domain.BaseEntity
import domain.comment.Comment
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.ManyToOne
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "contents")
class Content(

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    val id: Long? = null,

    val title: String,

    val content: String,

    @Enumerated(EnumType.STRING)
    val weather: ContentWeather,

    val isOpen: Boolean,

    @OneToMany(mappedBy = "content")
    val contentImages: List<ContentImage>? = null,

    @OneToMany(mappedBy = "content")
    val comment: List<Comment>? = null,

) : BaseEntity()
