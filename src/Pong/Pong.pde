import ddf.minim.*;  
Minim minim;
AudioSample sound;

PImage backgroundImage;

void setup() {

  minim = new Minim (this);
  //sound = minim.loadSample("pong.wav", 128);

  backgroundImage = loadImage("http://is2.mzstatic.com/image/thumb/Purple62/v4/12/e4/7a/12e47a4a-0668-75fd-521e-be6b5826f5f6/source/512x512bb.jpg");
  size (800, 800);

  if (ballx<31) {
    sound.trigger();
  }
}

int ballx = 400 ;
int bally = 400;

int paddlex = mouseX;
int paddley = 750;

int paddlelength = 200;

int ballspeedx = 1;
int ballspeedy = 1;

boolean intersects(int ballx, int bally, int paddlex, int paddley, int paddlelength) {
  if (bally > paddley && ballx > paddlex && ballx < paddlex + paddlelength)
    return true;
  else
    return false;
}

void draw() {

  image(backgroundImage, 0, 0);
  image(backgroundImage, 0, 0, width, height);

  fill(#4EBC5B);
  stroke(#4EBC5B);
  ellipse(ballx, bally, 50, 50);
  rect(mouseX-100, 750, paddlelength, 30);

  for (int i = 0; i < 10; i++) {
    ballx = ballx-ballspeedx;
    bally = bally-ballspeedy;
  }

  if (ballx>798&&ballx<800) {
    ballspeedx = -ballspeedx;
  } else if (ballx<2&&ballx>0) {
    ballspeedx = -ballspeedx;

    if (bally>798&&bally<800) {
      ballspeedx = -ballspeedx;
    } else if (bally<2&&bally>0) {
      ballspeedy = -ballspeedy;
    }

    if (intersects(ballx, bally, paddlex, paddley, paddlelength)) {
    }
  }
}
