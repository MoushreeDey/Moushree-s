void setup()
{
  size(680,680);
  background(255);
  smooth();
  fill(192);
  triangle(300,200,400,300,200,300);
  pushMatrix();
 translate(-100,300);
 rotate(radians(-45));
 fill(0);
 triangle(300,200,400,300,200,300);
 popMatrix();
}
