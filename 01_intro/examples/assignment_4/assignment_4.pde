/*****
*Assignment 4
* This program allows the user to choose a year between 1980 and 2013 and see the 25 most popular male baby names of that year
*/

float g_values[];
String g_names[];
float g_years[];
boolean g_startScreen = true;

void setup()
{
  background(255);
  size(950, 950);
  String[] lines = loadStrings("names.txt");
  g_values = new float[lines.length-1];
  g_names = new String[lines.length-1];
  g_years = new float[lines.length-1];
  for (int i = 0; i < lines.length; i++)
  {
    String[] fields = split(lines[i], ",");
    if (i > 0 )
    {
      g_values[i-1] = float(fields[3]);
      g_names[i-1] = fields[2];
      g_years[i-1] = float(fields[1]);
    }
  }
  start();
}
void draw()
{
 
}
void mousePressed()
{
  if (g_startScreen == true)
  {
    int chosenYear = year(mouseX, mouseY);
    if (chosenYear != 0 )
    {
      graph(chosenYear);
    }
  }
  if(g_startScreen == false)
  {
    if(mouseX >= 700 && mouseX <=830 && mouseY >= 800 && mouseY <= 865)
    {
      background(255);
      start();
    }
  }
}
void start()
{
  //makes the start screen with all of the years available to choose
  int start = 50;
  int startY = 65;
  int startText = 1980;
  textSize(25);
  fill(255, 75, 210, 135);
  for (int i = 0; i < 7; i++)
  {
    if (i < 6)
    {
      for (int j = 0; j < 5; j++)
      {
        rect(start, startY, 130, 65);
        fill(0);
        text(startText, start+20, startY+32);
        fill(255, 75, 210, 135);
        start = start + 180;
        startText++;
      }
    } else
    {
      for (int j = 0; j < 4; j++)
      {
        rect(start, startY, 130, 65);
        fill(0);
        text(startText, start+20, startY+32);
        fill(255, 75, 210, 135);
        start = start + 180;
        startText++;
      }
    }
    start = 50;
    startY = startY + 130;
  }
  g_startScreen = true;
  save("assignment4start.jpg");
}
void graph(int year)
{
  //creates a graph of whichever year is chosen by the user
  background(255);
  fill(0);
  textSize(20);
  String title = "Popular Male Baby Names in " + year;
  text(title, 200, 50);
  int start = (year-1980) * 25;
  float minX = width*0.10;
  float maxX = width*0.95;
  float minY = height*0.10;
  float maxY = height * 0.95;
  float barSpace = (maxY-minY)/25;
  float barW = barSpace * .75;
  float y = minY;
  for (int c = 0; c < 25; c++)
  {
    float h = map(g_values[start+c], 0, g_values[start]+200, 0, maxX-minX);
    fill(0, 100, 240, 150);
    rect(minX, y, h, barW);
    fill(0);
    textSize(15);
    text(int(g_values[start+c]), h+100, y+10);
    text(g_names[c+start], 10, y+10);
    y = y + barSpace;
  }

  //total value
  float sum = 0;
  for (int c = 0; c < 25; c++)
  {
    sum = sum + g_values[start+c];
  }

  String sumtext = "*Total Names: " + sum;
  text(sumtext, 700, 400);

  fill(255, 75, 210, 135);
  rect(700, 800, 130, 65);
  fill(0);
  textSize(25);
  text("GO BACK", 710, 842);
  g_startScreen = false;
  save("assignment4graph.jpg");
}

int year(float x, float y)
{
  //determines what year the user chose off of the start screen
  if ( x >= 50 && x <= 180)
  {
    if (y>=65 && y <=130)
    {
      return 1980;
    }
    if (y>=195 && y <=260)
    {
      return 1985;
    }
    if (y >=325 && y <=390)
    {
      return 1990;
    }
    if (y >=455 && y<= 520)
    {
      return 1995;
    }
    if (y >=585 && y<=650)
    {
      return 2000;
    }
    if (y>=715 && y <=780)
    {
      return 2005;
    }
    if (y >=845 && y<=910)
    {
      return 2010;
    }
  }
  if ( x >=230 && x <=360)
  {
    if (y>=65 && y <=130)
    {
      return 1981;
    }
    if (y>=195 && y <=260)
    {
      return 1986;
    }
    if (y >=325 && y <=390)
    {
      return 1991;
    }
    if (y >=455 && y<= 520)
    {
      return 1996;
    }
    if (y >=585 && y<=650)
    {
      return 2001;
    }
    if (y>=715 && y <=780)
    {
      return 2006;
    }
    if (y >=845 && y<=910)
    {
      return 2011;
    }
  }
  if (x >= 410 && x <=540)
  {
    if (y>=65 && y <=130)
    {
      return 1982;
    }
    if (y>=195 && y <=260)
    {
      return 1987;
    }
    if (y >=325 && y <=390)
    {
      return 1992;
    }
    if (y >=455 && y<= 520)
    {
      return 1997;
    }
    if (y >=585 && y<=650)
    {
      return 2002;
    }
    if (y>=715 && y <=780)
    {
      return 2007;
    }
    if (y >=845 && y<=910)
    {
      return 2012;
    }
  }
  if (x >= 590 && x <=720)
  {
    if (y>=65 && y <=130)
    {
      return 1983;
    }
    if (y>=195 && y <=260)
    {
      return 1988;
    }
    if (y >=325 && y <=390)
    {
      return 1993;
    }
    if (y >=455 && y<= 520)
    {
      return 1998;
    }
    if (y >=585 && y<=650)
    {
      return 2003;
    }
    if (y>=715 && y <=780)
    {
      return 2008;
    }
    if (y >=845 && y<=910)
    {
      return 2013;
    }
  }
  if (x >= 770 && x <=900)
  {
    if (y>=65 && y <=130)
    {
      return 1984;
    }
    if (y>=195 && y <=260)
    {
      return 1989;
    }
    if (y >=325 && y <=390)
    {
      return 1994;
    }
    if (y >=455 && y<= 520)
    {
      return 1999;
    }
    if (y >=585 && y<=650)
    {
      return 2004;
    }
    if (y>=715 && y <=780)
    {
      return 2009;
    }
  }
  //gives a way to tell if the user clicked on a button of white space
  return 0;
}

