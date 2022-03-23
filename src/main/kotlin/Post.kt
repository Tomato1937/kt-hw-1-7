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
    val postType: String = "none",
    val postSource: PostSource = PostSource("none", "none", "none", "none"),
    val attachments: Array<Attachment>? = null,
    val geo: Geo = Geo("none", "none", place = null),
    val signerId: Int? = null,
    val copyHistory: Array<Post>? = null,
    val canPin: Boolean = false,
    val canDelete: Boolean = false,
    val canEdit: Boolean = false,
    val isPinned: Int = 0,
    val markedAsAds: Boolean = false,
    val isFavorite: Boolean = false,
    val donut: Donut = Donut(false, 0, Placeholder(false),
        false, "none"),
    val postponedId: Int = 0
)

class Comments(
    val count: Int = 0,
    val canPost: Boolean = false,
    val groupsCanPost: Int = 0,
    val canClose: Boolean = false,
    val canOpen: Boolean = false
)

class Copyright(
    val id: Int = 0,
    val link: String = "none",
    val name: String = "none",
    val type: String = "none"
)

class Likes(
    val count: Int = 0,
    val userLikes: Boolean = false,
    val canLike: Boolean = false,
    val canPublish: Boolean = false
)

class Reposts(
    val count: Int = 0,
    val userReposted: Boolean = false
)

class Views(
    val count: Int = 0
)

class PostSource(
    val type: String = "none",
    val platform: String = "none",
    val data: String = "none",
    val url: String = "none"
)

class Geo(
    val type: String = "none",
    val coordinates: String = "none",
    val place: Place? = Place()
)

class Donut(
    val isDonut: Boolean = false,
    val paidDuration: Int = 0,
    val placeholder: Placeholder,
    val canPublishFreeCopy: Boolean = false,
    val editMode: String = "none"
)

class Placeholder(
    val placeholder: Boolean = false
)

class Place(
    val id: Int = 0,
    val title: String = "none",
    val latitude: Int = 0,
    val longitude: Int = 0,
    val created: Int = 0,
    val icon: String = "none",
    val checkins: Int = 0,
    val updated: Int = 0,
    val type: Int = 0,
    val country: String = "none",
    val city: String = "none",
    val adress: String = "none"
)