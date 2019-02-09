void setup() {

  size(900, 900);
}

int raindropy = 225;
int raindropx = 450;
int score = 0;

void draw() {

  background(#458E5A);

  fill(#1467F2);
  stroke(#1467F2);
  ellipse(raindropx, raindropy, 50, 50);

  raindropy = raindropy + 9;

  fill(#989898);
  stroke(#989898);
  rect(mouseX, mouseY, 80, 80);

  checkCatch();
}

void checkCatch() {
  if (raindropx>=mouseX&&raindropx<=mouseX+50&&raindropy==mouseY&&raindropy==mouseY-50)
    score++;
  if (score == 0)
    score--;
  println("Your score is now: " + score);

  fill(0, 0, 0);
  textSize(16);
  text("Score: " + score, 20, 20);
}