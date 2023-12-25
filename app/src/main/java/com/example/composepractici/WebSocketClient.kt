import org.java_websocket.client.WebSocketClient
import org.java_websocket.handshake.ServerHandshake
import java.net.URI

class MyWebSocketClient(uri: URI) : WebSocketClient(uri) {
    override fun onOpen(handshakedata: ServerHandshake?) {
        // Вызывается при открытии соединения
    }

    override fun onMessage(message: String?) {
        // Вызывается при получении сообщения
        // Обработайте данные, добавьте их в массив и обновите график
    }

    override fun onClose(code: Int, reason: String?, remote: Boolean) {
        // Вызывается при закрытии соединения
    }

    override fun onError(ex: Exception?) {
        // Вызывается при возникновении ошибки
    }
}
