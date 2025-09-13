fun ViewHolaCurso() {
    Column(
        modifier = Modifier
            .fillMaxWith()   // ❌ Error: debería ser fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Welcome to the Course!",
            fontSize = 28.sp,
            fontWeight = FontWeigh.Bold   // ❌ Error: debería ser FontWeight.Bold
        )
        Spacer(modifier = Modifier.heigh(16.dp))   // ❌ Error: debería ser height()
      Text(
    text = "Hello, Student!",
    fontSize = 24.sp,       // más grande
    color = Color.Red,      // color nuevo
    fontStyle = FontStyle.Italic  // estilo cursiva
)
    }
}
