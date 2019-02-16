import ddf.minim.*;  
Minim minim;
AudioSample sound;

void setup() {

  minim = new Minim (this);
  sound = minim.loadSample("pong.wav", 128);

  size(800, 800);
  background(#D85E5E);
}

int ballx = 100;
int bally = 400;


void draw() {

  fill (#4EBC5B);
  stroke(#4EBC5B);
  ellipse(width/2, height/2, 50, 50);
}