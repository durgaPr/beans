package com.bike;

public class Bikes {
   private String id;
   private String make;
   private String engineCC;
public String getId() {
	return id;
}
public void setId(String id) {
	this.id = id;
}
public String getMake() {
	return make;
}
public void setMake(String make) {
	this.make = make;
}
public String getEngineCC() {
	return engineCC;
}
public void setEngineCC(String engineCC) {
	this.engineCC = engineCC;
}
   //to string
@Override
public String toString() {
	return "Bike [id=" + id + ", name=" + make + ", engineCC=" + engineCC + "]";
}
   
   
}
