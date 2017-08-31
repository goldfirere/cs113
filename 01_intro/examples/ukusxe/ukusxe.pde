
/*****************************************
 * Assignment 4
 *
 * A data visualization of GBP/USD exchange values on a weekly basis over the past 5 years (Oct 28 2011 to Oct 28 2016). I was inspired by how the GBP value plunged after Brexit, and wanted to depict it. I obtained the data set from ST.LOUIS FED (https://fred.stlouisfed.org/series/DEXUSUK). For this assignment I used the Processing reference a lot, and it was extremely helpful. I am glad the visualization comes out as expected. I really enjoy it!
 *
 *****************************************/

//various strings to store data
float[]g_values; // exchange values
float[]x_value; 
float[]y_value; // x,y coordinates of certain values
int[]month; //month
int[]year; //date
String[]lines; //the data set
String[]date;  // full date

float minValue, maxValue; //min and max of exchange values
int X1, Y1, X2, Y2; // coordinates for the map

void setup()
{
  //declare arrays
  lines = loadStrings("DEXUSUK.csv");
  lines = subset(lines, 1);
  g_values = new float[lines.length];
  month = new int[lines.length];
  year = new int[lines.length];
  date= new String[lines.length];
  x_value = new float[lines.length];
  y_value = new float[lines.length];

  //
  for (int i=0; i<lines.length; i++)
  {
    String[]fields = split(lines[i], ","); //full data without comma
    g_values[i]=float(fields[1]); 
    date[i]=fields[0];

    String[]fields2=splitTokens(fields[0], "/"); //date without slash
    month[i]=int(fields2[0]);
    year[i]=int(fields2[2]);
  }


  //setup sketch
  size(1200, 500);
  background(215, 222, 227, 50);

  // set variables
  X1=80; 
  Y1=75;
  X2=width-60;
  Y2=height-Y1;

  maxValue=max(g_values);
  minValue=min(g_values);


  // title + labels
  fill(0);
  textSize(32);
  text("U.S./U.K.Foreign Exchange Rate", 20, 50);
  textSize(16);
  text("Weekly Average(Friday) From 10/28/2011 To 10/28/2016", width-500, 60);
  fill(0);
  textSize(11);
  text("Source: FEDERAL RESERVE BANK OF ST.LOUIS(fred.stlouisfed.org)", width-400, height-20);
  //vertical text
  pushMatrix();
  translate(30, height-120);
  rotate(-PI/2);
  textSize(16);
  text("U.S.Dollars to One British Pound", 0, 0);
  popMatrix();
}

void draw()
{
  //graph border
  rectMode(CORNERS);
  noStroke();
  fill(255);
  rect(X1, Y1, X2, Y2);


  lineGraph(g_values, minValue, maxValue);

  dateLabel(lines);
  valueLabel(minValue, maxValue);


  interaction(g_values, minValue, maxValue);
}

// function to draw a line graph 
void lineGraph(float[]data, float yMin, float yMax)
{
  stroke(16, 125, 157);
  strokeWeight(2.5);
  beginShape();
  for (int i=0; i<data.length; i++)
  {
    float x = map(i, 0, data.length-1, X1, X2);
    float y = map(data[i], yMin, yMax, Y2, Y1);
    vertex(x, y);
  }
  endShape();
}

//function to draw date labels along the x axis
void dateLabel(String[]data)
{
  //starting from month[10] - the start of new year 2012 to 6 months apart (26 weeks)
  for (int i=10; i<data.length; i+=26)
  {
    float x=map(i, 0, data.length-1, X1, X2);
    fill(16, 125, 157);
    textSize(12);
    // text containing month and year
    text(month[i]+"/"+year[i], x-20, Y2+30);
    stroke(16, 125, 157);
    strokeWeight(1);
    line(x, Y2, x, Y2+10);
  }
}

// function to draw value labels along y axis
void valueLabel(float xMin, float xMax)
{
  for (float i=round (xMin); i<xMax; i+=0.1)
  {
    float y = map(i, xMin, xMax, Y2, Y1);
    fill(16, 125, 157);
    text(i, X1-40, y);
    stroke(16, 125, 157, 60);
    line(X1+1, y, X2-2, y);
  }
}

//function for user interaction: when the mouse hovers over certain set x_value, text including dates and cooresponding exchange values will appear
void interaction(float[]data, float yMin, float yMax)
{
  clip(X1, Y1, X2-X1, Y2-Y1); //limit the border so the image drawn won't cross it

  for (int i=0; i<data.length-1; i++)
  {
    x_value[i]=map(i, 0, data.length, X1, X2);
    y_value[i]=map(data[i], yMin, yMax, Y2, Y1);
    if (mouseX>=x_value[i]&& mouseX<=x_value[i+1]  && mouseY>=Y1 && mouseY<=Y2)
    {
      //a line and highlighted point over the value will appear
      stroke(16, 125, 157, 80);
      strokeWeight(2);
      line(mouseX, Y1+1, mouseX, Y2-2);
      fill(16, 125, 127);
      strokeWeight(2);
      stroke(255);
      ellipse(mouseX, y_value[i], 10, 10);
      noStroke();
      fill(16, 125, 157, 20);
      ellipse(mouseX, y_value[i], 30, 30);

      fill(0);
      //the text changes side when the mouse moves pass a certain point
      if (i>=230)
      {
        fill(0);
        text(date[i]+ "   "+ data[i], mouseX-120, Y2-80);
        //this is to clean the background
        fill(215, 222, 227, 50);
        text(date[i]+ "   "+ data[i], mouseX-120, Y2-80);
      } else 
      {   
        fill(0);
        text(date[i]+ "   "+ data[i], mouseX+10, Y2-80);
        //to clean the background
        fill(215, 222, 227, 50);
        text(date[i]+ "   "+ data[i], mouseX+10, Y2-80);
      }
    }
  }
}

