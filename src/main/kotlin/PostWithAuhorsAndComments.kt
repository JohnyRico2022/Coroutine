data class PostWithAuhorsAndComments(
    val post: Post,
    val author: Author,
    val comments: List<CommentWithAuthor>
)
