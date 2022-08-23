package local.hal.st42.android.todomyaplication.display

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment.Companion.CenterHorizontally
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun EditDisplay(){
    var text by remember { mutableStateOf("Hello") }

    TopBar()

    Column(
        horizontalAlignment = CenterHorizontally,
        modifier = Modifier
            .fillMaxWidth()
    ){
        Text(text = "編集画面")
        
        TextField(
            value = text,
            onValueChange = { text = it },
            label = { Text("作戦名") },
            modifier = Modifier.padding(10.dp),
            textStyle = TextStyle(fontWeight = FontWeight.Bold,
                fontSize = 30.sp)
        )
    }







}
@Preview
@Composable
fun confirmation(){
    EditDisplay()
}