package id.infinitelearning.KotlinSubmission.exercise4

fun main() {

    /**
     * Buatlah contoh code penggunaan try catch untuk menangani suatu kasus sesuai keinginan teman-teman
     *
     */
    // Buat di bawah sini
    try {
        val username = enterUsername()
        val password = enterPassword()

        login(username, password)
        println("Login berhasil!")
    } catch (e: InvalidInputException) {
        println("Error: ${e.message}")
    } catch (e: AuthenticationException) {
        println("Error: ${e.message}")
    }
}

fun enterUsername(): String {
    print("Username: ")
    val username = readLine() ?: throw InvalidInputException("Username tidak boleh kosong.")
    return username
}

fun enterPassword(): String {
    print("Password: ")
    val password = readLine() ?: throw InvalidInputException("Password tidak boleh kosong.")
    return password
}

fun login(username: String, password: String) {
    if (username == "Yunika Tri Rezeki" && password == "yuyunz") {
    } else {
        throw AuthenticationException("Username atau password yang anda masukkan salah. Silakan coba lagi.")
    }
}

class InvalidInputException(message: String) : Exception(message)

class AuthenticationException(message: String) : Exception(message)

