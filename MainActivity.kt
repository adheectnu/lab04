fun ViewHolaCurso() {
    Column(
        modifier = Modifier
            .fillMaxWith()   // ❌ Error: debería ser fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
       Text(
    text = "Welcome to the Course!",
    fontSize = 32.sp,
    fontWeight = FontWeight.Bold,
    color = Color.Blue
)
        Spacer(modifier = Modifier.heigh(16.dp))   // ❌ Error: debería ser height()
        Text(
            text = "Hello, Student!",
            fontSize = 20.xD   // ❌ Error: debería ser 20.sp
        )
    }
}
