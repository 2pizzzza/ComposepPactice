import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Canvas
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.CornerRadius
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.drawscope.DrawScope
import androidx.compose.ui.tooling.preview.Preview
import java.net.URI

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FeatherAndroidTasksTheme {
                // Вызовите Composable-функцию, отображающую ваш график
                RealTimeGraph()
            }
        }
    }
}

@Composable
fun RealTimeGraph() {
    // Инициализация объекта WebSocketClient
    val webSocketClient = remember {
        MyWebSocketClient(URI("wss://stream.binance.com:9443/ws/!miniTicker@arr"))
    }

    // Запуск WebSocket при старте Composable
    LaunchedEffect(webSocketClient) {
        webSocketClient.connect()
    }

    // Composable для отображения графика
    Canvas(
        modifier = Modifier.fillMaxSize(),
        onDraw = {
            // Нарисуйте график здесь, используя данные из WebSocket
            drawGraph(this)
        }
    )
}

// Пример отрисовки графика (замените его своим кодом)
private fun DrawScope.drawGraph(drawScope: DrawScope) {
    // Рисование простого прямоугольника
    drawRoundRect(
        color = Color.Blue,
        size = size,
        cornerRadius = CornerRadius(0f)
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    FeatherAndroidTasksTheme {
        RealTimeGraph()
    }
}

@Composable
fun FeatherAndroidTasksTheme(content: @Composable () -> Unit) {
    TODO("Not yet implemented")
}
