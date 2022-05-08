package com.example.a1hw8

import android.content.Context
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT

fun Context.showToast(msg: String) {
    Toast.makeText(this, msg, LENGTH_SHORT).show()
}