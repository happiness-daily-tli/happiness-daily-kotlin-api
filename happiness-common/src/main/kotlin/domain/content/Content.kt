package domain.content

import domain.BaseEntity
import domain.comment.Comment
import enums.ContentWeather
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.FetchType
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.OneToMany
import javax.persistence.Table

@Entity
@Table(name = "contents")
class Content(

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long = 0,

    @Column(name = "title", nullable = false)
    val title: String,

    @Column(name = "content", nullable = false)
    val content: String,

    @Enumerated(EnumType.STRING)
    val weather: ContentWeather,

    @Column(name = "is_open")
    val isOpen: Boolean = true,

    @OneToMany(mappedBy = "content", fetch = FetchType.LAZY)
    val contentImages: List<ContentImage>? = null,

    @OneToMany(mappedBy = "content", fetch = FetchType.LAZY)
    val comment: List<Comment>? = null,

    ) : BaseEntity()
