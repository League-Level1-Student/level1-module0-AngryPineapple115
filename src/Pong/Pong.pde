import ddf.minim.*;  
Minim minim;
AudioSample sound;

PImage backgroundImage;

void setup() {

  minim = new Minim (this);
  //sound = minim.loadSample("pong.wav", 128);

  backgroundImage = loadImage("http://is2.mzstatic.com/image/thumb/Purple62/v4/12/e4/7a/12e47a4a-0668-75fd-521e-be6b5826f5f6/source/512x512bb.jpg");
  size (800, 800);
}

int ballx = 400;
int bally = 400;

int paddlex = mouseX;
int paddley = 750;

int paddlelength = 100;

int forever = ;

boolean intersects(int ballx, int bally, int paddlex, int paddley, int paddlelength) {
  if (bally > paddley && ballx > paddlex && ballx < paddlex + paddlelength)
    return true;
  else 
  return false;
}

void draw() {

  image(backgroundImage, 0, 0);
  image(backgroundImage, 0, 0, width, height);

  fill (#4EBC5B);
  stroke(#4EBC5B);
  ellipse(ballx, bally, 50, 50);
  rect(mouseX-50, 750, 100, 30);

  for (int i = 0; i < ; i++) {
    ballx = ballx-0;
    bally = bally-0;
  }


  if (intersects(ballx, bally, paddlex, paddley, paddlelength)) {
  }
}
