data class Post (
    val id: Int = 0,
    val ownerId: Int = 0,
    val fromId: Int = 0,
    val createdBy: Int = 0,
    val date: Int = 0,
    val text: String = "none",
    val replyOwnerId: Int = 0,
    val replyPostId: Int = 0,
    val friendsOnly: Boolean = false,
    val comments: Comments = Comments(0, false, 0, false, false),
    val copyright: Copyright = Copyright(0, "none", "none", "none"),
    val likes: Likes = Likes(0, false, false, false),
    val reposts: Reposts = Reposts(0, false),
    val views: Views = Views(0),
    val post_type: String = "none",
    val signerId: Int = 0,
    val canPin: Boolean = false,
    val canDelete: Boolean = false,
    val canEdit: Boolean = false,
    val isPinned: Int = 0,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val donut: Donut = Donut(false, 0, Placeholder(false), false, "none"),
    val postponedId: Int = 0
)

class Comments(
    val count: Int = 0,
    val can_post: Boolean = false,
    val groups_can_post: Int = 0,
    val can_close: Boolean = false,
    val can_open: Boolean = false
)

class Copyright(
    val id: Int = 0,
    val link: String = "none",
    val name: String = "none",
    val type: String = "none"
)

class Likes(
    val count: Int = 0,
    val user_likes: Boolean = false,
    val can_like: Boolean = false,
    val can_publish: Boolean = false
)

class Reposts(
    val count: Int = 0,
    val user_reposted: Boolean = false
)

class Views(
    val count: Int = 0
)

class Donut(
    val is_donut: Boolean = false,
    val paid_duration: Int = 0,
    val placeholder: Placeholder,
    val can_publish_free_copy: Boolean = false,
    val edit_mode: String = "none"
)

class Placeholder(
    val placeholder: Boolean = false
)