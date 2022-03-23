abstract class Attachment(open val type: String) {

}

class Video(
    id: Int = 0,
    ownerId: Int = 0,
    title: String = "none",
    duration: Int = 0
) : Attachment("video") {}

class Image(
    id: Int = 0,
    ownerId: Int = 0,
    imagePreview: String = "none",
    size: Int = 0
) : Attachment("image"){}

class Doc(
    id: Int = 0,
    ownerId: Int = 0,
    title: String = "none",
    size: Int = 0
) : Attachment("file"){}

class Audio(
    id: Int = 0,
    ownerId: Int = 0,
    artist: String = "none",
    duration: Int = 0
) : Attachment("audio"){}

class Archive(
    id: Int = 0,
    ownerId: Int = 0,
    title: String = "none",
    size: Int = 0
) : Attachment("archive"){}