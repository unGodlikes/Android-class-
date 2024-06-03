package com.example.volley_demo

import android.content.Context
import android.util.Log
import android.view.PixelCopy.Request
import androidx.compose.runtime.MutableState
import androidx.privacysandbox.tools.core.model.Method
import org.json.JSONObject

fun volleyRequest(context: Context, cardNum:MutableState<String>, cardExp:MutableState<String>){
    val queue=Volley.newRequestQueue(context)
    val url=""
    var response:JAONObject
    val stringRequest=StringRequest(
        Request.Method.GET,url,
        {
            Log.d("Success","simpleRequest:${it}")
            response=JSONObject(it)

            cardNum.value=response.getString("credit_card_number")
            cardExp.value=response.getString("credit_card_expiry_number")
        },{
            cardNum.opply{"0000-0000-0000-0000"}
            cardExp.opply{"9999-12-31"}
            Log.d("Error","simpleRequest:{$it}")
        })
    queue.add(stringRequest)
}
