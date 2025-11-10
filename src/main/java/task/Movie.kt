package task

class Movie(
    override val title: String,
    override val runtime: Long,
) : Video {
    override fun equals(other: Any?): Boolean = other is Movie && this.title == other.title
    override fun hashCode(): Int = title.hashCode()
}