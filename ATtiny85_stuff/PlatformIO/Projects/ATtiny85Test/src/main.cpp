#include <Arduino.h>

// put function declarations here:
int myFunction(int, int);

#define RED 0
#define YELLOW 1
#define GREEN 2
#define YELLOWBLINKING 3

void setup() {
  // put your setup code here, to run once:
  int result = myFunction(2, 3);
  pinMode(PB3, OUTPUT);
  pinMode(PB1, OUTPUT);
  pinMode(PB0, OUTPUT);
}

void loop () {
  static int state = RED;
  static unsigned long startTime = millis();
  switch(state){
    case RED:
      digitalWrite(PB3, HIGH);

      if (millis() - startTime > 3000) { // after 1.5 seconds
        digitalWrite(PB3, LOW);
        state = GREEN;
        startTime = millis(); // reset timer
      }
      break;
    case YELLOW:
      digitalWrite(PB1, HIGH);

      if (millis() - startTime > 1000) { // after 1.5 seconds
            digitalWrite(PB1, LOW);
            state = YELLOWBLINKING;
            startTime = millis(); // reset timer
          }
      
      break;
    case GREEN:
    
      digitalWrite(PB0, HIGH);

        if (millis() - startTime > 2000) { // after 1.5 seconds
          digitalWrite(PB0, LOW);
          state = YELLOW;
          startTime = millis(); // reset timer
        }
          
      break;
    case YELLOWBLINKING:
        
        static int blinks = 0;
        if(blinks != 5){
          if (blinks % 2 == 0){
            digitalWrite(PB1, LOW);
          } else{
            digitalWrite(PB1, HIGH);
          }
          
          
          if (millis() - startTime > 500) { // after 1.5 seconds
            
            blinks +=1;
            startTime = millis(); // reset timer
          }
        } else{
          digitalWrite(PB1, LOW);
          blinks = 0;
          state=RED;
        }
        

        break;
  }
  
}

// put function definitions here:
int myFunction(int x, int y) {
  return x + y;
}