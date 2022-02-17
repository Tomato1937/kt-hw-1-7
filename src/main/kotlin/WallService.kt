object WallService{
    private var posts = emptyArray<Post>()

    fun add(post: Post): Post {
        posts += post.copy(id = posts.size +1)
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, value) in posts.withIndex()) {
            if (value.id == post.id) {
                posts[index] = post.copy(ownerId = value.ownerId, date = value.date)
                return true
            }
        }
        return false
    }
}