package dev.dayozoe.samples.callme.repository

import org.springframework.stereotype.Repository
import dev.dayozoe.samples.callme.model.Conversation

@Repository
class ConversationRepository(private val conversations: MutableList<Conversation> = mutableListOf()) {

    fun findByRequestId(requestId: Int): Conversation? = conversations.find { it.request.id == requestId }

    fun findAll(): MutableList<Conversation> = conversations

    fun add(conversation: Conversation) = conversations.add(conversation)

}