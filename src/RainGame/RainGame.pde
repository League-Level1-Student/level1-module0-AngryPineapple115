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
  rect(mouseX, mouseY, 30, 30);
  
  if (raindropx>=mouseX&&raindropx<=mouseX+50&&raindropy==mouseY&&raindropy==mouseY-50) {
    
    
    
  }
  
  
  

  fill(0, 0, 0);
  textSize(16);
  text("Score: ", 20, 20);
}