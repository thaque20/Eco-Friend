void DHT_INPUT(){
  //  delay(dht.getMinimumSamplingPeriod()+500);

  humidity = dht.getHumidity();
  temperature = dht.getTemperature();
}

void MOIST_INPUT(){
  mVal = analogRead(mPin);
  if(mVal > WaterValue && mVal < (WaterValue + intervals)) {
    mRes = "Very Wet";
  }
  else if(mVal > (WaterValue + intervals) && mVal < (AirValue - intervals)) {
    mRes = "Wet";
  }
  else if(mVal < AirValue && mVal > (AirValue - intervals)) {
    mRes = "Dry";
  }  
}

void LIGHT_INPUT(){
  lux = LightSensor.GetLightIntensity();
}
