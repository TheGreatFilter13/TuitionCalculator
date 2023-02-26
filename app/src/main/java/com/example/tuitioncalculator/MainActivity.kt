package com.example.tuition_calculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
//Imagine the Denver Chinese school is considering to revise its tuition standard. The school want to charge different level of tuitions based on the student’s age, gender and ethnicity.
//If the student’s age is below or equal to 15, the tuition will be 100$.
//If the student’s age is above 15 but smaller or equal to 20, the tuition will 80$ for male students and 60$ for female students.
//If the student’s age is above 20, the tuition will be 50$ for Chinese and 40$ for non-Chinese.

fun main() {
    val studentAge = 0
    val  studentGender = "male"
    val studentEthnicity = "Chinese"

    val tuitionCalculator = if(studentAge <= 15) { "Tuition will be $100"
    }else if (studentAge <= 15){
        "Tuition will be 100"
    }else if (studentAge > 15 || studentGender == "male" ){
        ; "Tuition will be 60"
    }else if (studentAge > 20 || studentEthnicity == "Chinese") {
        "Tuition will be $50"
    }else if (studentAge > 20 || studentEthnicity == "NChinese") {
        "Tuition will be $40"
    } else "Invalid input"
}
