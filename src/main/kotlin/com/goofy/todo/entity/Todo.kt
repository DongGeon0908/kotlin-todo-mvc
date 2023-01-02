package com.goofy.todo.entity

import com.goofy.todo.entity.enum.TodoStatus
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.EnumType
import javax.persistence.Enumerated
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "todo")
class Todo(
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    @Column(name = "title")
    val title: String,

    @Column(name = "content")
    val content: String,

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    val status: TodoStatus
) : BaseEntity()
