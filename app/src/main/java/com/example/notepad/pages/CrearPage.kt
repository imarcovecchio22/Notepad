package com.example.notepad.pages

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.notepad.ui.theme.NotepadTheme

@Composable
fun CrearNotaPage(
    modifier: Modifier = Modifier,
    onNuevaNota: (String) -> Unit) {
    var texto by remember { mutableStateOf("Ingrese nota") }

    Column(modifier =modifier.fillMaxSize()) {

        TextField(
            value = texto,
            onValueChange = {texto=it }
        )

        Button(
            onClick = {
                onNuevaNota(texto)
            }
        ) {
            Text(
                text = "Crear nueva nota ",
                modifier = modifier
            )
        }
    }

}

@Preview(showBackground = true)
@Composable
fun CrearNotaPagePreview() {
    NotepadTheme {
        CrearNotaPage(onNuevaNota = {})
    }
}