import org.junit.Test
import org.junit.Assert.*
import WallService.PostNotFoundException

class WallServiceTest {

    @Test
    fun add() {
        //arrange
        val original = Post(id = 0)
        val service = WallService
        val expected = 1

        //act
        val result = service.add(original).id

        //assert
        assertEquals(expected, result)
    }

    @Test
    fun update_exist_id() {
        //arrange
        val post1 = Post()
        val post2 = Post(id = 1)
        val service = WallService
        val expected = true
        service.add(post1)

        //act
        val result = service.update(post2)

        //assert
        assertEquals(expected, result)
    }

    @Test
    fun update_not_exist_id() {
        //arrange
        val post1 = Post()
        val post2 = Post(id = 10)
        val service = WallService
        val expected = false
        service.add(post1)

        //act
        val result = service.update(post2)

        //assert
        assertEquals(expected, result)
    }


    @Test(expected = PostNotFoundException::class)
    fun add_comment_not_exist_id() {
        val service = WallService
        val comment1 = Comment(14, text = "testText")

        service.addComment(comment1)
    }

    @Test(expected = PostNotFoundException::class)
    fun comment_exist_id() {
        val service = WallService
        val original = Post(0,1, text = "Новая Нетология", date = 1590075360, signerId = 21)
        val comment1 = Comment(33, text = "testText")
        val expected = true

        service.add(original)
        val result = service.addComment(comment1)
        service.addComment(comment1)

        assertEquals(expected, result)
    }

}