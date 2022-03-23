data class Comment (
    val id: Int = 0,
    val fromId: Int = 0,
    val date: Int = 0,
    val text: String = "none",
    val donut: Donut = Donut(false, 0, Placeholder(false),
        false, "none"),
    val replyToUser: Int = 0,
    val replyToComment: Int = 0,
    val attachments: Array<Attachment>? = null,
    val parentsStack: Array<Comments>? = null,
    val thread: Thread = Thread(0, emptyArray<Attachment>(), false, false, false)
)

class Thread(
    val count: Int = 0,
    val items: Array<Attachment> = emptyArray<Attachment>(),
    val canPost: Boolean = false,
    val showReplyButton: Boolean = false,
    val groupsCanPost: Boolean = false
)

//
//class Donut(
//    val isDonut: Boolean = false,
//    val paidDuration: Int = 0,
//    val placeholder: Placeholder,
//    val canPublishFreeCopy: Boolean = false,
//    val editMode: String = "none"
//)
//
//class Placeholder(
//    val placeholder: Boolean = false
//)