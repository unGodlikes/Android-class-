package com.example.lwh
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

import com.example.lwh.ui.theme.LWHTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            LWHTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    UserCardList()
                }
            }
        }
    }
}

data class User(var userAvatar:Int,var userName:String,var userBio:String)

@Composable
fun UserCard(user:User){
    Row (verticalAlignment = Alignment.CenterVertically, modifier = Modifier
        .padding(bottom = 10.dp)
        .fillMaxWidth()
        .size(width = 200.dp, height = 100.dp)
        .background(Color.White)
    ){
        Box{
            Image(painter = painterResource(id = user.userAvatar), contentDescription = null, modifier = Modifier
                .size(100.dp)
                .padding(20.dp)
                .clip(CircleShape)
            )
        }
        Column {
            Text(text = user.userName, style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 18.sp))
            Text(text = user.userBio)
        }
        Text(text = "3 min ago", modifier = Modifier.padding(15.dp), color = Color.Gray)
    }
}

@Composable
fun UserCardList(){
    Box{
        Column {
            val users = listOf<User>(
                User(R.drawable._1a79760b5cc1111013eaf70b18662_jpg_1280w_1l_2o_100sh,"林一晴","赚钱养老妈"),
                User(R.drawable.oip_c,"司徒星","摸鱼每一天"),
                User(R.drawable._0200508145029_hutox,"谢一航","赚钱养老婆"),
                User(R.drawable.v2_b512175c0daa54827287a35d0c322c40_r,"吴一琳","养活废物弟弟"),
                User(R.drawable.v2_4a5e540bfb5de95adcd7d03af669f57d_720w,"赵艺","我有两个哥，不上班也饿不死！"),
                User(R.drawable.v2_d81f45bcbda578ba89e3ebcfa90baa87_r,"陈灵伟","摆烂至上"),
                User(R.drawable._0220221224434_0808d,"赵悠悠","天选打工人"),
            )
            repeat(users.size){index->
                UserCard(users[index])
            }
            UserCard(users[0])
            UserCard(users[0])
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun GreetingPreview() {
    LWHTheme {
        UserCardList()
    }
}

