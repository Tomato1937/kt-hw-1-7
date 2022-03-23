object WallService{
    private var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

    fun addComment(comment: Comment): Boolean {
        for (value in posts) {
            if (value.id == comment.id) {
                comments += comment.copy(text = comment.text)
                return true
            }
        }
        throw PostNotFoundException("Сообщение с данным ID не найдено")
    }

    class PostNotFoundException(message: String): RuntimeException(message)

    fun add(post: Post): Post {
        if (posts.size == 0) {
            posts += post.copy(id = posts.size + 1)
        } else {
            posts += post.copy(id = posts.last().id + 1)
        }
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