package com.happiness.api.v1.content.adapter.out.infrastructure.persistence

import domain.content.Content
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ContentRepository : JpaRepository<Content, Int> {

}
