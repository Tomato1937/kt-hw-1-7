import org.junit.Test

import org.junit.Assert.*

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
}