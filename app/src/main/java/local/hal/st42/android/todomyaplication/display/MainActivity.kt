package local.hal.st42.android.todomyaplication.display

import android.graphics.Color
import android.os.Bundle
import android.provider.SyncStateContract
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color.Companion.White
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import local.hal.st42.android.todomyaplication.ui.theme.TodoMyAplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            TodoMyAplicationTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    Greeting("Android")
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String) {
    Text(text = "Hello $name!")
}

//トップバー
@Composable
fun TopBar(){
    Scaffold {
        MyTopAppBar()
    }
}

@Composable
fun MyTopAppBar() {
    var expanded by remember { mutableStateOf(false) }

    TopAppBar(
        title = {
            Text(text = "Todoアプリ")
        },
        actions = {
            IconButton(
                onClick = {
                    expanded = true
                }
            ) {
                Icon(
                    Icons.Filled.MoreVert,
                    contentDescription = SyncStateContract.Constants.CONTENT_DIRECTORY,
                    tint = MaterialTheme.colors.surface,
                )
            }
            DropdownMenu(
                modifier = Modifier
                    .background(MaterialTheme.colors.background)
                    // タップされた時の背景を円にする
                    .clip(RoundedCornerShape(16.dp))
                    .background(MaterialTheme.colors.onSurface),
                expanded = expanded,
                // メニューの外がタップされた時に閉じる
                onDismissRequest = { expanded = false }
            ) {
                DropdownMenuItem(
                    onClick = {
                        // Do something
                    }
                ) {
                    Text(
                        text = "編集",
                        fontSize = 24.sp,
                        color = White,
                    )
                }
                DropdownMenuItem(
                    onClick = {}
                ) {
                    Text(
                        text = "2",
                        fontSize = 24.sp,
                        color = White,
                    )
                }
                DropdownMenuItem(
                    onClick = {}
                ) {
                    Text(
                        text = "3",
                        fontSize = 24.sp,
                        color = White,
                    )
                }
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
     TopBar()
}