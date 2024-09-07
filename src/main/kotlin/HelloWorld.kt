
import kotlinx.coroutines.*

fun main() = runBlocking{
    launch {
        doWorld("Hello")
    }
    launch {
        doWorld(" World")
    }
    println("Application Started")
}

suspend fun doWorld(message: String){
    delay(100)
    println(message)
}

/**
 * Here are 3 threads running in this code, 1 for main method, 1 each for launch.
 * runBlocking:  It is coroutine builder, which bridge non-coroutine world with coroutine world,
 * it also provides coroutineScope for launch here,
 * Thread which running runBlocking, in this case main thread will get blocked until all coroutine within this block is completed.
 * launch: this will create coroutine to run code
 * delay: non-blocking, suspending function,
 *
 *
 */